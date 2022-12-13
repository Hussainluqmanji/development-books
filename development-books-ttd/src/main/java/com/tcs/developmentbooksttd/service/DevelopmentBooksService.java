package com.tcs.developmentbooksttd.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tcs.developmentbooksttd.enums.BooksEnum;
import com.tcs.developmentbooksttd.model.BookModel;
import com.tcs.developmentbooksttd.model.BooksInput;

@Service
public class DevelopmentBooksService {

	public List<BookModel> getAllBooks() {
		return Arrays.stream(BooksEnum.values()).map(bookEnum -> new BookModel(bookEnum.getId(), bookEnum.getTitle(),
				bookEnum.getAuthor(), bookEnum.getYear(), bookEnum.getPrice())).collect(Collectors.toList());
	}

	public double buyBooks(BooksInput booksBought) {
		
		List<BookModel> books = getAllBooks();
		return books.stream().filter(book -> book.getId() == booksBought.getBookId()).findAny().get().getPrice();
	}
}
