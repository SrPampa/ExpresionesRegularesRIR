package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pruebas {

	public static void main(String[] args) {

		String texto = " camión, Jaén boalicón estúdiánte eeioro abueilo Álgebra Fú";

		Pattern patronFecha = Pattern.compile("[A-Za-z]?([a-z]+)?( Á| É| Í| Ó| Ú|á|é|í|ó|ú)([a-z]+)?");
		Matcher matFecha = patronFecha.matcher(texto);

		int coincidencias = 0;

		while (matFecha.find()) {
			System.out.println(matFecha.group());
			coincidencias++;
		}
		System.out.println("palabras: "+coincidencias);

	
	}
}
