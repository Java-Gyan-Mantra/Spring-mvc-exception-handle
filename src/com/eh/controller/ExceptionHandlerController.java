package com.eh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eh.service.FunService;
import com.eh.service.InvalidAgeException;

@Controller
public class ExceptionHandlerController {

	@Autowired(required = true)
	private FunService funService;

	@RequestMapping("/match.mvc")
	public String findResult() {
		return "hello";
	}

	@RequestMapping("/exception.mvc")
	public String showIfException(Model model, @RequestParam("age") int age)
			throws InvalidAgeException {
		String message = funService.MarriageCalculator(age);
		if (message.equalsIgnoreCase("Eligible For Marriage")
				|| message.equalsIgnoreCase("Not Eligible For Marriage")) {
			String Response = "Congrats!!";
			model.addAttribute("Response", Response);
			return "success";

		} else {
			return "exception";
		}
	}

}
