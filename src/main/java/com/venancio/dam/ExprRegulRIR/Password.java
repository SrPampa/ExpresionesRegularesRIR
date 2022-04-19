package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {

		String password = "ranansciftem;\r\n" + "mICkE;\r\n" + "B@AlVGz0e&N89h7R!$&m;\r\n" + "*@wScajY%rwAkKKAUKFZ;\r\n"
				+ "w85#Fz&#XD52;\r\n" + "eAHEylaybTHh;\r\n" + "4TKpS8nBPTqd;\r\n" + "ToNYAk;\r\n" + "apsIOcOs;\r\n"
				+ "iseyered;\r\n" + "2zhHue2H;\r\n" + "T!JV@Mwj;\r\n" + "uQt%@@$$g;\r\n" + "NBT8SJF^Q;\r\n"
				+ "nitoNeRIK;\r\n" + "z^qM%fDZ3;\r\n";

		int contador = 0;

		Pattern patron = Pattern.compile(
				"(^|\\n)(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}\\[\\]:;<>,.?/~_+-=|\\\\]).{8,32}(;|$)");
		Matcher mat = patron.matcher(password);
				
		while (mat.find()) {
			System.out.println(mat.group() + " posicion inicial: " + mat.start() + " posicion final: " + mat.end());
			contador++;
		}

		System.out.println("\nHay " + contador + " contraseñas seguras");
	}
}
