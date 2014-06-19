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

// $Id: DirectedLineFactory.java 889 2008-04-11 11:52:15Z opti $


package org.tzi.use.gui.views.diagrams.util;

public class DirectedLineFactory {
    
    private DirectedLineFactory() {}
    
    public static I_DirectedLine createDashedDirectedLine(final int sourceX, final int sourceY, final int targetX,
                                                          final int targetY) {
        validateArguments(sourceX, sourceY, targetX, targetY);
        return new DashedDirectedLine(sourceX, sourceY, targetX, targetY);
    }

    public static I_DirectedLine createSolidDirectedLine(final int sourceX, final int sourceY, final int targetX,
                                                         final int targetY) {
        return createSolidDirectedLine((double) sourceX, (double) sourceY, (double) targetX, (double) targetY);
    }

    public static I_DirectedLine createSolidDirectedLine(final double sourceX, final double sourceY,
                                                         final double targetX, final double targetY) {
        validateArguments(sourceX, sourceY, targetX, targetY);
        return new SolidDirectedLine(sourceX, sourceY, targetX, targetY);
    }

    static void validateArguments(final double sourceX, final double sourceY, final double targetX,
                                  final double targetY) {
        if (sourceX == targetX && sourceY == targetY) {
            throw new UnsupportedOperationException("A dot is not a line.");
        }
    }
}
