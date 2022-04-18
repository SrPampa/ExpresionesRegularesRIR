package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		
		String password = "holaaa3aAaa[aaaaa;\n" + "holla2a;" + "\nhola32a3;\n" + "eli__aa;" + "\n_sara;\n";
		
		
		//Contraseña segura
		Pattern patron = Pattern.compile("(^|\\n)(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}\\[\\]:;<>,.?/~_+-=|\\\\]).{8,32}(;|$)");
		Matcher mat = patron.matcher(password);
		while (mat.find()) {
			System.out.println(mat.group() + " posicion inicial: " + mat.start() + " posicion final: " + mat.end());
		
		}
		
		
	}
}
