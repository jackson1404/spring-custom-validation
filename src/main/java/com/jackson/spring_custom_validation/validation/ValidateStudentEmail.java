package com.jackson.spring_custom_validation.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = StudentEmailValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateStudentEmail {

    String message() default "Email must be valid and end with .edu.com";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
