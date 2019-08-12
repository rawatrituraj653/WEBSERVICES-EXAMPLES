package com.universal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book-info")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="Book_TAB")
public class Book {

	
	@Id
	@XmlElement(name="book-isbn")
	@Column(length = 10)
	private String bookIsbn;
	@XmlElement(name="book-id")
	@GeneratedValue
	private Integer bookId;
	@XmlElement(name="book-name")
	@Column(length = 20)
	private String bookName;
	@XmlElement(name="book-author")
	@Column(length = 20)
	private String bookAuthor;
	@XmlElement(name="book-price")
	private Double bookprice;
	@XmlElement(name="book-qty")
	private Integer bookQty;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
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

	public Double getBookprice() {
		return bookprice;
	}

	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
	public Integer getBookQty() {
		return bookQty;
	}
	public void setBookQty(Integer bookQty) {
		this.bookQty = bookQty;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookIsbn=" + bookIsbn + ", bookName=" + bookName + ", bookAuthor="
				+ bookAuthor + ", bookprice=" + bookprice + ", bookQty=" + bookQty + "]";
	}
	
	
}
