
public class RetoMain {

	public static void main(String[] args) {
		
		String [] listaModulos = {"PROGRAMACION","BASES DE DATOS","SISTEMAS INFORMATICOS","FOL",
				"LENGUAJE DE MARCAS","ENTORNO DE DESRROLLOS"};
		Grupo gruposClases [];
		Alumno a1 = new Alumno();
		Nota [ ]notasAlumn = new Nota[5];
		int numGrupos,numAlumnos;
		
		for (int i=0;i<3;i++) {
			//nombre del alumno
			System.out.println("Introduce informacion del alumno");
			System.out.print("Nombre Alumno "+(i+1)+": ");
			a1.setNombre(Console.readString());
			// notas del alumno
			System.out.println("Notas del alumno");
			for (int j=0;j<listaModulos.length;j++) {

				notasAlumn[j]=new Nota();
				System.out.print("Seleccione evaluacion: ");
				notasAlumn[j].setEvaluacion(Console.readInt());
				Modulo mod = new Modulo(listaModulos[j]);
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
