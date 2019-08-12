package com.himalaya.bookstore.impl;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import com.himalaya.binding.Book;
import com.himalaya.bookstore.IBook;
import com.himalaya.bookstore.dto.BookDTO;

@WebService(endpointInterface = "com.himalaya.bookstore.IBook")
public class BookStoreImpl implements IBook{

	private BookDTO dto;
	public BookStoreImpl() {
		System.out.println("BookStoreImpl:: class called");
		dto=new BookDTO();
	}
	
	@Override
	public Book getBookByIsbn(String isbn) {
		System.out.println("getBookByIsbn(String isbn) :: is Executed");
		
				

		return dto.getBookbyIsbn(isbn); 
	}
	@Override
	public String saveBook(Book book)  {
		System.out.println("saveBOok  :: is Executed");
			try {
				String msg=dto.saveBook(book);
				return msg;
			} catch (SQLException e) {
				e.printStackTrace();
			
				return e.getMessage();
			}
				
	}
	@Override
	public List<Book> getAllData() {
			
		return dto.getBooks();
	}
	
}
