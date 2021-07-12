package com.anncode.makereport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: REPORTE:: \n");
		String content = report.getTitle();
		for (int i = 0; i < 5; i++) {
			content += "\nReporte : " + i;
		}
		report.setContent(content);
		report.makeReport();

	}

}
