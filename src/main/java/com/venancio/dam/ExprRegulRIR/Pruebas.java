package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pruebas {

	public static void main(String[] args) {

		String texto = "4 de abril de 1995 y 31 de octubre de 1996";

		Pattern patronFecha = Pattern.compile("([1-9]|[12][0-9]|[3][01])\sde\s(enero|febrero|marzo|abril|mayo|junio|julio|agosto|septiembre|octubre|noviembre|diciembre) de ([12][0-9])\\d{2}");
		Matcher matFecha = patronFecha.matcher(texto);

		int coincidencias = 0;

		while (matFecha.find()) {
			System.out.println(matFecha.group());
			coincidencias++;
		}
		System.out.println("Fechas encontradas: "+coincidencias);

	
	}
}
