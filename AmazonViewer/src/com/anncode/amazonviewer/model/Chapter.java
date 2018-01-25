package com.anncode.amazonviewer.model;

public class Chapter {
	
	private int id;
	private String title;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int sessionNumber;
	public Chapter(String title, int duration, short year) {
		super();
		this.title = title;
		this.duration = duration;
		this.year = year;
	}
	
	

}
