package principal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.*;

public class Partido {

	private Collection<Inscripcion> jugadoresInscriptos;
	private Equipo equipoLocal;
	private int golesLocal;
	private Equipo equipoVisitante;
	private int golesVisitante;
	private Date dia;
	
// METODOS
 public void inscribirJugador(Inscripcion unaInscripcion){
	 this.getJugadoresInscriptos().add(unaInscripcion);
 }
	

 public boolean todosAsegurados(){
	
	Iterator<Inscripcion> iterador = this.getJugadoresInscriptos().iterator();
	int cantidadEstandar = 0;
	while (iterador.hasNext()) {
        Inscripcion unaInscripcion = (Inscripcion) iterador.next();
 		if (unaInscripcion.prioridadInscripcion() == 1){
 			cantidadEstandar = cantidadEstandar + 1;
 		};
    }
	
	return cantidadEstandar == 10;
	 
 }
 
 public void ordenarInscripciones(){

	 	/*
		Iterator<Inscripcion> iterador = this.getJugadoresInscriptos().iterator();
		int cantidadEstandar = 0;
		
		boolean ordenado = true;
		while (iterador.hasNext()) {
	        Inscripcion unaInscripcion = (Inscripcion) iterador.next();
	 		if (unaInscripcion.prioridadInscripcion() == 1){
	 			cantidadEstandar = cantidadEstandar + 1;
	 		};
	    }	 
*/
	 Collections.sort(this.getJugadoresInscriptos(), comparatorPoint);
 }			 
 
 public class customComparator {
	    public boolean compare(Inscripcion object1, Inscripcion object2) {
	        return object1.prioridadInscripcion() > object2.prioridadInscripcion();
	    }
	}
 
 
 
// Getters y Setters
	public Collection<Inscripcion> getJugadoresInscriptos() {
		return jugadoresInscriptos;
	}
	public void setJugadoresInscriptos(Collection<Inscripcion> jugadoresInscriptos) {
		this.jugadoresInscriptos = jugadoresInscriptos;
	}
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	
}
