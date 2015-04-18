/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;

@ActionID(
        category = "File",
        id = "m1.pi.ChargerAction"
)
@ActionRegistration(
        iconBase = "m1/pi/charger.png",
        displayName = "#CTL_ChargerAction"
)
@ActionReference(path = "Menu/File", position = 1)
@Messages("CTL_ChargerAction=Charger...")
public final class ChargerAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        Runnable myRunnable = new Runnable()
        {
            public void run()
            {
                ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Please wait....");
                myProgressHandle.start();
                try {
                    //DO TASK HERE
                    Thread.sleep(4500);
                } catch (InterruptedException ex) {
                    Exceptions.printStackTrace(ex);
                }
                myProgressHandle.progress("Doing task...");
            
                myProgressHandle.finish();
            }
        };
        RequestProcessor.Task myTask = RequestProcessor.getDefault().post(myRunnable);
    }
}
