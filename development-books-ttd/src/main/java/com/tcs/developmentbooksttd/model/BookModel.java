package com.tcs.developmentbooksttd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookModel {

	private int id;

	private String title;

	private String author;

	private int year;

	private double price;
}
