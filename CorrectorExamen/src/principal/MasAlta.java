package principal;

import java.util.*;

public class MasAlta extends CriterioComplejo {
	
// METODOS		
	public double notaDelParcial (Parcial unParcial){
		
		Iterator iterador = this.getCriterios().iterator();
		double notaMaxima = 0;
		
		while (iterador.hasNext()) {
            CriterioSimple elemento = (CriterioSimple) iterador.next();
            	if ( elemento.notaDelParcial(unParcial) > notaMaxima ){
            		notaMaxima = elemento.notaDelParcial(unParcial);
            	}
        }
		
		return notaMaxima;			
	}
	

}
