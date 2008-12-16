/*
 * Copyright 2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package sun.awt.peer.cacio;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Point;
import java.awt.image.ColorModel;
import java.util.LinkedList;

public interface ManagedWindowContainer extends BaseWindow {

    /**
     * Adds a child window to this container. This will be the topmost
     * window in the stack.
     *
     * @param child the window to add
     */
    void add(ManagedWindow child);

    /**
     * Removes a child window from this container.
     *
     * @param child the window to be removed
     */
    void remove(ManagedWindow child);

    LinkedList<ManagedWindow> getChildren();

    /**
     * Returns the location of the specified child window relative to
     * the screen (== outermost container).
     *
     * @param child the child to find the screen location of
     *
     * @return the location of the specified child on screen
     */
    Point getLocationOnScreen(ManagedWindow child);

    /**
     * Processes and dispatches the incoming event. This should include
     * finding and setting the correct source window, synthesizing additional
     * required events (i.e. focus events) and eventually posting the event
     * to the AWT event queue.
     *
     * @param event the event to dispatch
     */
    void dispatchEvent(EventData event);

    void setVisible(ManagedWindow child, boolean v);
}
