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

	private static final double SINGLE_BOOK_PRICE = 50.0;
	
	public List<BookModel> getAllBooks() {
		return Arrays.stream(BooksEnum.values()).map(bookEnum -> new BookModel(bookEnum.getId(), bookEnum.getTitle(),
				bookEnum.getAuthor(), bookEnum.getYear(), bookEnum.getPrice())).collect(Collectors.toList());
	}

	public double calculateBooksCostWithDiscount(List<BooksInput> booksBought) {
		
		int totalBooks = booksBought.stream().mapToInt(book -> book.getQuantity()).sum();
		double actualCost = totalBooks * SINGLE_BOOK_PRICE;
		double finalPrice = 0;
		
		int typesOfBook = (int) booksBought.stream().filter(book -> book.getQuantity() > 0).count();
		
		if(typesOfBook == totalBooks)
		finalPrice = calculatePriceForBooksWithDiscount(typesOfBook);
		else
			finalPrice = actualCost;
		return finalPrice;
	}
	
	public double calculatePriceForBooksWithDiscount(int differentBooks) {
		double discountedPrice = 0;
		double actualCost = differentBooks * SINGLE_BOOK_PRICE;
		if (differentBooks == 1)
			discountedPrice = 50;
		else if (differentBooks == 2)
			discountedPrice = actualCost - (actualCost * (5.0 / 100));
		else if (differentBooks == 3)
			discountedPrice = actualCost - (actualCost * (10.0 / 100));
		else if (differentBooks == 4)
			discountedPrice = actualCost - (actualCost * (20.0 / 100));
		else if (differentBooks == 5)
			discountedPrice = actualCost - (actualCost * (25.0 / 100));
		return discountedPrice;
	}
	
}
