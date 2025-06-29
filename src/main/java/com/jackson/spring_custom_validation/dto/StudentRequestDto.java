package com.jackson.spring_custom_validation.dto;

import com.jackson.spring_custom_validation.validation.ValidateStudentEmail;
import lombok.Data;

@Data
public class StudentRequestDto {


    private String studentName;

    @ValidateStudentEmail
    private String studentEmail;
}
