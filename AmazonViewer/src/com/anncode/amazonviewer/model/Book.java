package com.anncode.amazonviewer.model;

import java.util.Date;

public class Book {
	private int id;
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	public Book(String title, Date edititionDate, String editorial, String isbn) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getEdititionDate() {
		return edititionDate;
	}
	public void setEdititionDate(Date edititionDate) {
		this.edititionDate = edititionDate;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	
	
	
}
