public class prueba {
	

	public static void main(String[] args) {

		String [] modulos =  {"PROGRAMACION","BASES DE DATOS","SISTEMAS INFORMATICOS","FOL",
				"LENGUAJE DE MARCAS","ENTORNO DE DESRROLLOS"};
		Ciclo curso = new Ciclo();
		Grupo [] clases;
		Alumno [] alumnos;
		Nota [] notas= new Nota[modulos.length];
		char finPrograma='s';
		int numClases,numAlumnos,evaluacion;

		do {
			System.out.println("Introduzca el nombre del curso");
			curso.setIdentificador(Console.readString());
			System.out.println("Introduce numero de clases");
			numClases = Console.readInt();
			clases = new Grupo [numClases];
			for(int i=0;i<clases.length;i++) {
				clases[i] = new Grupo();
				System.out.println("Introduzca idenitificador de la clase");
				clases[i].setIdentificador(Console.readString());
				System.out.println("Cuantos alumnos tiene la clase "+(i+1));
				numAlumnos = Console.readInt();
				alumnos = new Alumno[numAlumnos];
				System.out.println("De que evaluacion quiere intoducir las notas");
				evaluacion = Console.readInt();
				for(int j=0;j<alumnos.length;j++) {
					alumnos[j] = new Alumno();
					System.out.println("nombre del alumno");
					alumnos[j].setNombre(Console.readString());
					System.out.println("Nota del alumno "+ (i+1));
					for(int k=0;k<modulos.length;k++) {
						System.out.println(modulos[k]);
						notas[k] = new Nota();
						notas[k].setEvaluacion(evaluacion);
						System.out.print("Introduce modulo: ");
						Modulo mod = new Modulo(Console.readString());
						notas[k].setModulo(mod);
						System.out.println("Introduce nota de "+notas[k].getModulo());
						notas[k].setNota(Console.readDouble());
					}
					alumnos[i].setNotas(notas);
				}
				clases[i].setAlumnos(alumnos);
				
			}
			curso.setClases(clases);
			System.out.println("desea continuar? s/n");
			finPrograma = Console.readChar();
		}while(finPrograma=='s');
	}

}