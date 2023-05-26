package com.springboot1.springdepartment1.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter

public class ErrorMessage {
    private HttpStatus status;
    private String message;

//
}
