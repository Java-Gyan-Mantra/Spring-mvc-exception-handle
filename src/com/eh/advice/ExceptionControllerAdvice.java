package com.eh.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.eh.service.InvalidAgeException;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(InvalidAgeException.class)
	public ModelAndView exception(InvalidAgeException e) {
		ModelAndView mav = new ModelAndView("exception");
		mav.addObject("name", e.getClass().getSimpleName());
		mav.addObject("message", e.getMessage());
		return mav;

	}
}
