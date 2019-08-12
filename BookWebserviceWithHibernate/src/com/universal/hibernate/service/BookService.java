package com.universal.hibernate.service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.universal.hibernateUtil.HibernateUtil;
import com.universal.model.Book;

public class BookService {

	private SessionFactory factory;
	
	public BookService() {
		factory=HibernateUtil.getSessionFactory();
	}

	public String saveBook(Book book) {
		Transaction tx=null;
		if(factory!=null) {
			
		try {
		Session session=factory.openSession();
		String isbn=  (String) session.save(book);
		tx= session.beginTransaction();	
			tx.commit();
				
			
			return "Book Data Saved with Id: "+isbn;
		}catch (Exception e) {
			tx.rollback();
			return "Some Exception Occured please Check";
		}
		
		}

		return null;
	}
	
	public Book getBook(String isbn) {
		Book book=null;
		if(factory!=null) {
			Session session=factory.openSession();
			book=session.get(Book.class, isbn);
			return book;
		}
		
		return book;		
	}

}
