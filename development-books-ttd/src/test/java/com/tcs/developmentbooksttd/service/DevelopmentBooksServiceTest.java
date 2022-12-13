package com.tcs.developmentbooksttd.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooksttd.enums.BooksEnum;

public class DevelopmentBooksServiceTest {

	@Test
	public void getAllBooks()
	{
		DevelopmentBooksService service = new DevelopmentBooksService();
		List<BooksEnum> books = service.getAllBooks();
		System.out.println(books);
		assertEquals(5, books.size());
	}
}
