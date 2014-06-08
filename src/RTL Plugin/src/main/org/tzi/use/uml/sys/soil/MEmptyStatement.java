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

// $Id: MEmptyStatement.java 3330 2012-05-09 15:07:22Z green $

package org.tzi.use.uml.sys.soil;

import org.tzi.use.uml.sys.StatementEvaluationResult;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;


/**
 * TODO
 * @author Daniel Gent
 *
 */
public class MEmptyStatement extends MStatement {
	/** TODO */
	private static MEmptyStatement INSTANCE = new MEmptyStatement();

	
	/**
	 * TODO
	 */
	private MEmptyStatement() {
		
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public static MEmptyStatement getInstance() {
		return INSTANCE;
	}

	
	
	@Override
    public void execute(SoilEvaluationContext context,
			StatementEvaluationResult result) throws EvaluationFailedException {
		
	}
	
	
	@Override
	protected String shellCommand() {
		return "";
	}
	

	@Override
	public String toString() {
		return "<empty>";
	}
}
