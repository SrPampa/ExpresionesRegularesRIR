package com.venancio.dam.ExprRegulRIR;

public class ValidacionesSimples {

	public static void main(String[] args) {
		
		System.out.println("fecha 10/4/1995: "+ validarFecha("10/4/1995"));
		System.out.println("fecha 33/4/1995: "+ validarFecha("33/4/1995"));
		System.out.println("fecha 10/4/995: "+ validarFecha("10/4/995"));
		System.out.println("fecha 10/13/1995: "+ validarFecha("10/13/1995"));
		System.out.println("fecha 10/4/2295: "+ validarFecha("10/4/2295"));
		
		System.out.println("DNI 70883987B: "+ validarDNI("70883987B"));
		System.out.println("DNI 70883987: "+ validarDNI("70883987"));
		System.out.println("DNI 15883987I: "+ validarDNI("15883987I"));
		System.out.println("DNI 05708987J: "+ validarDNI("05708987J"));
		System.out.println("DNI 0883987B: "+ validarDNI("0883987B"));
		System.out.println("DNI 00883987B: "+ validarDNI("00883987B"));
		
		System.out.println("Número 0: "+ validarNumeroReal("0"));
		System.out.println("Número 0,45: "+ validarNumeroReal("0,45"));
		System.out.println("Número 6.9: "+ validarNumeroReal("6.9"));
		System.out.println("Número 120: "+ validarNumeroReal("120"));
		System.out.println("Número -446.05: "+ validarNumeroReal("-446.05"));
		System.out.println("Número asd: "+ validarNumeroReal("asd"));
		System.out.println("Número --45.9: "+ validarNumeroReal("--45.9"));
		
	}
	
	public static boolean validarDNI(String dni) {
		return dni.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
	}
	
	public static boolean validarFecha(String fecha) {
		return fecha.matches("^(0?[1-9]|[12][0-9]|[3][01])[\\/](0?[1-9]|1[012])[\\/]([12][0-9])\\d{2}$");
	}
	
	public static boolean validarNumeroReal(String numero) {
		return numero.matches("^-?[0-9]+([\\.,][0-9]+)?$");
	}
	
	
}
