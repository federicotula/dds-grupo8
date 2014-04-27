package principal;

public class ReglaDeTres extends CriterioSimple {
	

// METODOS		
	public double notaDelParcial (Parcial unParcial){
		
		Double pesoObtenido = new Double(unParcial.pesoObtenidoParcial());
		Double pesoParcial = new Double(unParcial.pesoParcial());
		
		if (unParcial.pesoParcial() != 0){
			return pesoObtenido.doubleValue() * 10 / pesoParcial.doubleValue();
		} else {
			return 0;
		}
			
	}

}
