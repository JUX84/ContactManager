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
        category = "Edit",
        id = "m1.pi.NewAction"
)
@ActionRegistration(
        iconBase = "m1/pi/add.png",
        displayName = "#CTL_NewAction"
)
@ActionReference(path = "Toolbars/File", position = 200)
@Messages("CTL_NewAction=Nouvelle fiche")
public final class NewAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
