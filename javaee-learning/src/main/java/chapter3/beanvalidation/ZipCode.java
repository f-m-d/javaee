/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Bean_Validation/Constraint.java to edit this template
 */
package chapter3.beanvalidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author dauri
 */
@Documented
@Constraint(validatedBy = ZipCodeValidator.class)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER ,ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ZipCode {

    String message() default "{chapter3.beanvalidation.ZipCode.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
 
    
    
    @Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER ,ElementType.FIELD, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List{
        ZipCode[] value();
    }
}
