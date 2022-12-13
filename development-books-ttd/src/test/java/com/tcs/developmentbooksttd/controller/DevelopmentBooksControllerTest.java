package com.tcs.developmentbooksttd.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooksttd.model.BookModel;
import com.tcs.developmentbooksttd.model.BooksInput;
import com.tcs.developmentbooksttd.model.PriceSummary;
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
	
	@Test
	public void buyBookSuccess() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		controller.service = new DevelopmentBooksService();
		List<BooksInput> books = new ArrayList<BooksInput>();
		books.add(new BooksInput(1, 3));
		PriceSummary result = controller.buyBooks(books);
		assertEquals(150.0, result.getFinalPrice(), 0.0);
	}
}
