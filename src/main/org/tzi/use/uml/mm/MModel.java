/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: MModel.java 2840 2012-01-11 14:18:35Z lhamann $

package org.tzi.use.uml.mm;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.tzi.use.graph.DirectedGraph;
import org.tzi.use.graph.DirectedGraphBase;
import org.tzi.use.uml.ocl.type.EnumType;

/**
 * A Model is a top-level package containing all other model elements.
 * 
 * @version $ProjectVersion: 0.393 $
 * @author Mark Richters
 */
public class MModel extends MModelElementImpl {
    private Map<String, EnumType> fEnumTypes;
    private Map<String, MClass> fClasses;
    private Map<String, MAssociation> fAssociations;
    private DirectedGraph<MClass, MGeneralization> fGenGraph;
    private Map<String, MClassInvariant> fClassInvariants;
    private Map<String, MPrePostCondition> fPrePostConditions;
    private String fFilename; // name of .use file

    protected MModel(String name) {
        super(name);
        fEnumTypes = new TreeMap<String, EnumType>();
        fClasses = new TreeMap<String, MClass>();
        fAssociations = new TreeMap<String, MAssociation>();
        fGenGraph = new DirectedGraphBase<MClass, MGeneralization>();
        fClassInvariants = new TreeMap<String, MClassInvariant>();
        fPrePostConditions = new TreeMap<String, MPrePostCondition>();
        fFilename = "";
    }

    public void setFilename(String filename) {
        fFilename = filename;
    }

    /**
     * Returns the filename of the specification from which this model was read.
     * May be empty if model is not constructed from a file.
     */
    public String filename() {
        return fFilename;
    }

    /**
     * Returns the directory which contains the model file,
     * if the model was loaded from a file.
     * Returns <code>null</code> if the model was not loaded from a file.
     * @return The directory containing the model file or <code>null</code> if the model was not loaded. 
     */
    public File getModelDirectory() {
    	if (fFilename == null || fFilename.equals(""))
    		return null;
    	
    	File modelFile = new File(fFilename);
    	// could be moved or deleted
    	if (!modelFile.exists())
    		return null;
    	
    	return modelFile.getParentFile();
    }
    
    /**
     * Adds a class. The class must have a unique name within the model.
     * 
     * @exception MInvalidModel
     *                model already contains a class with the same name.
     */
    public void addClass(MClass cls) throws MInvalidModelException {
        if (fClasses.containsKey(cls.name()))
            throw new MInvalidModelException("Model already contains a class `"
                    + cls.name() + "'.");
        fClasses.put(cls.name(), cls);
        fGenGraph.add(cls);
        cls.setModel(this);
    }

    /**
     * Returns the specified class.
     * 
     * @return <code>null</code> if class <code>name</code> does not exist.
     */
    public MClass getClass(String name) {
        return (MClass) fClasses.get(name);
    }

    /**
     * Returns the specified association class.
     * 
     * @return null if class <code>name</name> does not exist.
     */
    public MAssociationClass getAssociationClass(String name) {
        MClass cls = (MClass) fClasses.get(name);
        if (cls instanceof MAssociationClass) {
            return (MAssociationClass) cls;
        } else {
            return null;
        }
    }

    /**
     * Returns a collection containing all associationclasses in this model.
     * 
     * @return collection of MAssociationClass objects.
     */
    public Collection<MAssociationClass> getAssociationClassesOnly() {
        Collection<MAssociationClass> result = new ArrayList<MAssociationClass>();
        Iterator<MClass> it = fClasses.values().iterator();

        while (it.hasNext()) {
            MClass elem = it.next();
            if (elem instanceof MAssociationClass) {
                result.add((MAssociationClass)elem);
            }
        }
        return result;
    }

    /**
     * Returns a collection containing all classes in this model.
     * 
     * @return collection of MClass objects.
     */
    public Collection<MClass> classes() {
        return fClasses.values();
    }

