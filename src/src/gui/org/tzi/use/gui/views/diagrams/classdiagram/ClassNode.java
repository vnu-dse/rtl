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

// $Id: ClassNode.java 2557 2011-09-29 12:15:42Z lhamann $

package org.tzi.use.gui.views.diagrams.classdiagram;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.List;

import org.tzi.use.gui.main.ModelBrowserSorting;
import org.tzi.use.gui.main.ModelBrowserSorting.SortChangeEvent;
import org.tzi.use.gui.main.ModelBrowserSorting.SortChangeListener;
import org.tzi.use.gui.views.diagrams.DiagramOptions;
import org.tzi.use.uml.mm.MAttribute;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MOperation;

/**
 * A node representing a class.
 * 
 * @version $ProjectVersion: 0.393 $
 * @author Fabian Gutsche
 */
public class ClassNode extends ClassifierNode implements SortChangeListener {

    private List<MAttribute> fAttributes;
    private List<MOperation> fOperations;
    
    private String[] fAttrValues;
    private Color[] fAttrColors;
    
    private String[] fOprSignatures;
    
    private Color color = null;

    ClassNode( MClass cls, DiagramOptions opt ) {
    	super(cls, opt);
        
        fAttributes = ModelBrowserSorting.getInstance()
            .sortAttributes(cls.attributes()); 
        fAttrValues = new String[fAttributes.size()];
        fAttrColors = new Color[fAttributes.size()];
        
        fOperations = cls.operations();
        fOprSignatures = new String[fOperations.size()];
        fOperations = ModelBrowserSorting.getInstance()
            .sortOperations( fOperations );
        ModelBrowserSorting.getInstance().addSortChangeListener( this );
    }
    
    /**
     * Gets the {@link MClass} represented by this class node.
     * @return The represented <code>MClass</code>
     */
    public MClass cls() {
        return (MClass)getClassifier();
    }
    
    /**
     * Gets the currently set color of the class node.
     * May be <code>null</code>.
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the color of the class node to <code>color</code>.
	 * If color is <code>null</code> the default specified in the properties file color is used.
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Sets the color of the attribute <code>attr</code> to <code>color</code>.
	 * @param att
	 * @param color
	 */
	public void setAttributeColor(MAttribute att, Color color) {
		fAttrColors[fAttributes.indexOf(att)] = color;
	}
	
	/**
	 * Resets the attribute colors to the color of the class node
	 */
	public void resetAttributeColor() {
		for (int i = 0; i < fAttrColors.length; i++) {
			fAttrColors[i] = null;
		}
	}
	
	/**
     * After the occurrence of an event the attribute list is updated.
     */
    public void stateChanged( SortChangeEvent e ) {
        fAttributes = ModelBrowserSorting.getInstance()
             .sortAttributes( fAttributes );
        fOperations = ModelBrowserSorting.getInstance()
            .sortOperations( fOperations );
    }
    
    @Override
    protected void calculateNameRectSize(Graphics2D g, Rectangle2D.Double rect) {
        Font classNameFont;
        
        if ( cls().isAbstract() ) {
            classNameFont = g.getFont().deriveFont( Font.ITALIC );
        } else {
        	classNameFont = g.getFont();
        }
        
        FontMetrics classNameFontMetrics = g.getFontMetrics( classNameFont );
        
        rect.width = classNameFontMetrics.stringWidth( fLabel );
        rect.height = classNameFontMetrics.getHeight();
    }
    
    @Override
    protected void calculateAttributeRectSize(Graphics2D g, Rectangle2D.Double rect) {
    	FontMetrics fm = g.getFontMetrics();
    	
    	for ( int i = 0; i < fAttributes.size(); i++ ) {
            MAttribute attr = (MAttribute) fAttributes.get( i );
            fAttrValues[i] = attr.toString();
            rect.width = Math.max( attributesRect.width, fm.stringWidth( fAttrValues[i] ) );
        }
    	
        rect.height = fm.getHeight() * fAttributes.size() + 4;
    }
    
    @Override
    protected void calculateOperationsRectSize(Graphics2D g, Rectangle2D.Double rect) {
    	FontMetrics fm = g.getFontMetrics();
    	
    	for ( int i = 0; i < fOperations.size(); i++ ) {
            MOperation opr = (MOperation) fOperations.get( i );
            fOprSignatures[i] = opr.signature();
            operationsRect.width = Math.max( operationsRect.width, fm.stringWidth( fOprSignatures[i] ) );
        }
    	
        operationsRect.height = fm.getHeight() * fOperations.size() + 4;
    }
        
    public String ident() {
        return "Class." + cls().name();
    }
    public String identNodeEdge() {
        return "AssociationClass." + cls().name();
    }
    
    /**
     * Draws a box with a label.
     */
    @Override
    protected void onDraw( Graphics2D g ) {
        int x = (int) getCenter().getX();
        int y;
        
        Rectangle2D currentBounds = this.getBounds();
        FontMetrics fm = g.getFontMetrics();
        
        Font oldFont = g.getFont();
        if ( cls().isAbstract() ) {
            g.setFont( oldFont.deriveFont( Font.ITALIC ) );
            fm = g.getFontMetrics();
        }
        
        int labelWidth = fm.stringWidth( fLabel );
        
        if ( isSelected() ) {
            g.setColor( fOpt.getNODE_SELECTED_COLOR() );
        } else {
        	if (getColor() != null)
        		g.setColor( getColor() );
        	else
        		g.setColor( fOpt.getNODE_COLOR() );
        }
        
        g.fill( currentBounds );
        g.setColor( fOpt.getNODE_FRAME_COLOR() );
        g.draw(currentBounds);
        
        x -= labelWidth / 2;
        y = (int)currentBounds.getY() + fm.getAscent() + 2;
        g.setColor( fOpt.getNODE_LABEL_COLOR() );
        
        g.drawString( fLabel, x, y );
        // resetting font and fontMetrics if the class was abstract
        g.setFont( oldFont );
        fm = g.getFontMetrics();
        
        if ( fOpt.isShowAttributes() ) {
            // compartment divider
        	y += 3;
            g.drawLine( (int)currentBounds.getX(), y, (int)currentBounds.getMaxX() - 1, y );
            // add insets
            x = (int)currentBounds.getX() + 5;
            
            Color orgColor = g.getColor(); 
                        
            for ( int i = 0; i < fAttributes.size(); i++ ) {
            	if (!isSelected() && fAttrColors[i] != null) {
            		int height = fm.getHeight();
            		if (i == 0) height += 2;
            		if (i == fAttributes.size() - 1) height += 2;
            		
            		g.setColor(fAttrColors[i]);
            		g.fillRect((int)currentBounds.getX() + 1, y + 1, (int)currentBounds.getWidth() - 2, height);
            		g.setColor(orgColor);
            	}
            	
                y += fm.getHeight() + (i == 0 ? 2 : 0);
                g.drawString( fAttrValues[i], x, y - fm.getDescent() );
            }
        }
        
        if ( fOpt.isShowOperations() ) {
            // compartment divider
            g.drawLine( (int)currentBounds.getX(), y + 3, (int)currentBounds.getMaxX() - 1, y + 3 );
            // add insets
            x = (int)currentBounds.getX() + 5;
            y += 3;
            for ( int i = 0; i < fOperations.size(); i++ ) {
                y += fm.getHeight();
                g.drawString( fOprSignatures[i], x, y );
            }
        }
    }
    
    @Override
    public String toString() {
    	return cls().name() + "(ClassNode)";
    }
    
    @Override
    protected String getStoreType() {
    	return "Class";
    }
}
