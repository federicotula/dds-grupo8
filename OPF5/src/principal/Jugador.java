package principal;

public class Jugador {

	private String nombre;
	private int penalizaciones;
	private int partidosJugados;
	
// METODOS
	public void inscribirmeEstandarEn(Partido unPartido){
		 if ( unPartido.todosAsegurados() ){
			 Estandar unaInscripcion = new Estandar();
			 unaInscripcion.setJugador(this);		 
			 unPartido.inscribirJugador(unaInscripcion);
		 } else {
			 this.errorTodosConfirmados();
		 }
	}
	public void inscribirmeSolidariaEn(Partido unPartido){
		 if ( unPartido.todosAsegurados() ){
			 Estandar unaInscripcion = new Estandar();
			 unaInscripcion.setJugador(this);		 
			 unPartido.inscribirJugador(unaInscripcion);
		 } else {
			 this.errorTodosConfirmados();
		 }
	}
	public void inscribirmeCondicionalEn(Partido unPartido){
		 if ( unPartido.todosAsegurados() ){
			 Estandar unaInscripcion = new Estandar();
			 unaInscripcion.setJugador(this);		 
			 unPartido.inscribirJugador(unaInscripcion);
		 } else {
			 this.errorTodosConfirmados();
		 }
	}
	
	private void errorTodosConfirmados(){
		System.out.println("No se pudo concreatar la inscripcion de: " + this.getNombre() + ". Porque hay 10 inscriptos de forma estandar. ");
	}
// Getters y Setters	
	public int getPenalizaciones() {
		return penalizaciones;
	}
	public void setPenalizaciones(int penalizaciones) {
		this.penalizaciones = penalizaciones;
	}
	public int getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
