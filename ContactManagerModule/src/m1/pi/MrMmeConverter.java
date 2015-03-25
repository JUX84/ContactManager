/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

/**
 *
 * @author JUX
 */
public class MrMmeConverter extends org.jdesktop.beansbinding.Converter {

    @Override
    public Object convertForward(Object value) {
        if ((Boolean) value)
            return "Mme";
        return "Mr";
    }

    @Override
    public Object convertReverse(Object value) {
        if ((String) value == "Mme")
            return true;
        return false;
    }
}
