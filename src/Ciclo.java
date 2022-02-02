
public class Ciclo {

	private String identificador;
	private Grupo [] grupos;
	
	public Ciclo(String id, Grupo [] grupos) {
		
		this.identificador=id;
		this.grupos=grupos;
	}
	
	public Ciclo() {

	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setGrupos(Grupo[] grupos) {
		this.grupos = grupos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public Grupo[] getGrupos() {
		return grupos;
	}

	public void setClases(Grupo[] clases) {
		this.grupos = clases;
		
	}
	
	public void verMedia() {
		String selecGrupo;
		int selecAlumno;
		for(int i=0;i<this.grupos.length;i++) {
			System.out.println("Introduzca el nombre del grupo del que quiera ver la media");
			System.out.println(i+". "+this.grupos[i].getIdentificador());
		}
		selecGrupo = Console.readString();
		
		for(int i=0;i<this.grupos.length;i++) {
			if(this.grupos[i].getIdentificador().equalsIgnoreCase(selecGrupo)) {
				this.grupos[i].getAlumnos();
				System.out.println("Introduzca numero del alumno");
				selecAlumno = Console.readInt();
				this.grupos[i].verMedia(selecAlumno);
				
			}
		}
	}
	
	public void getIDGrupos() {
		for(int i=0;i<grupos.length;i++) {
			System.out.println(this.grupos[i].getIdentificador());
		}
	}
	
	public void imprimiAlumnos(String id) {
		for(int i=0;i<grupos.length;i++) {
			if(grupos[i].getIdentificador()==id) {
				grupos[i].listaAlumnos();
			}
			
		}
	}
	
	public void cambiarNotasGrupo(String idGrup, int idAlum) {
		for(int i=0;i<grupos.length;i++) {
			if(this.grupos[i].getIdentificador()==idGrup) {
				this.grupos[i].cambiarNotas(idAlum);
			}
		}
	}
	
	public void verNotasAlumno(int numAlumno,String idGrup) {
		for(int i=0;i<grupos.length;i++) {
			if(this.grupos[i].getIdentificador()==idGrup) {
				this.grupos[i].verNotasAlumno(numAlumno);
			}
		}
	}

}
