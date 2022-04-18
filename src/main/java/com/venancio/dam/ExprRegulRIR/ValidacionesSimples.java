package com.venancio.dam.ExprRegulRIR;

public class ValidacionesSimples {

	public static void main(String[] args) {
		System.out.println(validarFecha("10/4/1995"));
		System.out.println(validarFecha("33/4/1995"));
		System.out.println(validarFecha("10/4/995"));
		System.out.println(validarFecha("10/13/1995"));
		System.out.println(validarFecha("10/4/2295"));
		
	}
	
	public static boolean validarDNI(String dni) {
		return dni.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
	}
	
	public static boolean validarFecha(String fecha) {
		return fecha.matches("^(0?[1-9]|[12][0-9]|[3][01])[\\/](0?[1-9]|1[012])[\\/]([12][0-9])\\d{2}$");
	}
	
	
}
