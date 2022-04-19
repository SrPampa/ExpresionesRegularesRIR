package com.venancio.dam.ExprRegulRIR;

import java.util.Scanner;

public class Ejercicio13 {
	
	/* Crea un programa en el que puedas meter una dirección de mail 
	   y te diga si es correcta o no */
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca su email: ");
		Scanner sc = new Scanner(System.in);
		 String mail = sc.nextLine();
		 sc.close();

		 System.out.println("Procesando...");
		 
		 if (mail.matches("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$")) {
			 System.out.println("Email correcto, puedes pasar.");
		 }else {
			 System.err.println("Dirección de email no valida.");
		 }
		 
	}

}
