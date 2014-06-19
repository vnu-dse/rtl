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

// $Id: MObjectRestorationStatement.java 3330 2012-05-09 15:07:22Z green $

package org.tzi.use.uml.sys.soil;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MObjectState;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.StatementEvaluationResult;
import org.tzi.use.uml.sys.MSystemState.DeleteObjectResult;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;

/**
 * TODO
 * 
 * @author Daniel Gent
 * 
 */
public class MObjectRestorationStatement extends MStatement {
    /** TODO */
    private DeleteObjectResult fDeleteObjectResult;
    /** TODO */
    private Map<MObject, List<String>> fUndefinedTopLevelReferences;

    /**
     * 
     * @param deleteObjectResult
     * @param undefinedTopLevelReferences
     */
    public MObjectRestorationStatement(DeleteObjectResult deleteObjectResult,
            Map<MObject, List<String>> undefinedTopLevelReferences) {

        fDeleteObjectResult = deleteObjectResult;
        fUndefinedTopLevelReferences = undefinedTopLevelReferences;
    }

    @Override
    public void execute(SoilEvaluationContext context, StatementEvaluationResult result)
            throws EvaluationFailedException {

        // restore objects
        Set<MObjectState> removedObjectStates = fDeleteObjectResult.getRemovedObjectStates();

        for (MObjectState objectState : removedObjectStates) {
            try {
                context.getState().restoreObject(objectState);
                result.getStateDifference().addNewObject(objectState.object());
            } catch (MSystemException e) {
                throw new EvaluationFailedException(this, e);
            }
        }

        // restore links
        Set<MLink> removedLinks = fDeleteObjectResult.getRemovedLinks();

        for (MLink link : removedLinks) {
            context.getState().insertLink(link);
            result.getStateDifference().addNewLink(link);
        }

        // restore top level variables
        Set<Entry<MObject, List<String>>> undefinedVariables = fUndefinedTopLevelReferences
                .entrySet();
        for (Entry<MObject, List<String>> entry : undefinedVariables) {
            Value value = entry.getKey().value();
            for (String name : entry.getValue()) {
                context.getVarEnv().assign(name, value);
            }
        }
    }

    @Override
    protected String shellCommand() {
        return "<object restoration>";
    }

    @Override
    public String toString() {
        return shellCommand();
    }
}
