package com.anncode.amazonviewer.model;

import java.util.Date;

public class Magazine {
	private int id;
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	
	public Magazine(String title, Date edititionDate, String editorial) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
	}
	
	

}
