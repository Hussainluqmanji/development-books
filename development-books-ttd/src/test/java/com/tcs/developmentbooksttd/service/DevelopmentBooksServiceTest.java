package com.tcs.developmentbooksttd.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tcs.developmentbooksttd.model.BookModel;
import com.tcs.developmentbooksttd.model.BooksInput;

public class DevelopmentBooksServiceTest {

	DevelopmentBooksService service;

	@BeforeEach
	public void setUp() {
		service = new DevelopmentBooksService();
	}

	@Test
	public void getAllBooks() {

		List<BookModel> books = service.getAllBooks();
		assertEquals(5, books.size());

	}

	@Test
	public void buyBookSuccess() {
		List<BooksInput> books = new ArrayList<BooksInput>();
		books.add(new BooksInput(1, 1));
		double result = service.calculateBooksCostWithDiscount(books);
		assertEquals(50.0, result, 0.0);

	}

	@Test
	public void buyTwoDiffBookAndGetDiscount() {
		List<BooksInput> books = new ArrayList<BooksInput>();
		books.add(new BooksInput(1, 1));
		books.add(new BooksInput(2, 1));
		double result = service.calculateBooksCostWithDiscount(books);
		assertEquals(95.0, result, 0.0);

	}

	@Test
	public void buyThreeDiffBookAndGetDiscount() {
		List<BooksInput> books = new ArrayList<BooksInput>();
		books.add(new BooksInput(1, 1));
		books.add(new BooksInput(2, 1));
		books.add(new BooksInput(3, 1));
		double result = service.calculateBooksCostWithDiscount(books);
		assertEquals(135.0, result, 0.0);

	}
}
