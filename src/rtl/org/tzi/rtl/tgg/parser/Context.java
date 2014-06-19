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

// $Id: Context.java 61 2008-04-11 11:52:15Z opti $

package org.tzi.rtl.tgg.parser;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.tzi.use.parser.ExprContext;
import org.antlr.runtime.Token;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.parser.Symtable;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.ocl.value.VarBindings;
import org.tzi.use.uml.sys.MSystemState;


/**
 * Context information available when walking the abstract syntax tree.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
// the context for tggdiagram rules - hanhdd
public class Context {
    /**
	 * @uml.property  name="fVarTable"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Symtable fVarTable; // declared variable names
    /**
	 * @uml.property  name="fTypeTable"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Symtable fTypeTable; // declared type names
    // implicit context for some expressions (self or element variable
    // in iterate-based expressions)
    /**
	 * @uml.property  name="fExprContext"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private ExprContext fExprContext; 
    /**
	 * @uml.property  name="fErrorCount"
	 */
    private int fErrorCount;
    /**
	 * @uml.property  name="fFilename"
	 */
    private String fFilename;
    /**
	 * @uml.property  name="fErr"
	 */
    private PrintWriter fErr;
    /**
	 * @uml.property  name="fModel"
	 * @uml.associationEnd  
	 */
    private MModel fModel;
    /**
	 * @uml.property  name="fCurrentClass"
	 * @uml.associationEnd  
	 */
    private MClass fCurrentClass;
    /**
	 * @uml.property  name="fModelFactory"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private ModelFactory fModelFactory;
    /**
	 * @uml.property  name="fCurrentSystemState"
	 * @uml.associationEnd  
	 */
    private MSystemState fCurrentSystemState; // the LHS or RHS of the tggdiagram rule
    /**
	 * @uml.property  name="fSystemState_LHS"
	 * @uml.associationEnd  
	 */
    private MSystemState fSystemState_LHS; // the LHS of the tggdiagram rule
    /**
	 * @uml.property  name="fSystemState_RHS"
	 * @uml.associationEnd  
	 */
    private MSystemState fSystemState_RHS; // the RHS of Tgg rules
    /**
	 * @uml.property  name="fIsDeletingRule"
	 */
    private boolean fIsDeletingRule; // checking if it is a deleting rule.
    /**
	 * @uml.property  name="fInsidePostCondition"
	 */
    private boolean fInsidePostCondition;
    /**
	 * @uml.property  name="fLoopVarNames"
	 */
	@SuppressWarnings("unchecked")
	private List fLoopVarNames;  // (String)
    
    // for UML AL
    /**
	 * @uml.property  name="fIsSideEffectFree"
	 */
    private boolean fIsSideEffectFree;

    @SuppressWarnings("unchecked")
	public Context(String filename, PrintWriter err, 
                   VarBindings globalBindings,
                   ModelFactory factory) {
        fFilename = filename;
        fErr = err;
        fVarTable = new Symtable(globalBindings);
        fTypeTable = new Symtable();
        fExprContext = new ExprContext();
        fModelFactory = factory;
        fLoopVarNames = new ArrayList();
        fIsSideEffectFree = true;
     }


    @SuppressWarnings("unchecked")
	public List loopVarNames() {
        return fLoopVarNames;
    }

    public String filename() {
        return fFilename;
    }

    public ModelFactory modelFactory() {
        return fModelFactory;
    }

    public Symtable varTable() {
        return fVarTable;
    }

    public Symtable typeTable() {
        return fTypeTable;
    }

    public ExprContext exprContext() {
        return fExprContext;
    }

    public void setModel(MModel model) {
        fModel = model;
    }

    public MModel model() {
        return fModel;
    }

    public void setSystemState_LHS(MSystemState systemState) {
        fSystemState_LHS = systemState;
    }
    
    public void setSystemState_RHS(MSystemState systemState) {
        fSystemState_RHS = systemState;
    }

    public MSystemState systemState() {
        return fCurrentSystemState;
    }
    
    public void setIsDeletingRule(boolean isDeletingRule){
    	fIsDeletingRule = isDeletingRule;
    }
    public boolean isDeletingRule(){
    	return fIsDeletingRule;
    }

    public void setCurrentClass(MClass cls) {
        fCurrentClass = cls;
    }

    public MClass currentClass() {
        return fCurrentClass;
    }

    public void setInsidePostCondition(boolean state) {
        fInsidePostCondition = state;
    }

    public boolean insidePostCondition() {
        return fInsidePostCondition;
    }

    public int errorCount() {
        return fErrorCount;
    }

    public void reportWarning(Token t, String msg) {
        fErr.println(fFilename + ":" + t.getLine() + ": Warning: " + msg);
    }
    
    public void reportError(Token t, String msg) {
        fErrorCount++;
        fErr.println(fFilename + ":" + t.getLine() + ":" + msg);
    }
    
    public void reportError(Token t, Exception ex) {
        reportError(t, ex.getMessage());
    }
    
    public void reportError(SemanticException ex) {
        fErrorCount++;
        fErr.println(ex.getMessage());
    }
    

    // for UML AL
    public boolean isSideEffectFree() {
        return fIsSideEffectFree;
    }

    // for UML AL
    public void setIsSideEffectFree(boolean b) {
        fIsSideEffectFree = b;
    }

	public void setLHS_CurrentSystemState() {		
		// TODO Auto-generated method stub
		fCurrentSystemState = fSystemState_LHS;
	}
	
		// TODO Auto-generated method stub
	public void setRHS_CurrentSystemState() {		
		fCurrentSystemState = fSystemState_RHS;
	}


	/**
	 * @return the fCurrentSystemState
	 */
	public MSystemState getfCurrentSystemState() {
		return fCurrentSystemState;
	}


	/**
	 * @param fCurrentSystemState the fCurrentSystemState to set
	 */
	public void setfCurrentSystemState(MSystemState fCurrentSystemState) {
		this.fCurrentSystemState = fCurrentSystemState;
	}


	/**
	 * @return the fSystemState_LHS
	 */
	public MSystemState getfSystemState_LHS() {
		return fSystemState_LHS;
	}


	/**
	 * @param fSystemState_LHS the fSystemState_LHS to set
	 */
	public void setfSystemState_LHS(MSystemState fSystemState_LHS) {
		this.fSystemState_LHS = fSystemState_LHS;
	}


	/**
	 * @return the fSystemState_RHS
	 */
	public MSystemState getfSystemState_RHS() {
		return fSystemState_RHS;
	}


	/**
	 * @param fSystemState_RHS the fSystemState_RHS to set
	 */
	public void setfSystemState_RHS(MSystemState fSystemState_RHS) {
		this.fSystemState_RHS = fSystemState_RHS;
	}


	/**
	 * @return the fErr
	 */
	public PrintWriter getfErr() {
		return fErr;
	}


	/**
	 * @param fErr the fErr to set
	 */
	public void setfErr(PrintWriter fErr) {
		this.fErr = fErr;
	}

}
