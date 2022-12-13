package com.tcs.developmentbooksttd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.developmentbooksttd.model.BookModel;
import com.tcs.developmentbooksttd.model.BooksInput;
import com.tcs.developmentbooksttd.service.DevelopmentBooksService;

@RestController
public class DevelopmentBooksController {

	@Autowired
	DevelopmentBooksService service;

	@GetMapping("/getAllBooks")
	public List<BookModel> getAllAvailableBooksName() {
		return service.getAllBooks();
	}
	
	@PostMapping("/buyBooks")
	public double buyBooks(@RequestBody BooksInput booksBought) {
		return service.buyBooks(booksBought);
	}
}
