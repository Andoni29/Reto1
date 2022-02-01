
public class Alumno {
	
	private String nombre;
	private Notas [] notas;
	private int numAlumno;
	private static int identificador=1;
	
	public Alumno() {
		this.numAlumno=identificador;
		identificador++;
	}
	
	public void setNotas(Notas[] notas) {
		this.notas = notas;
	}

	public Alumno (String nombre, Notas [] notasAlumn) {
		this.nombre=nombre;
		this.notas=notasAlumn;
		this.numAlumno=identificador;
		identificador++;
	}
	public static int getIdentificador() {
		return identificador;
	}
	public static void setIdentificador(int identificador) {
		Alumno.identificador = identificador;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNumAlumno(int numAlumno) {
		this.numAlumno = numAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumAlumno() {
		return numAlumno;
	}
	
	public void imprimir() {
		for(int i=0;i<notas.length;i++) {
			System.out.println(this.nombre+", "+this.numAlumno+this.notas[i].toString());;
		}
	}

	
}
