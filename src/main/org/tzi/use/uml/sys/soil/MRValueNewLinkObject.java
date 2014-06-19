/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
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

// $Id: MRValueNewLinkObject.java 3330 2012-05-09 15:07:22Z green $

package org.tzi.use.uml.sys.soil;

import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.StatementEvaluationResult;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;


/**
 * TODO
 *
 */
public class MRValueNewLinkObject extends MRValue {
	/** TODO */
	private MNewLinkObjectStatement fNewLinkObjectStatement;
	
	
	/**
	 * TODO
	 * @param newLinkObjectStatement
	 */
	public MRValueNewLinkObject(
			MNewLinkObjectStatement newLinkObjectStatement) {
		
		fNewLinkObjectStatement = newLinkObjectStatement;
	}

	
	/**
	 * TODO
	 * @return
	 */
	public MNewLinkObjectStatement getNewLinkObjectStatement() {
		return fNewLinkObjectStatement;
	}
	

	@Override
	public Value evaluate(
			SoilEvaluationContext context,
			StatementEvaluationResult result,
			MStatement parent) throws EvaluationFailedException {
		
		fNewLinkObjectStatement.execute(context, result);
		
		return fNewLinkObjectStatement.getCreatedLinkObject().value();
	}


	@Override
	public Type getType() {
		return fNewLinkObjectStatement.getAssociationClass().type();
	}


	@Override
	public String toString() {
		return fNewLinkObjectStatement.shellCommand();
	}
}
