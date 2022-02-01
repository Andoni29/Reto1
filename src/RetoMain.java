
public class RetoMain {

	public static void main(String[] args) {
		

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

				notasAlumn[j]=new Notas();
				System.out.print("Seleccione evaluacion: ");
				notasAlumn[j].setEvaluacion(Console.readInt());
				System.out.print("Introduce modulo: ");
				Modulo mod = new Modulo(Console.readString());
				notasAlumn[j].setModulo(mod);
				System.out.println("Introduce nota de "+notasAlumn[j].getModulo());
				notasAlumn[j].setNota(Console.readDouble());
				System.out.println(notasAlumn[j].getEvaluacion()+","+notasAlumn[j].getNota()+","+notasAlumn[j].getModulo());
			}
			for (int j=0;j<5;j++) {
				System.out.println(notasAlumn[j].getEvaluacion()+","+notasAlumn[j].getNota()+","+notasAlumn[j].getModulo());
			}
		}

		


	}

}
