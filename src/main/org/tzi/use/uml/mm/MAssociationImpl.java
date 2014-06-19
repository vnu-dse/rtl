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

// $Id: MAssociationImpl.java 2781 2011-12-12 16:48:51Z green $

package org.tzi.use.uml.mm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** 
 * An association connects two or more classes.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
class MAssociationImpl extends MModelElementImpl implements MAssociation {
    private List<MAssociationEnd> fAssociationEnds;
    private int fPositionInModel;
    
    private Set<MAssociation> subsets = new HashSet<MAssociation>();
    private Set<MAssociation> subsettedBy = new HashSet<MAssociation>();
    
    private Set<MAssociation> redefines = new HashSet<MAssociation>();
    private Set<MAssociation> redefinedBy = new HashSet<MAssociation>();
    
    private boolean isUnion;
    
    /**
     * The association is called reflexive if any participating class
     * occurs more than once, e.g. R(C,C) is reflexive but also
     * R(C,D,C).  
     */
    private boolean fIsReflexive = false;

    /** 
     * Creates a new association. Connections to classes are
     * established by adding association ends. The kind of association
     * will be automatically determined by the kind of association
     * ends.
     */
    MAssociationImpl(String name) {
        super(name);
        fAssociationEnds = new ArrayList<MAssociationEnd>(2);
    }

    /** 
     * Adds an association end.
     *
     * @exception MInvalidModel trying to add another composition
     *            or aggregation end.
     */
    public void addAssociationEnd(MAssociationEnd aend) throws MInvalidModelException {
        if (aend.aggregationKind() != MAggregationKind.NONE )
            if (this.aggregationKind() != MAggregationKind.NONE ) 
                throw new MInvalidModelException(
                                                 "Trying to add another composition " +
                                                 "or aggregation end (`" + aend.name() +
                                                 "') to association `" + name() + "'.");

        // duplicate role names are ambiguos if they (1) refer to the
        // same class, or (2) are used in n-ary associations with n > 2
        String rolename = aend.name();
        
        for (MAssociationEnd aend2 : fAssociationEnds) {
            if (rolename.equals(aend2.name()) )
                if (fAssociationEnds.size() >= 2 || aend.cls().equals(aend2.cls()) )
                    throw new MInvalidModelException(
                                                     "Ambiguous role name `" + rolename + "'.");

            // check for reflexivity
            if (aend.cls().equals(aend2.cls()) )
                fIsReflexive = true;
        }
        
        // Set the aggregation kind if necessary
        if (this.aggregationKind == MAggregationKind.NONE)
        	this.aggregationKind = aend.aggregationKind();
        
        // Does at least one end has a qualifier?
        this.hasQualifiedEnds = this.hasQualifiedEnds || aend.hasQualifiers();
        
        fAssociationEnds.add(aend);
        aend.setAssociation(this);
    }

    /**
     * Returns the list of association ends.
     *
     * @return The list of association ends.
     */
    public List<MAssociationEnd> associationEnds() {
        return fAssociationEnds;
    }
    
    /**
     * Returns the lust of all rolen ames of the association ends.
     * @return
     */
    public List<String> roleNames() {
    	List<String> result = new ArrayList<String>(fAssociationEnds.size());
    	for (MAssociationEnd assocEnd : fAssociationEnds) {
    		result.add(assocEnd.name());
    	}
    	
    	return result;
    }

    /**
     * Returns the list of reachable navigation ends from
     * this association.
     *
     * @return List(MAssociationEnd)
     */
    public List<MNavigableElement> reachableEnds() {
        return new ArrayList<MNavigableElement>(associationEnds());
    }

    /**
     * Returns the set of association ends attached to <code>cls</code>.
     *
     * @return Set(MAssociationEnd)
     */
    public Set<MAssociationEnd> associationEndsAt(MClass cls) {
        Set<MAssociationEnd> res = new HashSet<MAssociationEnd>();

        for (MAssociationEnd aend : fAssociationEnds) {
            if (aend.cls().equals(cls) )
                res.add(aend);
        }
        return res;
    }

    /**
     * Returns the set of classes participating in this association.
     *
     * @return Set(MClass).
     */
    public Set<MClass> associatedClasses() {
        HashSet<MClass> res = new HashSet<MClass>();

        for (MAssociationEnd aend : fAssociationEnds) {
            res.add(aend.cls());
        }
        
        return res;
    }

    /**
     * Returns kind of association. This operation returns aggregate
     * or composition if one of the association ends is aggregate or
     * composition.
     */
    private int aggregationKind = MAggregationKind.NONE;
    public int aggregationKind() {
    	return aggregationKind;
    }

    /** 
     * Returns a list of association ends which can be reached by
     * navigation from the given class. Examples: 
     *
     * <ul> 
     * <li>For an association R(A,B), R.navigableEndsFrom(A)
     * results in (B).
     *
     * <li>For an association R(A,A), R.navigableEndsFrom(A) results
     * in (A,A).
     *
     * <li>For an association R(A,B,C), R.navigableEndsFrom(A) results
     * in (B,C).
     *
     * <li>For an association R(A,A,B), R.navigableEndsFrom(A) results
     * in (A,A,B).
     * </ul>
     *
     * This operation does not consider associations in which parents
     * of <code>cls</code> take part.
     *
     * @return List(MAssociationEnd)
     * @exception IllegalArgumentException cls is not part of this association.  
     */
    public List<MNavigableElement> navigableEndsFrom(MClass cls) {
        List<MNavigableElement> res = new ArrayList<MNavigableElement>();
        boolean partOfAssoc = false;
        
        for (MAssociationEnd aend : fAssociationEnds) {
            if (! aend.cls().equals(cls) )
                res.add(aend);
            else {
                partOfAssoc = true;
                if (fIsReflexive )
                    res.add(aend);
            }
        }
        if (! partOfAssoc ) 
            throw new IllegalArgumentException("class `" + cls.name() + 
                                               "' is not part of this association.");
        return res;
    }
    
