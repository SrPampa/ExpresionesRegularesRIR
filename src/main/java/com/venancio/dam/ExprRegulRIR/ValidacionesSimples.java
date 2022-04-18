package com.venancio.dam.ExprRegulRIR;

public class ValidacionesSimples {

	public static void main(String[] args) {
		
		
	}
	
	public static boolean validarDNI(String dni) {
		return dni.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
	}
	
	
}