    /**
     * Adds an association. The association must have a unique name within the
     * model.
     * 
     * @exception MInvalidModel
     *                model already contains an association with the same name.
     */
    public void addAssociation(MAssociation assoc)
            throws MInvalidModelException {
        if (assoc.associationEnds().size() < 2)
            throw new IllegalArgumentException("Illformed association `"
                    + assoc.name() + "': number of associationEnds == "
                    + assoc.associationEnds().size());

        if (fAssociations.containsKey(assoc.name()))
            throw new MInvalidModelException(
                    "Model already contains an association named `"
                            + assoc.name() + "'.");

        // check for role name conflicts: for each class the set of
        // navigable classes must have unique role names
        for (MClass cls : assoc.associatedClasses()) {
            Map<String, MNavigableElement> aends = cls.navigableEnds();
            List<String> newRolenames = new ArrayList<String>();
            
            for (MNavigableElement elem : assoc.navigableEndsFrom(cls)) {
                String newRolename = elem.nameAsRolename();
                
                // Inherited association (class)
                if (aends.containsKey(newRolename) && aends.get(newRolename).equals(elem))
                	continue;
                
                newRolenames.add( newRolename );
                
                if (aends.containsKey(newRolename)) {
                    throw new MInvalidModelException("Association end `"
                            + newRolename
                            + "' navigable from class `"
                            + cls.name()
                            + "' conflicts with same rolename in association `"
                            + ((MNavigableElement) aends.get(newRolename))
                                    .association().name() + "'.");
                }
            }
            
            // tests if the rolenames are already used in one of the subclasses
            for (MClass subCls : cls.allChildren()) {
                for ( int i = 0; i < newRolenames.size(); i++ ) {
                    String newRolename = newRolenames.get(i);
                    if ( subCls.navigableEnds().containsKey( newRolename ) ) {
                        throw new MInvalidModelException("Association end `"
                                + newRolename
                                + "' navigable from class `"
                                + subCls.name()
                                + "' conflicts with same rolename in association `"
                                + ((MNavigableElement) subCls.navigableEnds()
                                        .get( newRolename ))
                                        .association().name() + "'.");
                    }
                }
            }
        }

        // for each class register the association and the
        // reachable association ends
        for (MAssociationEnd aend : assoc.associationEnds()) {
            MClass cls = aend.cls();
            cls.registerNavigableEnds(assoc.navigableEndsFrom(cls));
        }

        fAssociations.put(assoc.name(), assoc);
    }

    /**
     * Returns a collection containing all associations in this model.
     * 
     * @return collection of MAssociation objects.
     */
    public Collection<MAssociation> associations() {
        return fAssociations.values();
    }

    /**
     * Returns the specified association.
     * 
     * @return null if association does not exist.
     */
    public MAssociation getAssociation(String name) {
        return fAssociations.get(name);
    }

    /**
     * Returns the set of all associations that exist between the specified
     * classes (inherited ones are not included). The arity of the returned
     * associations is equal to <code>classes.size()</code>.
     * 
     * @return Set(MAssociation)
     */
    public Set<MAssociation> getAssociationsBetweenClasses(Set<MClass> classes) {
        Set<MAssociation> res = new HashSet<MAssociation>();

        // search associations
        Iterator<MAssociation> assocIter = fAssociations.values().iterator();
        while (assocIter.hasNext()) {
            MAssociation assoc = assocIter.next();
            if (assoc.associatedClasses().equals(classes))
                res.add(assoc);
        }
        return res;
    }

    /**
     * Returns the set of all associations that exist between the specified
     * classes (including inherited ones). The arity of the returned
     * associations is equal to <code>classes.size()</code>.
     * 
     * @return Set(MAssociation)
     */
    public Set<MAssociation> getAllAssociationsBetweenClasses(Set<MClass> classes) {
        // NOT IMPLEMENTED YET
        return getAssociationsBetweenClasses(classes);
    }

    /**
     * Adds a generalization from <code>child</code> to <code>parent</code>
     * class.
     * 
     * @exception MInvalidModelException
     *                generalization is not well-formed, e.g., a cycle is
     *                introduced into the generalization hierarchy.
     */
    public void addGeneralization(MGeneralization gen)
            throws MInvalidModelException {
        // generalization is irreflexive
        if (gen.isReflexive())
            throw new MInvalidModelException("Class `" + gen.child()
                    + "' cannot be a superclass of itself.");

        // check for cycles that might be introduced by adding the new
        // generalization
        if (fGenGraph.existsPath(gen.parent(), gen.child()))
            throw new MInvalidModelException(
                    "Detected cycle in generalization hierarchy. Class `"
                            + gen.parent().name()
                            + "' is already a subclass of `"
                            + gen.child().name() + "'.");

        /* FIXME: check for any conflicts that might be introduced by
           the generalization: (1) attributes with same name, (2)
           inherited associations?? */

        // silently ignore duplicates
        fGenGraph.addEdge(gen);
    }

    /**
     * Returns the generalization graph of this model.
     * 
     * @return a DirectedGraph with MClass nodes and MGeneralization edges
     */
    public DirectedGraph<MClass, MGeneralization> generalizationGraph() {
        return fGenGraph;
    }

    /**
     * Adds an enumeration type.
     * 
     * @exception MInvalidModel
     *                model already contains an element with same name.
     */
    public void addEnumType(EnumType e) throws MInvalidModelException {
        if (fEnumTypes.containsKey(e.name()))
            throw new MInvalidModelException("Model already contains a type `"
                    + e.name() + "'.");
        fEnumTypes.put(e.name(), e);
    }

    /**
     * Returns an enumeration type by name.
     * 
     * @return null if enumeration type does not exist.
     */
    public EnumType enumType(String name) {
        return (EnumType) fEnumTypes.get(name);
    }

