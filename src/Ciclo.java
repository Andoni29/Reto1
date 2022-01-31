
public class Ciclo {

	private String identificador;
	private Grupo [] grupos;
	
	public Ciclo(String id, Grupo [] grupos) {
		this.identificador=id;
		this.grupos=grupos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public Grupo[] getGrupos() {
		return grupos;
	}
	
	

}
