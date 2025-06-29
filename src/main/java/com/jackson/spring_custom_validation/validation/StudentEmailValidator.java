package com.jackson.spring_custom_validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StudentEmailValidator implements ConstraintValidator<ValidateStudentEmail, String> {

    private static final String EMAIL_PATTERN =
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.edu\\.com$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if(email == null) return false;
        return email.matches(EMAIL_PATTERN);
    }
}
