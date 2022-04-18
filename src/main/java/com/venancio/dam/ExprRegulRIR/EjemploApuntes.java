package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploApuntes {

	public static void main(String[] args) {
		
		String input = "Hola que tal estas hola, hola2";
		
		Pattern patron = Pattern.compile("[Hh]ola");
		Matcher mat = patron.matcher(input);
		
		//El método find nos indica si se han encontrado o no subsecuancias del patrón definido
		while(mat.find()) {
			System.out.println(mat.group()+"- posicion inicial: "+mat.start() + ", posicion final:"+ mat.end());
		}
		
		//El método matches busca una concordancia completa entre patrón y búsqueda
		//Hay dos formas de ejecutarlo: 
		
		System.out.println(Pattern.matches("[Hh]ola", input));
		System.out.println(mat.matches());
		
		// En ambos casos daría falso puesto que con ese regex solo encuentra subsecuencias y no 
		// hay una coincidencia completa
		
		// Para que diera true , tendríamos que indicar que empieza por H o h, seguido de "ola", y después, 
		// vendrían cualquier caracter un numero indefinido de veces: 
		System.out.println(Pattern.matches("^[Hh]ola.*", input));
		
		//Otro uso sería buscar un patrón como divisor de cadenas.
		//En este caso el divisor se trata de cualquier dígito numérico que al menos aparece una vez 
		Pattern p = Pattern.compile("\\d+");
		String[] str = p.split(
				"Soy Fran. Mi número de empleado es: 456456, mi teléfono es 0546584, mi correo electrónico es aaaa@aaa.com"); 
		for (String elem : str) {
			System.out.println(elem);
		}
		
		
		
		
		
	}
	
}
