package com.bookstore.service;

import java.util.List;

import com.bookstore.dao.BookStoreDAO;
import com.bookstore.dao.BookStoreWebDAOInterface;
import com.bookstore.entity.Book;

public class BookStoreService implements BookStoreServiceInterface{

	public int createBookService(Book b) {
		BookStoreWebDAOInterface bd=new BookStoreDAO();
		int i=bd.createBookDAO(b);
		return i;
	}

	public Book viewBookService(Book b) {
		BookStoreWebDAOInterface bd=new BookStoreDAO();
		Book br=bd.viewBookDAO(b);
		return br;
	}

	public int deleteBookService(Book b) {
		
		BookStoreWebDAOInterface bdi=new BookStoreDAO();
		int i=bdi.deleteBookDAO(b);
		return i;
		
	}

	public int updateBookService(Book b) {
		BookStoreWebDAOInterface bdi=new BookStoreDAO();
		int i=bdi.updateBookDAO(b);
		return i;
		
	}

	public List<Book> viewBooksService() {
		BookStoreWebDAOInterface bsd=new BookStoreDAO();
		List<Book> bookList=bsd.viewBooksDAO();
		
		return bookList;
	}

}
