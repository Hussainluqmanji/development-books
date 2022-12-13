package com.tcs.developmentbooksttd.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooksttd.model.BookModel;
import com.tcs.developmentbooksttd.model.BooksInput;

public class DevelopmentBooksServiceTest {

	@Test
	public void getAllBooks() {
		DevelopmentBooksService service = new DevelopmentBooksService();
		List<BookModel> books = service.getAllBooks();
		assertEquals(5, books.size());

	}
	
	@Test
	public void buyBookSuccess() {
		DevelopmentBooksService service = new DevelopmentBooksService();
		double result = service.buyBooks(new BooksInput(1, 1));
		assertEquals(50.0, result, 0.0);

	}
}
