package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookstore.entity.Book;

public class BookStoreDAO implements BookStoreWebDAOInterface{

	public int createBookDAO(Book b) {
		int i=0;
		SessionFactory sf=new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		EntityTransaction et=s.getTransaction();
		et.begin();
		s.save(b);
		et.commit();
		i=1;
		return i;
	}
	
	public Book viewBookDAO(Book b) {
		Book br=null;
		SessionFactory sf=new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		Query q=s.createQuery("from com.bookstore.entity.Book b where b.id=:ei");
		q.setParameter("ei", b.getId());
		br=(Book) q.getSingleResult();
		
		return br;
		
	}
	public List<Book> viewBooksDAO() {
		SessionFactory sf=new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from com.bookstore.entity.Book b");
		
		List<Book> bookList=q.getResultList();
		
		return bookList;
	}

	public int deleteBookDAO(Book b) {
		int i=0;
		
		SessionFactory sf=new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		EntityTransaction et=s.getTransaction();
		et.begin();
		
		Query q=s.createQuery("delete from com.bookstore.entity.Book b where b.id=:ei");
		q.setParameter("ei", b.getId());
		
		i=q.executeUpdate();
		et.commit();
		return i;
	}
	
	public int updateBookDAO(Book b) {
		int i=0;
		
		SessionFactory sf=new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		EntityTransaction et=s.getTransaction();
		et.begin();
		
		Query q=s.createQuery("update com.bookstore.entity.Book b set b.price=:ep where b.id=:ei");
		q.setParameter("ep", b.getPrice());
		q.setParameter("ei", b.getId());
		
		i=q.executeUpdate();
		et.commit();
		
		return i;
	}
}
