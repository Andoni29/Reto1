
public class Alumno {
	
	private String nombre;
	private Nota [] notas;
	private int numAlumno;
	private static int identificador=1;
	
	public Alumno() {
		
		this.numAlumno=identificador;
		identificador++;
	}
	
	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	public Alumno (String nombre, Nota [] notasAlumn) {
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
	
	public Nota getNota(int id) {
		return this.notas[id];
	}
	public String getIdNota(int id) {
		return this.notas[id].getNombreModulo();
	}
	
	public double getNotaNum(int id) {
		return this.notas[id].getNota();
	}
	public void verMediaAlumno() {
		double media=0;
		for(int i=0;i<this.notas.length;i++) {
			media=this.notas[i].getNota()+media;
		}
		System.out.println(media/this.notas.length);
	}
	
	public void cambiarNota() {
		double nuevaNota;
		for(int i=0;i<notas.length;i++) {
			System.out.print("introduce  nota de "+this.notas[i].getNombreModulo()+": ");
			nuevaNota = Console.readDouble();
			this.notas[i].setNota(nuevaNota);
		}
	}
	
	public void verNotas() {
		for(int i=0;i<this.notas.length;i++) {
			System.out.println(this.notas[i].getNombreModulo()+": "+this.notas[i].getNota());
		}
	}
	
}
