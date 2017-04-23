package com.eh.service;

import org.springframework.stereotype.Service;

@Service
public class FunService {

	public String MarriageCalculator(int age) throws InvalidAgeException {
		String message = "";
		switch (age) {
		case 23:
			message = "Eligible For Marriage";
			break;
		case 50:
			message = "Not Eligible For Marriage";
			break;
		case 18:
			throw new InvalidAgeException("Age Is Not Match Wait 4 yr");
		}
		return message;
	}

}
