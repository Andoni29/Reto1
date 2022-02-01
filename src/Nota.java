
public class Nota {

	private double nota;
	private Modulo modulo;
	private int evaluacion;
	
	public Nota() {
		nota=0;
		evaluacion=0;
	}
	public Nota(double nota,Modulo modulo, int eval) {
		this.nota=nota;
		this.modulo=modulo;
		this.evaluacion=eval;
	}


	public String getModulo() {
		return modulo.getNombre();
	}


	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


	public void setEvaluacion(int evaluacion) {
		this.evaluacion = evaluacion;
	}


	public double getNota() {
		return nota;
	}


	public int getEvaluacion() {
		return evaluacion;
	}
	
	public String toString() {
		return "nota: "+this.nota;
	}
}
