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

// $Id: ExpTupleSelectOp.java 2438 2011-08-30 14:40:30Z lhamann $

package org.tzi.use.uml.ocl.expr;

import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.value.TupleValue;
import org.tzi.use.uml.ocl.value.UndefinedValue;
import org.tzi.use.uml.ocl.value.Value;

/**
 * Attribute operation on objects.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public final class ExpTupleSelectOp extends Expression {
    private TupleType.Part fPart;
    private Expression fTupleExp;
    
    public ExpTupleSelectOp(TupleType.Part part, Expression tupleExp) {
        super(part.type(), tupleExp);
        fPart = part;
        fTupleExp = tupleExp;
        if (! tupleExp.type().isTupleType(false) )
            throw new IllegalArgumentException("Target expression of tuple selection operation " +
                                               "must have tuple type, found `" + 
                                               fTupleExp.type() + "'.");
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        fTupleExp.toString(sb);
        sb.append(".");
        return sb.append(fPart.name());
    }
    
    /**
     * Evaluates expression and returns result value.
     */
    public Value eval(EvalContext ctx) {
        ctx.enter(this);
        Value res = UndefinedValue.instance;
        Value val = fTupleExp.eval(ctx);
        if (! val.isUndefined() ) {
            TupleValue tupleVal = (TupleValue) val;
            res = tupleVal.getElementValue(fPart.name());
        }
        ctx.exit(this, res);
        return res;
    }

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.ocl.expr.Expression#processWithVisitor(org.tzi.use.uml.ocl.expr.ExpressionVisitor)
	 */
	@Override
	public void processWithVisitor(ExpressionVisitor visitor) {
		visitor.visitTupleSelectOp(this);
	}
}

