package com.tcs.developmentbooksttd.enums;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BooksEnumTest {

	@Test
	void developmentBooksEnum_shouldContainFiveDevelopmentBooks() {
		assertEquals(5, BooksEnum.values().length);
	}
}
