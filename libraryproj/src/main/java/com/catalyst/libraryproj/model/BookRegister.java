package com.catalyst.libraryproj.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "Book_Register", schema = "sms")
@TableGenerator(name = "Book_Register_SEQ", table = "seq_id_table", schema = "sms", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_VALUE", initialValue = 1, allocationSize = 1)
public class BookRegister implements Serializable{

	@Id	
	@GeneratedValue(strategy=GenerationType.TABLE, generator = "Book_Register_SEQ")
	@Column(name = "book_id")
    private Integer id;

	@Column(name = "book_name")
    private String bookname;
	
	@Column(name = "book_category")
    private String category;
	
	@Column(name = "author_name")
    private String bookauthor;
	
	@Column(name = "subject")
    private String subject;
	
	@Column(name = "publisher")
    private String publisher;
	
	@Column(name = "date_of_purchase")
    private Date dop;
	
	@Column(name = "date_of_register")
    private Date dor;
	
	@Column(name = "price")
    private Double price;
	
	////================ GETTERS & SETTERS ================= ////

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	public Date getDor() {
		return dor;
	}

	public void setDor(Date dor) {
		this.dor = dor;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
