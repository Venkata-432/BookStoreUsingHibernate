package com.bookstore.controller;

import java.util.List;
import java.util.Scanner;

import com.bookstore.entity.Book;
import com.bookstore.service.BookStoreService;
import com.bookstore.service.BookStoreServiceInterface;

public class BookStoreController implements BookStoreControllerInterface{

	public void createBookController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id");
		int bookId=sc.nextInt();
		System.out.println("Enter book name");
		String name=sc.next();
		System.out.println("Enter author name");
		String authorName=sc.next();
		System.out.println("Enter book price");
		double price=sc.nextDouble();
		System.out.println("Enter book description");
		sc.next();
		String description=sc.nextLine();
		
		
		Book b=new Book();
		b.setId(bookId);
		b.setBookName(name);
		b.setAuthor(authorName);
		b.setPrice(price);
		b.setDescription(description);
		
		BookStoreServiceInterface bss=new BookStoreService();
		int i=bss.createBookService(b);
		
		if(i!=0) {
			System.out.println("Book added successfully");
		}else {
			System.out.println("Facing issue while adding Book");
		}
	}

	public void viewBookController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book id");
		int id=sc.nextInt();
		
		Book b=new Book();
		b.setId(id);
		
		BookStoreServiceInterface bss=new BookStoreService();
		Book bs=bss.viewBookService(b);
		
		if(bs!=null) {
			System.out.println("********************************************");
			System.out.println("Book Id: "+bs.getId());
			System.out.println("Book Name: "+bs.getBookName());
			System.out.println("Book Author: "+bs.getAuthor());
			System.out.println("Book Price: "+bs.getPrice());
			System.out.println("Book Description: "+bs.getDescription());
			System.out.println("********************************************");
		}
	}

	public void deleteBookController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book id to delete Book");
		int id=sc.nextInt();
		
		Book b=new Book();
		b.setId(id);
		
		BookStoreServiceInterface bi=new BookStoreService();
		int i=bi.deleteBookService(b);
		
		if(i!=0) {
			System.out.println("Book Deleted Successfully");
		}else {
			System.out.println("Facing Issue While Deleting Book");
		}
	}

	public void updateBookController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book id to update Book");
		int id=sc.nextInt();
		
		System.out.println("Enter Book price to update Book");
		double price=sc.nextDouble();
		
		Book b=new Book();
		b.setId(id);
		b.setPrice(price);
		
		BookStoreServiceInterface bi=new BookStoreService();
		int i=bi.deleteBookService(b);
		
		if(i!=0) {
			System.out.println("Book Updated Successfully");
		}else {
			System.out.println("Facing issue while Updating Book");
		}
		
	}

	public void viewBooksController() {
		BookStoreServiceInterface bss=new BookStoreService();
		List<Book> bookList=bss.viewBooksService();
		
		for(Book bs:bookList) {
			System.out.println("********************************************");
			System.out.println("Book Id: "+bs.getId());
			System.out.println("Book Name: "+bs.getBookName());
			System.out.println("Book Author: "+bs.getAuthor());
			System.out.println("Book Price: "+bs.getPrice());
			System.out.println("Book Description: "+bs.getDescription());
			System.out.println("********************************************");
		}
	}

}
