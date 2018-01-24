package com.anncode.holamundo;
//Upper Camel Case nombre de clase
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo IDE :)");
		
		//Enteros
		byte edad = 127;
		short year = -32768;
		int id_user = 1001; 
		long id_twitter = 12345678923456789L;
		
		
		//Punto Flotante
		float diametro = 34.25F;
		double precio = 12345.2345678923456723456234;
		
		//Texto
		char genero = 'M';
		
		//Logico
		boolean isVisible = true;
		boolean funciona = false;
		
		int variable = 2;
		int _variable = 3;
		int $variable = 4;
		int variable1 = 5;
		
		
		//Constantes
		int VALOR = 0;
		int VALOR_MAXIMO = 1;
		
		
		
		//Lower Camel Case
		int minValor = 4;
		
		byte b = 6;
		short s = b;
		
		b = (byte) s;
		
		int i = 1;
		double d = 2.8;
		i= (int) d;
		
		int codigo = 97;
		char codigoASCII = (char) codigo;
		
		short numero = 300;
		byte numeroByte = (byte) numero;
		
		//Arrays
		//Declaración de array
		
		int[] arregloInt = new int[2];
		double arregloDouble[];
		
		int[][] array2D = new int[2][3];//caben 6 cupcakes
		int[][][] array3D = new int[3][3][2]; //caben 18 cokies
		//int[][][][] array4D = new int[1][2][3][4];
		
		char[][] days = { {'M','T','W'}, {'M', 'T', 'W'} };
		
		char[][][] letters = { { {'a','b'}, {'a','b'},{'a','b'} }, { {'a','b'}, {'a','b'}, {'a','b'} } };
		
		
		
		System.out.println(numeroByte);
	}

}











