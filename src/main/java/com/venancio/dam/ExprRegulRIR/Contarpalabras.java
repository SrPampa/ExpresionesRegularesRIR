package com.venancio.dam.ExprRegulRIR;

import java.util.HashMap;
import java.util.Scanner;

public class Contarpalabras {
	
	/*Cogiendo el texto que quieras o el que se proporciona como ejemplo, 
	 * desarrolla un programa que cuente cuantas palabras tiene y cuente cuantas veces se repiten. 
	 * Se debe imprimir esa información.  
	 */

	public static void main(String[] args) {
		
		/* System.out.print("Introduzca el texto que desea contar: ");
		Scanner sc = new Scanner(System.in);
		 String texto = sc.nextLine();
		 sc.close(); */
		
		// Texto para pruebas 
		  String texto = "han parao, de nunca, de nunca me habían parao a mí. He venío siempre con ciento y pico de vena en alcohol. Y hoy a mi colega, tío, por verlo en el eclipse, que le ha costao un dineral, vale lo ha pasao con la coquita, tal tal, los gramitos, que tiene amenazao a toda la policía nacional, de Alicante, y van todos detrás de él. Yo me bebío en mi casa, cinco botella de White Label. Veniros pal carro hombre. Pero mira, le ven el carro... Escúchame, que tengo dos puntos, pero me la come. ¿Pos pa quitarnos las penas pos ahora que vamos a hacer? Al llegar a Alicante pos pillamos dos pollitos de coca, fumamos los cuatro porros últimos. Lo que haga falta, un par de litros. Mira, a ver si me quedan tranquis aquí, es que, quieres tranquis? Esto es pa dormir hermano, tranquimazin, eeeestooo... Córtate, córtate. Pero mira el tranquimazin con el medio, eh. ¿Le multan? Pos le da igual. Le da igual, el qué tiene que pagar, ¿Dos mil euros? Pues los paga. Qué, sácale los DIEZ GRAMOS. Aquí no, la merca no se enseña en publicidad. Me cago en mis muertos. Que aquí no se monta, quita Gabri, tío, escúchame, que me acabo de dar 0,60. ¿Quieres ver cosa gorda? Ese coche no sale de la nada. Escúchame este coche es marronero, dí la verdad, tú que eres policía. Es que aquí lo que llevamos hoy es impresionante. Grábame si a mí me da igual que me grabes. Qué queréis, ¿Tener un reportaje de puta madre, no? Toma, hazte un pleno. Toma, coqueta. Con esto no tenemos ni pa un cuarto de hora. Jeje. Mira mira como la chafo la coca. No se chafa eso. Aquí en medio del control. ¿Y qué? Al estar la Guardia Civil, cuando entras parece que está más buena la coca. Eso es lo que nos gusta a nosotros. Escucha, vamos a hacer una rayita y ahora nos vemos. Eh, ahora os llamamos.";
         
		
		 
		 String[] palabras = texto.split("\\s+");
		 
		 System.out.println("El texto introducido contiene " + palabras.length + " palabras CONTANDO LAS REPETIDAS.");

		  HashMap<String, Integer> mapaDeFrecuencias = new HashMap<>();
	        for (String elem : palabras) {
	            if (mapaDeFrecuencias.containsKey(elem)) {
	                mapaDeFrecuencias.put(elem, mapaDeFrecuencias.get(elem) + 1);
	            } else {
	                mapaDeFrecuencias.put(elem, 1);
	            }
	        }
	
	        for (HashMap.Entry<String, Integer> entry : mapaDeFrecuencias.entrySet()) {
	            System.out.printf("Palabra '%s' con frecuencia %d\n", entry.getKey(), entry.getValue());
	        }
	        
	}

}