    /**
     * Returns the position in the defined USE-Model.
     */
    public int getPositionInModel() {
        return fPositionInModel;
    }

    /**
     * Sets the position in the defined USE-Model.
     */
    public void setPositionInModel(int position) {
        fPositionInModel = position;
    }


    /**
     * Process this element with visitor.
     */
    public void processWithVisitor(MMVisitor v) {
        v.visitAssociation(this);
    }

    public boolean isAssignableFrom(MClass[] classes) {
        int i=0;
        for (MAssociationEnd end : fAssociationEnds) {
            if (!classes[i].isSubClassOf(end.cls())) return false;
            ++i;
        }
        return true;
    }

	@Override
	public void addSubsets(MAssociation asso) {
		subsets.add(asso);
	}

	@Override
	public Set<MAssociation> getSubsets() {
		return subsets;
	}
	
	@Override
	public Set<MAssociation> getSubsetsClosure() {
		Set<MAssociation> result = new HashSet<MAssociation>();
		
		for (MAssociation ass : getSubsets()) {
			result.add(ass);
			result.addAll(ass.getSubsetsClosure());
		}
		
		return result;
	}
	
	
	public void setUnion(boolean newValue) {
		isUnion = newValue;
	}
	
	public boolean isUnion() {
		return isUnion;
	}

	@Override
	public void addSubsettedBy(MAssociation asso) {
		this.subsettedBy.add(asso);
	}

	@Override
	public Set<MAssociation> getSubsettedBy() {
		return this.subsettedBy;
	}

	@Override
	public Set<MAssociation> getSubsettedByClosure() {
		Set<MAssociation> result = new HashSet<MAssociation>();
		
		for (MAssociation ass : getSubsettedBy()) {
			result.add(ass);
			result.addAll(ass.getSubsettedByClosure());
		}
		
		return result;
	}

	@Override
	public MAssociationEnd getAssociationEnd(MClass endCls, String rolename) {
		for (MAssociationEnd end : this.associationEndsAt(endCls)) {
			if (end.nameAsRolename().equals(rolename))
				return end;
		}
		
		return null;
	}

	@Override
	public void addRedefinedBy(MAssociation association) {
		this.redefinedBy.add(association);
	}

	@Override
	public Set<MAssociation> getRedefinedBy() {
		return this.redefinedBy;
	}
	
	@Override
	public Set<MAssociation> getRedefinedByClosure() {
		Set<MAssociation> result = new HashSet<MAssociation>();
		
		for (MAssociation ass : this.getRedefinedBy()) {
			result.add(ass);
			result.addAll(ass.getRedefinedByClosure());
		}
		
		return result;
	}
	
	@Override
	public void addRedefines(MAssociation parentAssociation) {
		this.redefines.add(parentAssociation);
	}

	@Override
	public Set<MAssociation> getRedefines() {
		return this.redefines;
	}
	
	@Override
	public Set<MAssociation> getRedefinesClosure() {
		Set<MAssociation> result = new HashSet<MAssociation>();
		
		for (MAssociation ass : this.getRedefines()) {
			result.add(ass);
			result.addAll(ass.getRedefinesClosure());
		}
		
		return result;
	}
	
	@Override
	public boolean isReadOnly() {
		if (this.isUnion) return true;
		
		for (MAssociationEnd end : fAssociationEnds) {
			if (end.isDerived()) return true;
		}
		
		return false;
	}

	private boolean hasQualifiedEnds = false;
	/* (non-Javadoc)
	 * @see org.tzi.use.uml.mm.MAssociation#hasQualifiedEnds()
	 */
	@Override
	public boolean hasQualifiedEnds() {
		return this.hasQualifiedEnds;
	}

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.mm.MAssociation#getSourceEnd(org.tzi.use.uml.mm.MClass, org.tzi.use.uml.mm.MNavigableElement, java.lang.String)
	 */
	@Override
	public MNavigableElement getSourceEnd(MClass srcClass,
			MNavigableElement dst, String explicitRolename) {
		
		for (MAssociationEnd end : this.associationEnds()) {
			if (end.equals(dst)) continue;
			
			if (srcClass.isSubClassOf(end.cls())) {
				if (explicitRolename == null) {
					return end;
				} else {
					if (end.nameAsRolename().equals(explicitRolename))
						return end;
				}
			}
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.mm.MAssociation#getParentAlignedEnds(org.tzi.use.uml.mm.MAssociation)
	 */
	//@Override
	public List<MAssociationEnd> getParentAlignedEnds(MAssociation parentAssociation) {
		List<MAssociationEnd> ownEnds = new ArrayList<MAssociationEnd>(this.associationEnds());
		
		for (MAssociationEnd parentEnd : parentAssociation.associationEnds()) {
			for (MAssociationEnd end : ownEnds) {
				if (end.getRedefinedEnds().isEmpty()) {
					
				}
			}
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.mm.MAssociation#getAllParentAssociations()
	 */
	@Override
	public Set<MAssociation> getAllParentAssociations() {
		return Collections.emptySet();
	}

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.mm.MAssociation#isOrdered()
	 */
	@Override
	public boolean isOrdered() {
		for (MAssociationEnd e : fAssociationEnds) {
			if( e.isOrdered()) return true;
		}
		return false;
	}
	

	
	
}
