
public class RetoMain {

	public static void main(String[] args) {
		
		Modulo fol = new Modulo("Formacion y orientacion laboral");
		Modulo bd = new Modulo("Bases de datos");
		Modulo prog = new Modulo("Programacion");
		Modulo si = new Modulo("Sistemas informaticos");
		Modulo ed = new Modulo("entornos de desarrollo");
		Alumno a1 = new Alumno();
		Notas [ ]notasAlumn = new Notas[5];
		
		for (int i=0;i<3;i++) {
			//nombre del alumno
			System.out.println("Introduce informacion del alumno");
			System.out.print("Nombre Alumno "+(i+1)+": ");
			a1.setNombre(Console.readString());
			// notas del alumno
			System.out.println("Notas del alumno");
			for (int j=0;j<5;j++) {
				System.out.print("Seleccione evaluacion: ");
				notasAlumn[j]=new Notas();
				System.out.print("Nota de fol: ");
				notasAlumn[j].setEvaluacion(Console.readInt());
				notasAlumn[j].setModulo(fol);
				notasAlumn[j].setNota(Console.readDouble());
				System.out.println(notasAlumn[j].getEvaluacion()+","+notasAlumn[j].getNota()+","+notasAlumn[j].getModulo());
			}
			for (int j=0;j<5;j++) {
				System.out.println(notasAlumn[j].getEvaluacion()+","+notasAlumn[j].getNota()+","+notasAlumn[j].getModulo());
			}
		}

		


	}

}
