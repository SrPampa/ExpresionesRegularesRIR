package com.venancio.dam.ExprRegulRIR;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriculas {
	
	/* Dada una lista de matriculas de coches, debes realizar un programa que identifique, cuente, 
	   guarde e imprima una lista con las matrículas Modernas (tipo 0000 XXX), 
	   las antiguas (tipo X-0000-XX) y una lista con todo lo que no sean matírculas. */

	public static void main(String[] args) {
	
		int contadorModerno = 0;
		int contadorAntiguo = 0;
		int contadorErrores = 0;
		
		int contadorTotales = 0;
		
		ArrayList<String> matriculasModernas = new ArrayList<String>();
		ArrayList<String> matriculasAntiguas = new ArrayList<String>();
		ArrayList<String> matriculasErrores = new ArrayList<String>();
		
		 String matriculas = "6639 KKL/5064 ZNZ/3746 OWI/1743 ORD/6093 NSJ/0624 TZI/4657 EXC/3026 FDG/1487 APO/A 7391 DC/Q 2347 TR/T 9648 VV/E 3956 WE/W 2994 QQ/AAA 9999 TT/U 4567 DD";   
	        String[] arrMatriculas = matriculas.split("/");   
	        for (int i = 0; i < arrMatriculas.length; i++)    {     
	             
	            if (arrMatriculas[i].matches("^[0-9]{4}\s[A-Z]{3}$")) {
	            	contadorModerno++;
	            	matriculasModernas.add(arrMatriculas[i]);
	            } else if (arrMatriculas[i].matches("^[A-Z]{1}\s[0-9]{4}\s[A-Z]{2}$")) {
	            	contadorAntiguo++;
	            	matriculasAntiguas.add(arrMatriculas[i]);
	            }else {
	            	contadorErrores++;
	            	matriculasErrores.add(arrMatriculas[i]);
	            }
	            contadorTotales++;
	        }
		
	    System.out.println("La lista vontiene un total de " + contadorTotales + " posibles matículas. De las cuales: ");
		System.out.println("\t" + contadorModerno + " son matriculas modernas (año 2000 en adelante).");
		System.out.println("\t" + contadorAntiguo + " son matriculas antiguas (año 2000 hacia atrás).");
		System.out.println("\t" + contadorErrores + " NO son matrículas con formato válido.");
		System.out.println();
		System.out.print("¿Desea imprimir las listas?(s/n)");
		Scanner sc = new Scanner(System.in);
		 char otp = sc.next().charAt(0);
		 sc.close();
		 
		if(otp == 's') {
			System.out.println("Listado de matriculas modernas: ");
		   for (String elem : matriculasModernas) {
			System.out.print(elem + " - ");
		}
		   
		   System.out.println("\nListado de matriculas antiguas: ");
		   for (String elem : matriculasAntiguas) {
				System.out.print(elem + " - ");
			}
		   System.out.println("\nListado de matriculas con errores: ");
		   for (String elem : matriculasErrores) {
				System.out.print(elem + " - ");
			}
		}
	}

}
