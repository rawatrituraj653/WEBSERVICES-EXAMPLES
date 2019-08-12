package com.himalaya.bookstore;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.himalaya.binding.Book;

@WebService
public interface IBook {

	@WebMethod
	public  @WebResult Book getBookByIsbn( @WebParam String isbn);
	
	@WebMethod
	public @WebResult String saveBook(@WebParam Book book );
	
	@WebMethod
	public @WebResult List<Book> getAllData();
	
}
