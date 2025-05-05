package com.edu.bms.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.edu.bms.error.GlobalException;

@ControllerAdvice
@ResponseStatus

public class RestResponseEntityExceptionalHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(GlobalException.class)
	public ResponseEntity<com.edu.bms.entites.ErrorMessage>notFoundException(GlobalException exception, WebRequest request){
		com.edu.bms.entites.ErrorMessage message = new com.edu.bms.entites.ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
}
