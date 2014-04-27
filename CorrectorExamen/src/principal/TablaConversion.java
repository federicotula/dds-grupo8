package principal;

import java.util.*;

public class TablaConversion extends CriterioSimple {

	private List conversiones = new LinkedList();
	
// METODOS		
	public double notaDelParcial (Parcial unParcial){
		
		Iterator iterador = this.getConversiones().iterator();		
		
		while (iterador.hasNext()) {
            Conversion elemento = (Conversion) iterador.next();
            	if ( elemento.getPuntosNecesarios() == unParcial.pesoObtenidoParcial() ){
            		return elemento.getNotaCorrespondiente();
            	}
        }
		
		return 0;			
	}
	
// Getters y Setters
	public List getConversiones() {
		return conversiones;
	}
	public void setConversiones(List conversiones) {
		this.conversiones = conversiones;
	}
	
	
}
