package principal;

import java.util.*;

public class Parcial {
	private String nombre = "";
	private List respuestas = new LinkedList();

// METODOS	
	public int pesoObtenidoParcial(){

		int pesoObtenido = 0;
		Iterator iterador = this.getRespuestas().iterator();
		
		while (iterador.hasNext()) {
            Respuesta elemento = (Respuesta) iterador.next();
            pesoObtenido = pesoObtenido + elemento.pesoObtenidoRespuesta();
        }
		
		return pesoObtenido;
		
	}
	
	public int pesoParcial(){

		int peso = 0;
		Iterator iterador = this.getRespuestas().iterator();
		
		while (iterador.hasNext()) {
            Respuesta elemento = (Respuesta) iterador.next();
            peso = peso + elemento.getPeso();
        }
		
		return peso;
		
	}

// Getters y Setters
	public List getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(List respuestas) {
		this.respuestas = respuestas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
