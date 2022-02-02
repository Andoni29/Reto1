
public class Grupo {

	private Modulo [] modulos;
	private String identificador;
	private Alumno [] alumnos;
	
	public Grupo(Modulo [] modulos,String id, Alumno [] alumnos) {
		this.modulos=modulos;
		this.identificador=id;
		this.alumnos=alumnos;
	}
	public Grupo() {
	}

	public void setModulos(Modulo[] modulos) {
		this.modulos = modulos;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
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
	
	public void verMedia(int numAlumno) {
		for(int i=0;i<alumnos.length;i++) {
			if(this.alumnos[i].getNumAlumno()==numAlumno) {
				this.alumnos[i].verMediaAlumno();
			}
		}
	}
	
	public void listaAlumnos() {
		for(int i=0;i<alumnos.length;i++) {
			System.out.println((i+1)+". "+this.alumnos[i].getNombre()+ ", numero de clase "+this.alumnos[i].getNumAlumno());
		}
	}
	public void verNotaModulo() {
		String selecModulo;
		
		System.out.println("Seleccione modulo");
		selecModulo = Console.readString();
		for(int i=0;i<this.alumnos.length;i++) {
			if(this.alumnos[i].getIdNota(i).equalsIgnoreCase(selecModulo)) {
				System.out.println("media de "+this.alumnos[i].getNombre()+": "+this.alumnos[i].getNotaNum(i));
			}
		}
		
	}
	
	public void cambiarNotas(int id){
		for(int i=0;i<alumnos.length;i++) {
			if(this.alumnos[i].getNumAlumno()==id) {
				this.alumnos[i].cambiarNota();
			}
		}
	}
	
	public void verNotasAlumno(int idAlumn) {
		for(int i=0;i<alumnos.length;i++) {
			if(this.alumnos[i].getNumAlumno()==idAlumn) {
				this.alumnos[i].verNotas();
			}
		}
	}
	
}
