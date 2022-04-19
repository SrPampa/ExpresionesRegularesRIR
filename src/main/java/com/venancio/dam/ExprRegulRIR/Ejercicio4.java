package ejerciciosexpreg.ejerciciosexpreg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
	
	/* Intenta desarrollar el programa de censura de chat de videojuegos como el Lol. 
	   Se pedirán mensajes por Scanner y el programa detectará si se trata de malas palabras o insultos 
	   y los sustituirá por asteriscos (puta --> **** , gilipollas --> **********). 
	   Una vez comprobado el mensaje, y censurado si hace falta, se imprimirá en nuestro "chat". */
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca su mensaje: ");
		Scanner sc = new Scanner(System.in);
		 String mensaje = sc.nextLine().toLowerCase();
		 sc.close();
		 
		 Pattern pat = Pattern.compile("put.|put..|coño|gilipoll..|cancer|nigga|nigger|subnormal|polla|retrasado|retard|sida|tumor");
		 
		 String[] palabras = mensaje.split(" ");
		 String censura = "";
		 
		   for (int i = 0; i < palabras.length; i++)    {  
			   Matcher mat = pat.matcher(palabras[i]);  
			   if (mat.matches()) {   
				   char[] numLetras = palabras[i].toCharArray();
				   int longitud = numLetras.length;
				   for (int j = 0; j < numLetras.length; j++) {
					censura = censura +"*";
				}
				   palabras[i] = censura;
			   	  }
			   }
		   
		   System.out.println("--Chat--");
		   System.out.print("User: ");
		   for (String elem : palabras) {
			   System.out.print(elem + " ");
			
		}
		   
		   
		   }
		
	

}



