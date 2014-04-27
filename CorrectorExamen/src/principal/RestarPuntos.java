package principal;

public class RestarPuntos extends CriterioSimple {

	private int puntosARestar;
	
// METODOS	
	public double notaDelParcial (Parcial unParcial){
		
		double nota = unParcial.pesoObtenidoParcial() - this.getPuntosARestar();
			if (nota > 10){
				return 10;
			} else if (nota < 0) {
				return 0;
			}
			return nota;
	}

// Getters y Setters
	public int getPuntosARestar() {
		return puntosARestar;
	}
	public void setPuntosARestar(int puntosARestar) {
		this.puntosARestar = puntosARestar;
	}
	
	
}
