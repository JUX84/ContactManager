/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.awt.Component;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author uapv1202114
 */
@ServiceProvider (service=MyStatusLineElementProvider.class)
public class MyStatusLineElementProvider implements org.openide.awt.StatusLineElementProvider {

    @Override
    public Component getStatusLineElement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
