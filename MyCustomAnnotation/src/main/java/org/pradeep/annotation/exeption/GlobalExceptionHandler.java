package org.pradeep.annotation.exeption;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> handleMethodArgumentException(MethodArgumentNotValidException exception) {
		Map<String, String> m = new HashMap<>();

//		m.put("error msg", "pls check field validations");
		exception.getBindingResult().getFieldErrors().forEach(error -> {
			m.put(error.getField(), error.getDefaultMessage());
		});

		return m;
	}
}
