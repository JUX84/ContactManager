/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jdesktop.beansbinding.Validator;

public class SourceValidator extends Validator<String> {

    @Override
    public Result validate(String value) {
       if(value == null)
            return new Result(null, "String must not be null");
        Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher matcher = pattern.matcher(value);
        if(matcher.find())
            return null;
        return new Result(value, "Ce n'est pas une adresse email");
    }
}
