package principal;

import java.util.*;

public abstract class CriterioComplejo extends Criterio {

	private List criterios = new LinkedList();
	
	protected abstract double notaDelParcial (Parcial unParcial);
	
// Getters y Setters
	public List getCriterios() {
		return criterios;
	}
	public void setCriterios(List criterios) {
		this.criterios = criterios;
	}
	

}
