/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.client.ui.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.mirth.connect.client.ui.components.MirthSyntaxTextArea;
import com.mirth.connect.client.ui.util.I18n;

/** Allows for Redo in text components. */
public class RedoAction extends AbstractAction {

    MirthSyntaxTextArea comp;

    public RedoAction(MirthSyntaxTextArea comp) {
        super(I18n.get("redo-action"));
        this.comp = comp;
    }

    public void actionPerformed(ActionEvent e) {
        comp.redo();
    }

    public boolean isEnabled() {
        return comp.isEnabled() && comp.canRedo();
    }
}
