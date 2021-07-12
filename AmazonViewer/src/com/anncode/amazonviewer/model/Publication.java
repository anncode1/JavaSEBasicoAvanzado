package com.anncode.amazonviewer.model;

import java.util.Date;

public class Publication {
	
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	
	
	public Publication(String title, Date edititionDate, String editorial) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
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
	
	

}
