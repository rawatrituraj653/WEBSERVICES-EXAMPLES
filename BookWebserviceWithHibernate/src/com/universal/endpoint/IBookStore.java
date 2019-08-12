package com.universal.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.universal.model.Book;

@WebService
public interface IBookStore {
	
	@WebMethod
	public @WebResult String saveBook(@WebParam Book book);
	
	@WebMethod
	public @WebResult Book getBookByIsbn(@WebParam String isbn);
}
