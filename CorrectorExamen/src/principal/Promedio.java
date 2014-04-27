package principal;

import java.util.Iterator;

public class Promedio extends CriterioComplejo {
	
// METODOS		
	public double notaDelParcial (Parcial unParcial){
		
		Iterator iterador = this.getCriterios().iterator();
		double sumaNotas = 0;
		
		while (iterador.hasNext()) {
            CriterioSimple elemento = (CriterioSimple) iterador.next();
            	sumaNotas = sumaNotas + elemento.notaDelParcial(unParcial);
        }
		
		return sumaNotas / this.getCriterios().size();			
	}

}
