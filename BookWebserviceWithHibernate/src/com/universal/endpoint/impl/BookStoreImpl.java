package com.universal.endpoint.impl;

import javax.jws.WebService;

import com.universal.endpoint.IBookStore;
import com.universal.hibernate.service.BookService;
import com.universal.model.Book;

@WebService(endpointInterface = "com.universal.endpoint.IBookStore")
public class BookStoreImpl implements IBookStore{

	private BookService service; 
	public BookStoreImpl() {
		System.out.println("BookStoreImpl :: Called");
		service=new BookService();
	}
	
	@Override
	public String saveBook(Book book) {
		System.out.println("BookStoreImpl :: Save Book");
			String msg=service.saveBook(book);
		
		
		return msg;
	}
	
	@Override
	public Book getBookByIsbn(String isbn) {
		System.out.println("BookStoreImpl :: GetBook By Isbn");
		Book book=service.getBook(isbn);
		if(book!=null) {
		return book;
		}
		else {
			Book b1=new Book();
			b1.setBookIsbn("This is Wrong Isbn enter valid One");
			return b1;
		}
	}
}
