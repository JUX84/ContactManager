/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "m1.pi.ClearAction"
)
@ActionRegistration(
        iconBase = "m1/pi/broom.png",
        displayName = "#CTL_ClearAction"
)
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_ClearAction=Clear")
public final class ClearAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}