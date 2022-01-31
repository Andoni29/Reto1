
public class Alumno {
	
	private String nombre;
	private Notas [] notas;
	private int numAlumno;
	private static int identificador;
	
	public Alumno (String nombre, Notas [] notasAlumn) {
		this.nombre=nombre;
		this.notas=notasAlumn;
		this.numAlumno=identificador;
		identificador++;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumAlumno() {
		return numAlumno;
	}

	
}
