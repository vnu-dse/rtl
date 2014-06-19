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

// $Id: ViewFrame.java 1100 2009-10-27 11:24:12Z lhamann $

package org.tzi.use.gui.main;

import java.awt.print.PageFormat;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

import org.tzi.use.config.Options;
import org.tzi.use.gui.views.PrintableView;
import org.tzi.use.gui.views.View;

/** 
 * An internal frame holding a view of a system state.
 * 
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
@SuppressWarnings("serial")
public class ViewFrame extends JInternalFrame {
    private View fView;

    public ViewFrame(String title, View view, String iconFilename) {
        super(title, true, true, true, true);
        fView = view;
        setFrameIcon(new ImageIcon(Options.iconDir + iconFilename));
    }

    void close() {
        fView.detachModel();
    }

    boolean isPrintable() {
        return fView instanceof PrintableView;
    }
    
    void print(PageFormat pf) {
        if (fView instanceof PrintableView )
            ((PrintableView) fView).printView(pf);
    }
    
    /**
     * Returns the view of this ViewFrame.
     */
    View getView() {
        return fView;
    }
}
