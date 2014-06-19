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

// $Id: StatementEvaluationResult.java 3330 2012-05-09 15:07:22Z green $

package org.tzi.use.uml.sys;

import java.util.ArrayList;
import java.util.List;

import org.tzi.use.uml.sys.events.Event;
import org.tzi.use.uml.sys.soil.MSequenceStatement;
import org.tzi.use.uml.sys.soil.MStatement;
import org.tzi.use.util.soil.StateDifference;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;

/**
 * Captures additional information about the execution of a statement, 
 * for example to realize undo / redo and to feed state change listeners. 
 * 
 * @author Fabian Buettner
 * @author Daniel Gent
 */
public class StatementEvaluationResult {
	private MStatement fEvaluatedStatement;
	private StateDifference fStateDifference = new StateDifference();
	private MSequenceStatement fInverseStatement = new MSequenceStatement();
	private EvaluationFailedException fException = null;
	private List<Event> fEvents = new ArrayList<Event>();
	

	/**
	 * TODO
	 * @param statement The (top-level) statement that is / has been executed
	 */
	public StatementEvaluationResult(MStatement statement) {
		fEvaluatedStatement = statement;
	}
	

	/**
	 * TODO
	 * @return
	 */
	public boolean wasSuccessfull() {
		return fException == null;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public MStatement getEvaluatedStatement() {
		return fEvaluatedStatement;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public StateDifference getStateDifference() {
		return fStateDifference;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public MSequenceStatement getInverseStatement() {
		return fInverseStatement;
	}


	/**
	 * TODO
	 * @param statement
	 */
	public void prependToInverseStatement(MStatement statement) {
		fInverseStatement.prependStatement(statement);
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public EvaluationFailedException getException() {
		return fException;
	}
	
	
	/**
	 * TODO
	 * @param exception
	 */
	public void setException(EvaluationFailedException exception) {
		fException = exception;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public List<Event> getEvents() {
		return fEvents;
	}
	
	
	/**
	 * TODO
	 * @param event
	 */
	public void appendEvent(Event event) {
		fEvents.add(event);
	}
}
