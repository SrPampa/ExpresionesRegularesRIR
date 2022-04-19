package com.venancio.dam.ExprRegulRIR;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RaízB {

	public static void main(String[] args) {

		String texto = "oler \r\n" + "Del lat. olēre.\r\n" + "\r\n" + "Conjug. modelo.\r\n" + "\r\n"
				+ "1. tr. Percibir los olores.\r\n" + "\r\n"
				+ "2. tr. Procurar percibir o identificar un olor. U. t. c. intr.\r\n" + "\r\n"
				+ "3. tr. coloq. Conocer o adivinar algo que se juzgaba oculto, barruntarlo. U. m. c. prnl. Me huelo que no vendrá a la boda. U. t. c. intr. Me huele que será niña.\r\n"
				+ "\r\n"
				+ "4. tr. coloq. Inquirir con curiosidad y diligencia lo que hacen otros, para aprovecharse de ello o con algún otro fin.\r\n"
				+ "\r\n"
				+ "5. intr. Exhalar y echar de sí fragancia que deleita el sentido del olfato, o hedor que le molesta.\r\n"
				+ "\r\n"
				+ "6. intr. coloq. Parecer o tener señas y visos de algo, que por lo regular es malo. Este político huele A imputado.\r\n"
				+ "\r\n" + "andar, o estar, oliendo donde guisan\r\n" + "\r\n"
				+ "1. locs. verbs. coloqs. Buscar ocasiones favorables para satisfacer los gustos y provechos.\r\n"
				+ "\r\n" + "no oler bien algo\r\n" + "\r\n"
				+ "1. loc. verb. coloq. Dar sospecha de que encubre un daño o fraude.\r\n" + "\r\n"
				+ "oler mal algo\r\n" + "\r\n" + "1. loc. verb. coloq. no oler bien." + "olor\r\n"
				+ "Del lat. vulg. olor, -ōris, y este del lat. odor, -ōris.\r\n" + "\r\n"
				+ "1. m. Impresión que los efluvios producen en el olfato.\r\n" + "\r\n"
				+ "2. m. Aquello que es capaz de producir olor.\r\n" + "\r\n"
				+ "3. m. Esperanza, promesa u oferta de algo.\r\n" + "\r\n"
				+ "4. m. Sospecha de algo que está oculto o por suceder.\r\n" + "\r\n"
				+ "5. m. desus. olfato (‖ sentido corporal).\r\n" + "\r\n" + "de olor\r\n" + "\r\n"
				+ "1. loc. adj. Aromático o perfumado. Hierbas, loción de olor.\r\n" + "\r\n"
				+ "en olor de multitud\r\n" + "\r\n" + "1. loc. adv. Con la admiración de muchas personas.\r\n" + "\r\n"
				+ "en olor de santidad\r\n" + "\r\n" + "1. loc. adv. Con fama y reputación.\r\n" + "\r\n"
				+ "estar alguien al olor\r\n" + "\r\n" + "1. loc. verb. coloq. estar al husmo.";
		
		Pattern p1 = Pattern.compile("(^|\\W)(ol|huel|Ol|Huel)([a-z]+)(\\W|$)");
		Matcher mat = p1.matcher(texto);

		ArrayList<String> palabras = new ArrayList<String>();

		while (mat.find()) {
			String a = mat.group().replaceAll("\\W", "");
			if (!palabras.contains(a)) {
				palabras.add(a);
			}
		}
		
		for (int i = 0; i < palabras.size(); i++) {
			System.out.println(i+1 + ". " + palabras.get(i));
		}
		
		
	}
}
