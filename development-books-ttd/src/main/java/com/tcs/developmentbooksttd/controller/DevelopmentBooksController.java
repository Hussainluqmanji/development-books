package com.tcs.developmentbooksttd.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class DevelopmentBooksController {

	@GetMapping("/getAllBooks")
	public List<String> getAllAvailableBooksName() {
		return Arrays.asList("Clean Code", "The Clean Coder", "Clean Architecture", "Test Driven Development by Example", "Working Effectively With Legacy Code");
	}
}
