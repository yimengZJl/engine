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

import com.mirth.connect.client.ui.components.MirthTextInterface;
import com.mirth.connect.client.ui.util.I18n;

/** Allows for Cutting in text components. */
public class CutAction extends AbstractAction {

    MirthTextInterface comp;

    public CutAction(MirthTextInterface comp) {
        super(I18n.get("cut-action"));
        this.comp = comp;
    }

    public void actionPerformed(ActionEvent e) {
        comp.cut();
    }

    public boolean isEnabled() {
        return comp.isEditable() && comp.isEnabled() && comp.getSelectedText() != null;
    }
}
