package com.venancio.dam.ExprRegulRIR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acentuadas {

	public static void main(String[] args) {

		String texto = "I. Disposiciones generales\r\n" + "MINISTERIO DE ECONOMÍA Y HACIENDA\r\n" + "Organización\r\n"
				+ "Orden de 24 de abril de 1998 por la que se autoriza a la Autoridad Portuaria de Las Palmas la constitución de una zona franca en Las Palmas de Gran Canaria.\r\n"
				+ "\r\n"
				+ "Corrección de errores de la Resolución de 24 de marzo de 1998, de la Agencia Estatal de Administración Tributaria, por la que se modifica la de 24 de marzo de 1992, sobre organización y atribución de funciones a la inspección de los tributos en el ámbito de la competencia del Departamento de Inspección Financiera y Tributaria.\r\n"
				+ "\r\n" + "Inspección de los tributos. Modelos de actas\r\n"
				+ "Corrección de erratas de la Resolución de 1 de abril de 1998, de la Dirección General de la Agencia Estatal de Administración Tributaria, por la que se aprueban los modelos de actas de la Inspección de Hacienda del Estado.\r\n"
				+ "\r\n" + "MINISTERIO DE INDUSTRIA Y ENERGÍA\r\n" + "Instrucciones técnicas complementarias\r\n"
				+ "Orden de 10 de marzo de 1998 por la que se modifica la Instrucción Técnica Complementaria MIE-AP5 del Reglamento de Aparatos a Presión sobre extintores de incendios.\r\n"
				+ "\r\n" + "Seguridad industrial\r\n"
				+ "Orden de 16 de abril de 1998 sobre normas de procedimiento y desarrollo del Real Decreto 1942/1993, de 5 de noviembre, por el que se aprueba el Reglamento de Instalaciones de Protección contra Incendios y se revisa el anexo I y los apéndices del mismo.\r\n"
				+ "\r\n" + "MINISTERIO DE AGRICULTURA, PESCA Y ALIMENTACIÓN\r\n" + "Sanidad animal\r\n"
				+ "Orden de 24 de abril de 1998 por la que se modifica la de 19 de febrero de 1998 por la que se regulan las medidas urgentes de Intervención dirigidas a erradicar la peste porcina clásica.\r\n"
				+ "\r\n" + "II. Autoridades y personal. - A. Nombramientos, situaciones e incidencias\r\n"
				+ "CONSEJO GENERAL DEL PODER JUDICIAL\r\n" + "Nombramientos\r\n"
				+ "Acuerdo de 21 de abril de 1998, de la Comisión Permanente del Consejo General del Poder Judicial, por el que se nombran Magistrado suplente y Jueces sustitutos para el año judicial 1997/1998, en el ámbito de los Tribunales Superiores de Justicia de Andalucía y Cataluña.\r\n"
				+ "\r\n"
				+ "Acuerdo de 22 de abril de 1998, del Pleno del Consejo General del Poder Judicial, por el que se nombra a don Francisco Morales Morales Magistrado suplente de la Sala Primera del Tribunal Supremo.\r\n"
				+ "\r\n" + "MINISTERIO DE JUSTICIA\r\n" + "Ceses\r\n"
				+ "Orden de 3 de marzo de 1998 por la que se dispone el cese como Presidente de la Comisión Nacional de Ayuda y Asistencia a las Víctimas de Delitos Violentos y contra la Libertad Sexual de don Jesús Marina Martínez Pardo.\r\n"
				+ "\r\n" + "Situaciones\r\n"
				+ "Resolución de 14 de abril de 1998, de la Dirección General de los Registros y del Notariado, por la que se jubila a don Catalino Ramírez Ramírez, Registrador de la Propiedad de Granollers número 1, por haber cumplido la edad reglamentaria.\r\n"
				+ "\r\n" + "MINISTERIO DE FOMENTO\r\n" + "Renuncias\r\n"
				+ "Orden de 31 de marzo de 1998 por la que se acepta la renuncia a la condición de funcionario de don Antonio Matarranz Marco, del Cuerpo Superior Postal y de Telecomunicación.\r\n"
				+ "\r\n" + "MINISTERIO DE EDUCACIÓN Y CULTURA\r\n" + "Nombramientos\r\n"
				+ "Orden de 7 de abril de 1998 por la que se modifica la de 21 de febrero de 1996 por la que se nombran funcionarios de carrera del Cuerpo de Maestros, a los aspirantes seleccionados en las pruebas selectivas convocadas por Orden de la Consejería de Cultura, Educación y Ciencia de la Generalidad Valenciana de 24 de junio de 1994, en lo que se refiere a la puntuación obtenida por doña Carmen Daras Martínez.\r\n"
				+ "\r\n" + "Destinos\r\n"
				+ "Orden de 13 de abril de 1998 por la que se hace pública la adjudicación de un puesto de trabajo convocado a libre designación por Orden de 26 de febrero de 1998.\r\n"
				+ "\r\n" + "MINISTERIO DE LA PRESIDENCIA\r\n" + "Destinos\r\n"
				+ "Orden de 22 de abril de 1998 por la que se adjudican puestos de trabajo de libre designación.\r\n"
				+ "\r\n" + "MINISTERIO DE SANIDAD Y CONSUMO\r\n" + "Nombramientos\r\n"
				+ "Resolución de 14 de abril de 1998, de la Dirección General de Recursos Humanos del INSALUD, por la que se nombra personal estatutario del INSALUD en la categoría de Facultativos Especialistas en Pediatría-Puericultura de Equipos de Atención Primaria, a los adjudicatarios de las pruebas selectivas convocadas por Resolución de 9 de febrero de 1996, de la Secretaría General del Instituto Nacional de la Salud («Boletín Oficial del Estado» del 28).\r\n"
				+ "\r\n" + "ADMINISTRACIÓN LOCAL\r\n" + "Nombramientos\r\n"
				+ "Resolución de 2 de marzo de 1998, del Ayuntamiento de Conil de la Frontera (Cádiz), por la que se hace público el nombramiento de cuatro Guardias de la Policía Local.\r\n"
				+ "\r\n"
				+ "Resolución de 1 de abril de 1998, del Ayuntamiento de Burgos, por la que se hace público el nombramiento de varios funcionarios.\r\n"
				+ "\r\n"
				+ "Resolución de 1 de abril de 1998, del Ayuntamiento de Mengibar (Jaén), por la que se hace público el nombramiento de un Ordenanza.\r\n"
				+ "\r\n"
				+ "Resolución de 2 de abril de 1998, del Ayuntamiento de Garganta de los Montes (Madrid), por la que se hace público el nombramiento de un Auxiliar de Administración General.\r\n"
				+ "\r\n" + "UNIVERSIDADES\r\n" + "Nombramientos\r\n"
				+ "Corrección de erratas de la Resolución de 31 de marzo de 1998, de la Universidad de La Coruña, por la que se nombra Profesor titular de Universidad del área de conocimiento de «Fundamentos de Análisis Económico» del Departamento de Análisis Económico a don José Méndez Naya.\r\n"
				+ "\r\n" + "subir\r\n" + "\r\n" + "II. Autoridades y personal. - B. Oposiciones y concursos\r\n"
				+ "MINISTERIO DE JUSTICIA\r\n" + "Notarías\r\n"
				+ "Resolución de 25 de marzo de 1998, de la Dirección General de los Registros y del Notariado, por la que se anuncia la provisión ordinaria de las Notarías vacantes, correspondientes a los grupos y turnos que se expresan, existentes en esta fecha.\r\n"
				+ "\r\n" + "Cuerpo de Auxiliares de la Administración de Justicia\r\n"
				+ "Acuerdo de 23 de abril de 1998, del Tribunal calificador de las pruebas selectivas para ingreso en el Cuerpo de Auxiliares de la Administración de Justicia, turno promoción interna, por el que se señalan fecha, hora y lugares en que tendrá lugar la prueba de mecanografía.\r\n"
				+ "\r\n" + "MINISTERIO DE ECONOMÍA Y HACIENDA\r\n" + "Cuerpos y Escalas de los grupos A y B\r\n"
				+ "Resolución de 14 de abril de 1998, de la Agencia Estatal de Administración Tributaria, por la que se convoca concurso específico y restringido para la provisión de puestos de trabajo (CE 8/1998).\r\n"
				+ "\r\n" + "MINISTERIO DE EDUCACIÓN Y CULTURA\r\n" + "Cuerpo de Maestros\r\n"
				+ "Orden de 7 de abril de 1998 por la que se modifica la de 4 de septiembre de 1997 por la que se nombran funcionarios en prácticas del Cuerpo de Maestros a los aspirantes seleccionados en el concurso-oposición convocado por Orden de 4 de abril de 1997, en lo que se refiere a la puntuación obtenida por doña Inmaculada Piñuela García.\r\n"
				+ "\r\n" + "Funcionarios docentes en el exterior\r\n"
				+ "Orden de 16 de abril de 1998 por la que se hace pública la composición de las Comisiones de Valoración del concurso de méritos para la provisión de vacantes de personal docente en el exterior, convocado por Orden de 10 de febrero de 1998.\r\n"
				+ "\r\n" + "Cuerpo de funcionarios docentes\r\n"
				+ "Resolución de 13 de abril de 1998, de la Dirección General de Personal y Servicios, por la que se aprueban las listas provisionales de cambio de adscripción y reingresos provisionales del profesorado especial de Institutos Técnicos de Enseñanzas Medias «a extinguir».\r\n"
				+ "\r\n" + "Funcionarios docentes en el exterior\r\n"
				+ "Resolución de 23 de abril de 1998, de la Dirección General de Personal y Servicios, por la que se aprueban las listas provisionales de admitidos y excluidos de la participación en el concurso de méritos para la provisión de vacantes de personal docente en el exterior, convocado por Orden de 10 de febrero de 1998, se abre un plazo de reclamaciones y se cita a la realización de la prueba de nivel de conocimiento de idiomas.\r\n"
				+ "\r\n" + "MINISTERIO DE SANIDAD Y CONSUMO\r\n" + "Personal sanitario de la Seguridad Social\r\n"
				+ "Resolución de 17 de abril de 1998, de la Dirección General de Recursos Humanos del Instituto Nacional de la Salud, por la que se establece la fecha y el procedimiento para la petición de plazas de Técnicos Especialistas en Radioterapia.\r\n"
				+ "\r\n" + "MINISTERIO DE MEDIO AMBIENTE\r\n" + "Cuerpos y Escalas de los grupos A y B\r\n"
				+ "Orden de 8 de abril de 1998 por la que se convoca concurso específico para la provisión de puestos de trabajo vacantes en el Departamento, para funcionarios de los grupos A y B.\r\n"
				+ "\r\n" + "COMUNIDAD AUTÓNOMA DE GALICIA\r\n" + "Cuerpos de funcionarios docentes\r\n"
				+ "Orden de 20 de abril de 1998, de la Consejería de Educación y Ordenación Universitaria, por la que se hace pública la Orden de 15 de abril de 1998, de convocatoria para la realización de procedimientos selectivos para la provisión de 202 plazas de funcionarios docentes en los Cuerpos Profesores de Enseñanza Secundaria, Profesores Técnicos de Formación Profesional, Profesores de Música y Artes Escénicas, Profesores y Maestros de Taller de Artes Plásticas y Diseño.\r\n"
				+ "\r\n" + "ADMINISTRACIÓN LOCAL\r\n" + "Personal funcionario y laboral\r\n"
				+ "Resolución de 20 de abril de 1998 del Ayuntamiento de Malpartida de Plasencia (Cáceres), referente a la convocatoria para proveer varias plazas.\r\n"
				+ "\r\n" + "UNIVERSIDADES\r\n" + "Cuerpos Docentes Universitarios\r\n"
				+ "Resolución de 2 de abril de 1998, de la Universidad del País Vasco, por la que se convoca concurso público para la provisión de diversas plazas de Cuerpos Docentes Universitarios.\r\n"
				+ "\r\n"
				+ "Resolución de 3 de abril de 1998, de la Universidad de Santiago de Compostela, por la que se hace pública la designación de las Comisiones que resolverán los concursos a plazas de profesorado.\r\n"
				+ "\r\n" + "Escala Auxiliar Administrativa\r\n"
				+ "Resolución de 14 de abril de 1998, de la Universidad de Jaén, por la que se aprueba la relación de aspirantes admitidos y excluidos y se nombra el Tribunal calificador de las pruebas selectivas de ingreso en la Escala Auxiliar Administrativa.";
		
		Pattern patronAcento = Pattern.compile("[A-Za-z]([a-z]+)?(á|é|í|ó|ú)([a-z]+)?");
		Matcher matAcentuadas = patronAcento.matcher(texto);

		int coincidencias = 0;

		while (matAcentuadas.find()) {
			System.out.println(matAcentuadas.group());
			coincidencias++;
		}
		System.out.println("Palabras acentuadas encontradas: " + coincidencias);

	}
}
