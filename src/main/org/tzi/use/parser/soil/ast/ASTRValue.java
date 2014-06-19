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

// $Id: ASTRValue.java 2747 2011-11-25 14:53:17Z lhamann $

package org.tzi.use.parser.soil.ast;

import org.tzi.use.uml.sys.soil.MRValue;
import org.tzi.use.util.soil.exceptions.CompilationFailedException;


/**
 * 
 * @author Daniel Gent
 *
 */
public abstract class ASTRValue {
	/** TODO */
	protected ASTStatement fParent;	
	
	/**
	 * TODO
	 * @return
	 * @throws CompilationFailedException 
	 */
	public MRValue generate(
			ASTStatement parent) throws CompilationFailedException {
		
		fParent = parent;
		
		return generate();
	}
	
	/**
	 * TODO
	 * @return
	 * @throws CompilationFailedException 
	 */
	protected abstract MRValue generate() throws CompilationFailedException;
		
	
	@Override
	public abstract String toString();
}
