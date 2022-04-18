package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

	public static void main(String[] args) {

		String nombre = "Acabtar;\r\n" + "luci;\r\n" + "almario;\r\n" + "12Altimpo_;\r\n" + "AwareIssue3;\r\n"
				+ "Ayadorma_;\r\n" + "bajelar;\r\n" + "-Borrob;\r\n" + "Caguado;\r\n" + "capoSilly;\r\n" + "Execil;\r\n"
				+ "_mor_;\r\n" + "FamousWeb;\r\n" + "freakThesoy;\r\n" + "1Guarave;\r\n" + "interest-Maxi;\r\n"
				+ "issca;\r\n" + "Issuero;\r\n" + "Jame5Life;\r\n" + "Katrif;\r\n" + "Larmente;\r\n" + "Matterse;\r\n"
				+ "Merodin;\r\n" + "monicast;\r\n" + "mowerBlacken;\r\n" + "Oleoran;\r\n" + "Opatisaj;\r\n"
				+ "paradome;\r\n" + "PureEatsyou;\r\n" + "Sizz-lme;\r\n" + "SkillfulAra;\r\n" + "StormBoardin;\r\n"
				+ "Aboutar;\r\n" + "Agotalec;\r\n" + "-Alcogogo;\r\n" + "7_Alidador;\r\n" + "Asiadora;\r\n"
				+ "Bandit:Fraser;\r\n" + "CarLogic;\r\n" + "chronota;\r\n" + "cistMans;\r\n" + "crux;\r\n"
				+ "Day.Zippo;\r\n" + "Despario;\r\n" + "_Donald-Magazine;\r\n" + "Doo mor;\r\n" + "Esmecie24;\r\n"
				+ "fly12Uber;\r\n" + "Isagoll;\r\n" + "_Issuela;\r\n" + "IssueXglossy;\r\n" + "knotra_;\r\n"
				+ "lastingNice;\r\n" + "25ProNewscast;\r\n" + "Sakilo;\r\n" + "Slashon;\r\n" + "marius;\r\n"
				+ "Soca:jeme;\r\n" + "Time.Man;\r\n" + "Toxi-cam2;\r\n" + "TruckThega;\r\n" + "WalkerWeare;\r\n"
				+ "With_painci;\r\n" + "wub__bato;";

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
