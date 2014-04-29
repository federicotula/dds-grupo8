package principal;

import java.util.Collection;

public class Equipo {

	private Collection<Jugador> equipoTentativo;
	private Collection<Jugador> equipoFinal;
	
// METODOS

	
	
// Getters y Setters
	public Collection<Jugador> getEquipoTentativo() {
		return equipoTentativo;
	}
	public void setEquipoTentativo(Collection<Jugador> equipoTentativo) {
		this.equipoTentativo = equipoTentativo;
	}
	public Collection<Jugador> getEquipoFinal() {
		return equipoFinal;
	}
	public void setEquipoFinal(Collection<Jugador> equipoFinal) {
		this.equipoFinal = equipoFinal;
	}

}
