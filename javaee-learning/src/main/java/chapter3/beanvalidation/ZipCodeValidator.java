/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Bean_Validation/Validator.java to edit this template
 */
package chapter3.beanvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author dauri
 */
public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {
    
    // A zipCodeChecker should be injected, with a custom annotation @USA
    //@Inject @USA
    //private ZipCodeChecker checker;
    private Pattern zipPattern = Pattern.compile("\\d{5}(-\\d{5})?");
    
    @Override
    public void initialize(ZipCode constraintAnnotation) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        if(value == null){
            return true;
        }
        
        Matcher matcher = zipPattern.matcher(value);
        if(!matcher.matches()){
            return false;     
        }
        
        // In the book example, the validation code is not provided
        //return checker.isZipCodeValidation(value);
        return true;
    }
    
}
