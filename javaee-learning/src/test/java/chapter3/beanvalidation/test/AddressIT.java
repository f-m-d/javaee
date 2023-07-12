/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3.beanvalidation.test;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Test;
import chapter3.beanvalidation.Address;
import java.util.Set;
import javax.validation.ConstraintViolation;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author dauri
 */
public class AddressIT {
    
    
    @Test
    public void shouldRaiseConstraintViolationCauseInvalidZip(){
        
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Address address = new Address("233 Spring Street", "New York","DummyZip");
        
        Set<ConstraintViolation<Address>> validations = validator.validate(address);
        
        assertEquals(1,validations.size());
        validatorFactory.close();
        
        
    }
}
