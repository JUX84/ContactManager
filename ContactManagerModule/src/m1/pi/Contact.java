/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author JUX
 */
public class Contact implements Serializable {
        
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex; // male = false, female = true
    private String mail;
    
    private PropertyChangeSupport propertySupport;
    
    public Contact() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String value) {
        String oldValue = firstName;
        firstName = value;
        propertySupport.firePropertyChange("firstName", oldValue, firstName);
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String value) {
        String oldValue = lastName;
        lastName = value;
        propertySupport.firePropertyChange("lastName", oldValue, lastName);
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int value) {
        int oldValue = age;
        age = value;
        propertySupport.firePropertyChange("age", oldValue, age);
    }
    
    
    public boolean getSex() {
        return sex;
    }
    
    public void setSex(boolean value) {
        boolean oldValue = sex;
        sex = value;
        propertySupport.firePropertyChange("sex", oldValue, sex);
    }
    
    
    public String getMail() {
        return mail;
    }
    
    public void setAge(String value) {
        String oldValue = mail;
        mail = value;
        propertySupport.firePropertyChange("mail", oldValue, mail);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
