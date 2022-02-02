
public class Modulo {

	private String nombre;
	private int id;
	private static int identificador=1;
	
	public Modulo(String nombre) {
		
		this.nombre=nombre;
		this.id=identificador;
		identificador++;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Modulo.identificador = identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
