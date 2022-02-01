public class prueba {
	

	public static void main(String[] args) {

		String [] modulosInfor =  {"PROGRAMACION","BASES DE DATOS","SISTEMAS INFORMATICOS","FOL",
				"LENGUAJE DE MARCAS","ENTORNO DE DESRROLLOS","INGLES"};
		String [] modulosMarketing = {"FOL","MARKETING","DISEÑO","ECONOMIA","BASES DE DATOS","INGLES","DESARROLLO WEB"};
		Ciclo curso = new Ciclo();
		Grupo [] clases;
		Alumno [] alumnos;
		Nota [] notas= new Nota[modulosInfor.length];
		Modulo mod;
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
					for(int k=0;k<modulosInfor.length;k++) {
						notas[k] = new Nota();
						if(curso.getIdentificador().equalsIgnoreCase("informatica")) {
							 mod = new Modulo(modulosInfor[k]);
						}else {
							 mod = new Modulo(modulosMarketing[k]);
						}
						notas[k].setModulo(mod);
						System.out.println(notas[k].getNombreModulo());

						notas[k].setEvaluacion(evaluacion);
						System.out.print("Introduce nota de "+notas[k].getNombreModulo()+": ");
						notas[k].setNota(Console.readDouble());
					}
					alumnos[j].setNotas(notas);
				}
				clases[i].setAlumnos(alumnos);
				
			}
			curso.setClases(clases);
			System.out.println("desea continuar? s/n");
			finPrograma = Console.readChar();
		}while(finPrograma=='s');
	}

}