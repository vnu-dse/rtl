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

// $Id: IntegerType.java 2740 2011-11-14 16:19:34Z lhamann $

package org.tzi.use.uml.ocl.type;

import java.util.HashSet;
import java.util.Set;

/**
 * The OCL Integer type.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public final class IntegerType extends BasicType {

    IntegerType() {
        super("Integer");
    }
    
    public boolean isNumber() {
    	return true;
    }
    
    public boolean isInteger() {
    	return true;
    }
    
    /** 
     * Returns true if this type is a subtype of <code>t</code>. 
     */
    public boolean isSubtypeOf(Type t) {
        return !t.isVoidType() && (t.isNumber() || t.isTrueOclAny());
    }

    /** 
     * Returns the set of all supertypes (including this type).
     */
    public Set<Type> allSupertypes() {
        Set<Type> res = new HashSet<Type>(3);
        res.add(TypeFactory.mkOclAny());
        res.add(TypeFactory.mkReal());
        res.add(this);
        return res;
    }
}
