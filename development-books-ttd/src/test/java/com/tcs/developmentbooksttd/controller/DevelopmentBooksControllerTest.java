package com.tcs.developmentbooksttd.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooksttd.model.BookModel;
import com.tcs.developmentbooksttd.service.DevelopmentBooksService;

public class DevelopmentBooksControllerTest {

	@Test
	public void getAllBooks()
	{
		DevelopmentBooksController controller = new DevelopmentBooksController();
		controller.service = new DevelopmentBooksService();
		List<BookModel> books = controller.getAllAvailableBooksName();
		assertEquals(5, books.size());
	}
}
