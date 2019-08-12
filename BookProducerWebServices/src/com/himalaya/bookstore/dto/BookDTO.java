package com.himalaya.bookstore.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.himalaya.binding.Book;
import com.himalaya.bookstore.dao.BookDao;

public class BookDTO {

	
	public Book getBookbyIsbn(String isbn) {
	Book book=new Book();
		
	try {	
	Connection connection=BookDao.getConnection();
	System.out.println(connection);
		if(connection!=null) {
			PreparedStatement pStatement=
			connection.prepareStatement("select * from book where bookIsbn=?");
			pStatement.setString(1, isbn);	
			ResultSet rs=pStatement.executeQuery();
			while(rs.next()) {
			book.setBookName(rs.getString(1));
			book.setBookAuthor(rs.getString(2));
			book.setBookIsbn(rs.getString(3));
			book.setBookPrice(rs.getDouble(4));
			book.setBookQty(rs.getInt(5));
			}
		}
		System.out.println(book);
		return book;
	
	}catch (Exception e) {
	}
	System.out.println(book);	
	return book;
		
	}

	public String saveBook(Book book) throws SQLException {
		Connection connection=BookDao.getConnection();
		PreparedStatement ps=connection.prepareStatement("insert into book values(?,?,?,?,?)");
		ps.setString(1, book.getBookName());
		ps.setString(2, book.getBookAuthor());
		ps.setString(3, book.getBookIsbn());
		ps.setDouble(4, book.getBookPrice());
		ps.setInt(5, book.getBookQty());
		
		int save=ps.executeUpdate();
		if(save!=0) {
			return "BOOk Data Successfully added in database";
		}
		return "Some Issue Occured";
	}
	
	public List<Book> getBooks(){
		Connection connection=BookDao.getConnection();
		List<Book> list=new ArrayList<Book>();
		
		try {
			PreparedStatement ps=connection.prepareStatement("Select * from book");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Book book=new Book();
				book.setBookName(rs.getString(1));
				book.setBookAuthor(rs.getString(2));
				book.setBookIsbn(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookQty(rs.getInt(5));
			list.add(book);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
		
		
		
	}
}