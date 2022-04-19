package ejerciciosexpreg.ejerciciosexpreg;

public class Ejercicio5 {

	/*Crea un programa que genere combinaciones aleatorias de 4 letras y que no pare de generarlas 
	 * hasta que por azar del universo se cree la palabra "hola", 
	 * una vez se cree el programa parará y te mostrará cuantos intentos ha necesitado. 
	 * Pista: Usa un long para el contador porque van a ser muchos intentos.  */
	
	public static void main(String[] args) {
		
		long contador = 0;
		
		System.out.println("El mono está aporreando la maquina de escribir...");
		
		String palabra = "";
		//Esto es muy "rookie" pero podemos hacerlo mas general jugando con la longitud de la palabra o metiendo espacios para conseguir cosas muy guapas pero... La RAM no me daria para comprobarlo
		while (!palabra.matches("hola")) {
		
		if (palabra.length() != 4) {
		for (int i=0; i<4; i++){
		      int codigoAscii = (int)Math.floor(Math.random()*(122 -
		         97)+97); 
		      palabra = palabra + (char)codigoAscii;
		      contador++;
		}
		}
		else {
			palabra = "";
		}
		}
		
		System.out.println("Se han necesitado " + (contador/4) + " intentos para conseguir la palabra: " + palabra);
	}

}
