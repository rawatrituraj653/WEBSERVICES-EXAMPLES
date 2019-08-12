package com.himalaya.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {

	@XmlElement(name="book-name")
	private String bookName;
	@XmlElement(name="book-author")
	private String bookAuthor;
	@XmlElement(name="book-isbn")
	private String bookIsbn;
	@XmlElement(name="book-price")
	private double bookPrice;
	@XmlElement(name="book-qty")
	private Integer bookQty;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getBookQty() {
		return bookQty;
	}
	public void setBookQty(Integer bookQty) {
		this.bookQty = bookQty;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookIsbn=" + bookIsbn + ", bookPrice="
				+ bookPrice + ", bookQty=" + bookQty + "]";
	}
	
	
}
