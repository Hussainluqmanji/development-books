package com.tcs.developmentbooksttd.service;

import java.util.Arrays;
import java.util.List;

import com.tcs.developmentbooksttd.enums.BooksEnum;

public class DevelopmentBooksService {

	public List<BooksEnum> getAllBooks()
	{
		return Arrays.asList(BooksEnum.values());
	}
}
