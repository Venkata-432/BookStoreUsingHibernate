package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Book;

public interface BookStoreWebDAOInterface {

	int createBookDAO(Book b);
	Book viewBookDAO(Book b);
	List<Book> viewBooksDAO();
	int deleteBookDAO(Book b);
	int updateBookDAO(Book b);
}
