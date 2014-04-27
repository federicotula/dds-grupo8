package principal;

import java.util.*;

public class Corrector {
	private List parciales = new LinkedList();
	private Criterio criterio;
	
// METODOS	
	public double notaDelParcialSegunTuCriterio( Parcial unParcial ){

		return this.getCriterio().notaDelParcial(unParcial);
	
	}
	
	public void mostrarNotasParciales(){
		
		System.out.println("NOTAS DE TODOS LOS PARCIALES");
		
		
		Iterator iterador = this.getParciales().iterator();
		
		while (iterador.hasNext()) {
            Parcial elemento = (Parcial) iterador.next();
    		System.out.println("La nota de " + elemento.getNombre() + " es de: " + this.notaDelParcialSegunTuCriterio(elemento) );
        }
		
		System.out.println("YA CORREGI TODO!");
		
	}

	
// Getters y Setters	
	public Criterio getCriterio() {
		return criterio;
	}
	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	public List getParciales() {
		return parciales;
	}
	public void setParciales(List parciales) {
		this.parciales = parciales;
	}
}
