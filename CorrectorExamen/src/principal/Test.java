package principal;

import java.util.*;

public class Test {

	
	
	public static void main (String[] args){
// CRITERIOS
		RestarPuntos criterioRestaPuntos = new RestarPuntos();
			criterioRestaPuntos.setPuntosARestar(6);
		ReglaDeTres criterioReglaDeTres = new ReglaDeTres();
		TablaConversion criterioTablaConversion = new TablaConversion();
		
// CONVERSIONES		
		List listaConversion = new LinkedList();
		Conversion conversion10 = Test.crearConversion(16, 10);
		Conversion conversion9 = Test.crearConversion(15, 9);
		Conversion conversion8 = Test.crearConversion(14, 8);
		Conversion conversion7 = Test.crearConversion(13, 7);
		Conversion conversion6 = Test.crearConversion(12, 6);
		Conversion conversion5 = Test.crearConversion(11, 5);
		Conversion conversion4 = Test.crearConversion(10, 4);
		Conversion conversion3 = Test.crearConversion(9, 3);
		Conversion conversion2 = Test.crearConversion(8, 2);
		Conversion conversion1 = Test.crearConversion(7, 1);
		listaConversion.add(conversion10);
		listaConversion.add(conversion9);
		listaConversion.add(conversion8);
		listaConversion.add(conversion7);
		listaConversion.add(conversion6);
		listaConversion.add(conversion5);
		listaConversion.add(conversion4);
		listaConversion.add(conversion3);
		listaConversion.add(conversion2);
		listaConversion.add(conversion1);
		criterioTablaConversion.setConversiones(listaConversion);
// FIN CONVERSIONES
		
		MasAlta criterioMasAlta = new MasAlta();
			criterioMasAlta.getCriterios().add(criterioRestaPuntos);
			criterioMasAlta.getCriterios().add(criterioReglaDeTres);
		Promedio criterioPromedio = new Promedio();
			criterioPromedio.getCriterios().add(criterioRestaPuntos);
			criterioPromedio.getCriterios().add(criterioReglaDeTres);
			criterioPromedio.getCriterios().add(criterioTablaConversion);
// FIN CRITERIOS
			
// PARCIAL
		Parcial parcial1 = new Parcial();
			parcial1.setNombre("Federico");
			
	// RESPUESTAS ( 10 PUNTOS )
		Respuesta respuesta1 = Test.crearRespuesta(5, "China", "China");
		Respuesta respuesta2 = Test.crearRespuesta(5, "V", "F");	
		Respuesta respuesta3 = Test.crearRespuesta(1, "5", "2");
		Respuesta respuesta4 = Test.crearRespuesta(1, "3", "3");
		Respuesta respuesta5 = Test.crearRespuesta(1, "Japon", "Japon");
		Respuesta respuesta6 = Test.crearRespuesta(1, "Matematica", "Matematica");
		Respuesta respuesta7 = Test.crearRespuesta(1, "4", "4");
		Respuesta respuesta8 = Test.crearRespuesta(1, "1", "1");		
	// FIN RESPUESTAS
		parcial1.getRespuestas().add(respuesta1);
		parcial1.getRespuestas().add(respuesta2);
		parcial1.getRespuestas().add(respuesta3);
		parcial1.getRespuestas().add(respuesta4);
		parcial1.getRespuestas().add(respuesta5);
		parcial1.getRespuestas().add(respuesta6);
		parcial1.getRespuestas().add(respuesta7);
		parcial1.getRespuestas().add(respuesta8);
// FIN PARCIAL
		
// CORRECTOR
Corrector corrector = new Corrector();
corrector.getParciales().add(parcial1);
corrector.getParciales().add(parcial1);
corrector.getParciales().add(parcial1);
corrector.setCriterio(criterioPromedio);

// TEST
System.out.println(parcial1.pesoParcial() + "   " + parcial1.pesoObtenidoParcial());
System.out.println("La nota de " + parcial1.getNombre() + " es de: " + corrector.notaDelParcialSegunTuCriterio(parcial1));
System.out.println();
corrector.mostrarNotasParciales();

	}
	private static Conversion crearConversion(int puntosNecesarios, int notaCorrespondiente){
		Conversion conversionTest = new Conversion();
		conversionTest.setNotaCorrespondiente(notaCorrespondiente);
		conversionTest.setPuntosNecesarios(puntosNecesarios);
		
		return conversionTest;
	}
	private static Respuesta crearRespuesta(int peso, String correcto, String alumno){
		Respuesta respuestaTest = new Respuesta();
		respuestaTest.setPeso(peso);
		respuestaTest.setRespuestaAlumno(alumno);
		respuestaTest.setRespuestaCorrecta(correcto);
		return respuestaTest;
	}
	
}
