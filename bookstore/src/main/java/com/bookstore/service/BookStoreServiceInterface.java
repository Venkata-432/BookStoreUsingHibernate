package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface BookStoreServiceInterface {

	   int createBookService(Book b);
	   
	   Book	viewBookService(Book b);
	   
	   int deleteBookService(Book b);
	   
	   int updateBookService(Book b);
	   
	   List<Book> viewBooksService();

	
}
