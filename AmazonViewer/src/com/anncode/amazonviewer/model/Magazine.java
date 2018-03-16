package com.anncode.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	
	private int id;
	
	public Magazine(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: MAGAZINE ::" + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Edition Date: " + getEdititionDate();
	}

}
