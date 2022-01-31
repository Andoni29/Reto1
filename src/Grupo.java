
public class Grupo {

	private Modulo [] modulos;
	private String identificador;
	private Alumno [] alumnos;
	
	public Grupo(Modulo [] modulos,String id, Alumno [] alumnos) {
		this.modulos=modulos;
		this.identificador=id;
		this.alumnos=alumnos;
	}

	public Modulo[] getModulos() {
		return modulos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}
}
