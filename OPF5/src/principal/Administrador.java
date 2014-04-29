package principal;

import java.util.Collection;
import java.util.Date;

public class Administrador {

	private Collection<Partido> partidos;

	
	
// METODOS

	public Partido crearPartido(Date elDia){
		Partido partido = new Partido();
		partido.setDia(elDia);
		return partido;
	}
	
	public void cambiarFechaPartido(Partido unPartido, Date nuevaFecha){
		unPartido.setDia(nuevaFecha);
	}
	
	
// Getters y Setters
	public Collection<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(Collection<Partido> partidos) {
		this.partidos = partidos;
	}
	
}
