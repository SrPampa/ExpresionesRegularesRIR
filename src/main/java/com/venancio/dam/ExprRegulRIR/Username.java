package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

	public static void main(String[] args) {

		String nombre = "holaaa;\n" + "holla2a;" + "\nhola32a3;\n" + "eli__aa;" + "\n_sara;\n";
		int contador = 0;

		Pattern patron = Pattern.compile("(^|\\n)[a-zA-Z0-9]([_-]|[a-zA-Z0-9]){3,18}[a-zA-Z0-9](;|$)");
		Matcher mat = patron.matcher(nombre);

		while (mat.find()) {
			System.out.println(mat.group() + " posicion inicial: " + mat.start() + " posicion final: " + mat.end());
			contador++;
		}

		System.out.println("\nHay " + contador + " nombres de usuario válidos en el listado");

	}
}
