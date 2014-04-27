package principal;

public class Respuesta {

	private String respuestaAlumno;
	private String respuestaCorrecta;
	private int peso;


// METODOS	
	public boolean contestoBien() {
		return this.getRespuestaAlumno() == this.getRespuestaCorrecta();
	}
	
	public int pesoObtenidoRespuesta(){
		if (this.contestoBien()){
			return this.getPeso();
		} else {
			return 0;
		}
	}
	
// Getters y Setters
	public String getRespuestaAlumno(  ){
		return this.respuestaAlumno;
	}
	public void setRespuestaAlumno( String respuesta ){
		this.respuestaAlumno = respuesta;
	}
	public String getRespuestaCorrecta(  ){
		return this.respuestaCorrecta;
	}
	public void setRespuestaCorrecta( String respuesta ){
		this.respuestaCorrecta = respuesta;
	}
	public int getPeso(  ){
		return this.peso;
	}
	public void setPeso( int peso ){
		this.peso = peso;
	}
	
	
	
}
