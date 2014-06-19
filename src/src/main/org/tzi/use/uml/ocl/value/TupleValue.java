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

// $Id: TupleValue.java 2626 2011-10-19 09:19:51Z lhamann $

package org.tzi.use.uml.ocl.value;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.type.TupleType.Part;
import org.tzi.use.util.collections.CollectionComparator;

/**
 * Tuple values.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public final class TupleValue extends Value {
    /**
     * Map&lt;String, Value&gt;
     */
	private Map<String, Value> fParts = new TreeMap<String, Value>();

    /**
     * Constructs a tuple and sets all values. Elements are type checked
     * as they get inserted into the tuple.
     *
     * @param t The type of the tuple
     * @param parts Map&lt;String, Value&gt; containing the tuple parts
     * 
     * @exception IllegalArgumentException the type of at least one
     *            value does not match 
     */
    public TupleValue(TupleType t, Map<String, Value> parts) {
        super(t);
        
        Map<String, Part> typeParts = t.getParts();
        Iterator<Entry<String, Value>> iter = parts.entrySet().iterator();
        
        while(iter.hasNext())
        {
        	Map.Entry<String, Value> entry = iter.next();
        	Part typePart = typeParts.get(entry.getKey());
        	Value value = entry.getValue();
        	
            if (! value.type().isSubtypeOf(typePart.type()) )
                throw new IllegalArgumentException("type mismatch: " + 
                                                   value.type() + ", " + typePart.type());
            fParts.put(entry.getKey(), value);
        }
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Tuple{");
        boolean first = true;

        for (Map.Entry<String, Value> entry : fParts.entrySet()) {	
        	if (!first)
        		sb.append(",");
        	else
        		first = false;
        	
        	sb.append(entry.getKey());
        	sb.append("=");
        	entry.getValue().toString(sb);
        }
        
        sb.append("}");
        
        return sb;
    }

    public boolean equals(Object obj) {
        if (obj == this )
            return true;
        else if (obj instanceof TupleValue ) {
            TupleValue other = (TupleValue) obj;
            return fParts.equals(other.fParts);
        }
        return false;
    }

    public int hashCode() {
        return fParts.hashCode();
    }

    public int compareTo(Value o) {
        if (o == this )
            return 0;
        if (o instanceof UndefinedValue )
            return +1;
        if (! (o instanceof TupleValue) )
            throw new ClassCastException();
        
        TupleValue other = (TupleValue) o;
        return new CollectionComparator<Value>().compare(fParts.values(), 
                                                   other.fParts.values());
    }

    
    public Value getElementValue(String name) {
        if (fParts.containsKey(name))
        	return (Value)fParts.get(name);
        else
        	throw new IllegalArgumentException("No such element: " + name);
    }

}