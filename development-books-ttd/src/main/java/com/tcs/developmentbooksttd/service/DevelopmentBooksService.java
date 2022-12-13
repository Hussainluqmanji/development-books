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
		double discount = 0;
		
		int typesOfBook = (int) booksBought.stream().filter(book -> book.getQuantity() > 0).count();
		
		if(totalBooks == 2 && typesOfBook == 2)
		{
			discount = 5;
		}
		
		else if(totalBooks == 3 && typesOfBook == 3)
		{
			discount = 10;
		}
		
		else if(totalBooks == 4 && typesOfBook == 4)
		{
			discount = 20;
		}
		
		else if(totalBooks == 5 && typesOfBook == 5)
		{
			discount = 25;
		}
		
		double finalPrice = actualCost - (actualCost * (discount / 100));
		return finalPrice;
	}
	
}
