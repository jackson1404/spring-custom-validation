package com.jackson.spring_custom_validation.controller;

import com.jackson.spring_custom_validation.dto.StudentRequestDto;
import com.jackson.spring_custom_validation.model.StudentEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/validateStudent")
    public ResponseEntity<?> validateStudent(@RequestBody @Valid StudentRequestDto studentRequestDto) {
        // If validation passes, return success message
        return ResponseEntity.ok("Student email is valid ✅");
    }
}
