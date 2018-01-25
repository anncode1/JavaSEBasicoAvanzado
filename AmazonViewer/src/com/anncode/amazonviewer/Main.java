package com.anncode.amazonviewer;

import com.anncode.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie();
		movie.title = "Coco";
		movie.duration = 120;
		
		int exit = 0;
		do {
			
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
			//Leer la respuesta del usuario
			int response = 0;
			switch (response) {
				case 0:
					//salir
					
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
	
				default:
					System.out.println();
					System.out.println("....¡¡Selecciona una opción!!....");
					System.out.println();
					break;
			}
			
			
		}while(exit != 0);
		
		

	}

}
