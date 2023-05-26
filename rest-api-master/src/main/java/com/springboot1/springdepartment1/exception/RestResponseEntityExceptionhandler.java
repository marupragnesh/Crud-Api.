package com.springboot1.springdepartment1.exception;

import com.springboot1.springdepartment1.entity.Department;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// this controller advice scope is global - but you can customize
@RestControllerAdvice
// jyare pan exception occur thase controller ma ae ahiya call thase and aa class execute kari ne responce karse

@ResponseStatus // give response status like 404
public class RestResponseEntityExceptionhandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage>  ResponseEntityExceptionHandler(DepartmentNotFoundException exception, WebRequest request)
    {
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

}
