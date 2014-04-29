package principal;


public abstract class Inscripcion {

	private Jugador jugador;
	
	public String nombreJugador(){
		return this.getJugador().getNombre();
	}
	protected abstract int prioridadInscripcion();
	
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	
}

