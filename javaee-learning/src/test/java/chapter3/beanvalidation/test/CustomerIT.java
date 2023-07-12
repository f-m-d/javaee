/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3.beanvalidation.test;

import chapter3.beanvalidation.Customer;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author dauri
 */
public class CustomerIT {
    
    private static ValidatorFactory validatorFactory;
    private static Validator validator;
    
    @BeforeClass
    public static void init(){
        
        // Why in the hell it is no validation factory method???
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }
    
    @AfterClass
    public static void close(){
        validatorFactory.close();
    }
    
    
    @Test
    public void shouldRaiseNoConstraintViolation(){
        Customer customer = new Customer("John","Wick","jwick@gmail.com");
        
        Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
        assertEquals(0,violations.size());
    }
    
    
    
    @Test
    public void shouldRaiseConstraintViolationCauseInvalidEmail(){
        Customer customer = new Customer("John","Wick","dummyemail");
        
        Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
        
        assertEquals(1, violations.size());
        assertEquals("invalid email address", violations.iterator().next().getMessage());
        // On the book is bad written: the expected value is obviously ... dummyemail , not "dummy"
        assertEquals("dummyemail", violations.iterator().next().getInvalidValue());
        assertEquals("{chapter3.beanvalidation.CustomEmailConstraint.message}", violations.iterator().next().getMessageTemplate());
    }

}
