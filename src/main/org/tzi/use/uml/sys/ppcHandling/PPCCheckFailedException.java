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

// $Id: PPCCheckFailedException.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.uml.sys.ppcHandling;

import org.tzi.use.uml.sys.MOperationCall;


/**
 * TODO
 * @author Daniel Gent
 *
 */
public abstract class PPCCheckFailedException extends Exception {
	/** TODO */
	private static final long serialVersionUID = 1L;
	/** TODO */
	private MOperationCall fCulprit;
	
	
	/**
	 * TODO
	 * @param culprit
	 */
	public PPCCheckFailedException(MOperationCall culprit) {
		fCulprit = culprit;
	}
	
	
	/**
	 * TODO
	 * @param culprit
	 * @param message
	 */
	public PPCCheckFailedException(MOperationCall culprit, String message) {
		super(message);
		fCulprit = culprit;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public MOperationCall getCulprit() {
		return fCulprit;
	}
}
