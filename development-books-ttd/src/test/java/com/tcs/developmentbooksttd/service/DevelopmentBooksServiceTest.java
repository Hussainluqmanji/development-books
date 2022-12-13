package com.tcs.developmentbooksttd.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooksttd.model.BookModel;

public class DevelopmentBooksServiceTest {

	@Test
	public void getAllBooks() {
		DevelopmentBooksService service = new DevelopmentBooksService();
		List<BookModel> books = service.getAllBooks();
		assertEquals(5, books.size());

	}
}