    /**
     * Returns an enumeration type for a given literal.
     * 
     * @return null if enumeration type does not exist.
     */
    public EnumType enumTypeForLiteral(String literal) {
        Iterator<EnumType> it = fEnumTypes.values().iterator();
        
        while (it.hasNext()) {
            EnumType t = (EnumType) it.next();
            if (t.contains(literal))
                return t;
        }
        return null;
    }

    /**
     * Returns a set of all enumeration types.
     */
    public Set<EnumType> enumTypes() {
        Set<EnumType> s = new HashSet<EnumType>();
        s.addAll(fEnumTypes.values());
        return s;
    }

    /**
     * Adds a class invariant. The class + invariant name must have a unique
     * name within the model.
     * 
     * @exception MInvalidModel
     *                model already contains an invariant with same name.
     */
    public void addClassInvariant(MClassInvariant inv)
            throws MInvalidModelException {
        String name = inv.cls().name() + "::" + inv.name();
        if (fClassInvariants.containsKey(name))
            throw new MInvalidModelException(
                    "Duplicate definition of invariant `" + inv.name()
                            + "' in class `" + inv.cls().name() + "'.");
        fClassInvariants.put(name, inv);
    }

    /**
     * Returns a collection containing all class invariants.
     * 
     * @return collection of MClassInvariant objects.
     */
    public Collection<MClassInvariant> classInvariants() {
        return fClassInvariants.values();
    }

    /**
     * Returns a collection containing all invariants for a given class.
     * 
     * @return collection of MClassInvariant objects.
     */
    public Set<MClassInvariant> classInvariants(MClass cls) {
        Set<MClassInvariant> res = new HashSet<MClassInvariant>();
        Iterator<MClassInvariant> it = fClassInvariants.values().iterator();
        
        while (it.hasNext()) {
            MClassInvariant inv = it.next();
            if (inv.cls().equals(cls))
                res.add(inv);
        }
        return res;
    }

    /**
     * Returns a collection containing all invariants for a given class and its
     * parents.
     * 
     * @return collection of MClassInvariant objects.
     */
    public Set<MClassInvariant> allClassInvariants(MClass cls) {
        Set<MClassInvariant> res = new HashSet<MClassInvariant>();
        Set<MClass> parents = cls.allParents();
        parents.add(cls);
        Iterator<MClassInvariant> it = fClassInvariants.values().iterator();
        
        while (it.hasNext()) {
            MClassInvariant inv = it.next();
            if (parents.contains(inv.cls()))
                res.add(inv);
        }
        return res;
    }

    /**
     * Returns the specified invariant. The name must be given as "class::inv".
     * 
     * @return null if invariant <code>name</name> does not exist.
     */
    public MClassInvariant getClassInvariant(String name) {
        return fClassInvariants.get(name);
    }

    /**
     * Adds a pre-/postcondition.
     */
    public void addPrePostCondition(MPrePostCondition ppc)
            throws MInvalidModelException {
        String name = ppc.cls().name() + "::" + ppc.operation().name()
                + ppc.name();
        if (fPrePostConditions.containsKey(name))
            throw new MInvalidModelException(
                    "Duplicate definition of pre-/postcondition `" + ppc.name()
                            + "' in class `" + ppc.cls().name() + "'.");
        fPrePostConditions.put(name, ppc);
        if (ppc.isPre())
            ppc.operation().addPreCondition(ppc);
        else
            ppc.operation().addPostCondition(ppc);
    }

    /**
     * Returns a collection containing all pre-/postconditions.
     * 
     * @return collection of MPrePostCondition objects.
     */
    public Collection<MPrePostCondition> prePostConditions() {
        return fPrePostConditions.values();
    }

    /**
     * Returns a string with some statistics about the model: Number of classes,
     * associations, invariants, and operations.
     */
    public String getStats() {
        String stats = " (";
        int n = classes().size();
        stats += n + " class";
        if (n != 1)
            stats += "es";
        n = associations().size();
        stats += ", " + n + " association";
        if (n != 1)
            stats += "s";
        n = classInvariants().size();
        stats += ", " + n + " invariant";
        if (n != 1)
            stats += "s";

        n = 0;
        Iterator<MClass> it = classes().iterator();
        while (it.hasNext()) {
            MClass cls = it.next();
            n += cls.operations().size();
        }
        stats += ", " + n + " operation";
        if (n != 1)
            stats += "s";

        n = fPrePostConditions.size();
        stats += ", " + n + " pre-/postcondition";
        if (n != 1) {
            stats += "s";
        }

        return "Model " + name() + stats + ")";
    }

    /**
     * Process this element with visitor.
     */
    public void processWithVisitor(MMVisitor v) {
        v.visitModel(this);
    }
}
