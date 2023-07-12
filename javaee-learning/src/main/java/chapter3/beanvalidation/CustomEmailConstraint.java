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
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author dauri
 */
@Size(min =7)

// Quite strangely, the regex doesn't seem to be ok here....
/*@Pattern( regexp = "[a-z0-9!#$%&'*+/=?^_{|}~-]+(?:\\."
+ "[a-z0-9!#$%&'*+/=?^_{|}~-]+)*"
+ "@(?:[a-z0-9](?:a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")*/

// Found this one on StackOverflow: https://stackoverflow.com/questions/201323/how-can-i-validate-an-email-address-using-a-regular-expression
@Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
@ReportAsSingleViolation
@Constraint(validatedBy = {})

@Documented
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER ,ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)


public @interface CustomEmailConstraint {

    String message() default "{chapter3.beanvalidation.CustomEmailConstraint.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    
    @Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER ,ElementType.FIELD, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List{
        CustomEmailConstraint[] value();
    }
}
