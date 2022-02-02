
public class prueba {
	

	public static Nota introducirNotas(Ciclo curso,int evaluacion, int i) {
		Nota nota = new Nota();
		String [] modulosInfor =  {"PROGRAMACION","BASES DE DATOS","SISTEMAS INFORMATICOS","FOL",
				"LENGUAJE DE MARCAS","ENTORNO DE DESRROLLOS","INGLES"};
		String [] modulosMarketing = {"FOL","MARKETING","DISEÑO","ECONOMIA","BASES DE DATOS","INGLES","DESARROLLO WEB"};
		Modulo mod;
		
			nota = new Nota();
			if(curso.getIdentificador().equalsIgnoreCase("informatica")) {
				 mod = new Modulo(modulosInfor[i]);
			}else {
				 mod = new Modulo(modulosMarketing[i]);
			}
			nota.setModulo(mod);
			System.out.println(nota.getNombreModulo());

			nota.setEvaluacion(evaluacion);
			System.out.print("Introduce nota de "+nota.getNombreModulo()+": ");
			do {
			nota.setNota(Console.readDouble());
			if(nota.getNota()<0 || nota.getNota()>10) {
				System.out.println("nota no valida");
			}
			}while(nota.getNota()<0 || nota.getNota()>10);
			return nota;
	}

	public static void main(String[] args) {

		int numCurso;
		Ciclo curso = new Ciclo();
		Grupo [] clases;
		Alumno [] alumnos;
		Nota [] notas= new Nota[7];
		int numClases,numAlumnos,evaluacion,seleccion=0;
		String nombreCurso="";
		String selecGrupo;
		int selecAlumno;
		
		//nombre curso
		do {
		System.out.println("Introduzca el numero del curso (1 = informatica | 2 = marketing)");
		numCurso= Console.readInt();
		if(numCurso <1 || numCurso>2) {
			System.out.println("introduzca 1 para informatica o 2 para marketing");
		}else if(numCurso ==1) {
			nombreCurso="Informatica";
		}else {
			nombreCurso="Marketing";
		}
		}while(numCurso<1 || numCurso>2);
		curso.setIdentificador(nombreCurso);
		//numero de clases que hay en el curso
		System.out.println("Introduce numero de clases");
		numClases = Console.readInt();
		clases = new Grupo [numClases];
		
		for(int i=0;i<clases.length;i++) {
			//identificador de cada clase
			clases[i] = new Grupo();
			System.out.println("Introduzca idenitificador de la clase");
			clases[i].setIdentificador(Console.readString());
			//alumnos de cada clase
			System.out.println("Cuantos alumnos tiene la clase "+(i+1));
			numAlumnos = Console.readInt();
			alumnos = new Alumno[numAlumnos];
			//escoger la evaluacion de las notas
			do {
				System.out.println("De que evaluacion quiere intoducir las notas");
				evaluacion = Console.readInt();
				if(evaluacion<1 || evaluacion>3) {
					System.out.println("evaluacion no valida");
				}
			}while(evaluacion<1 || evaluacion>3);
			
			//introducir nota de cada alumno
			for(int j=0;j<alumnos.length;j++) {
				
				alumnos[j] = new Alumno();
				System.out.println("nombre del alumno");
				alumnos[j].setNombre(Console.readString());
				System.out.println("Nota del alumno "+ (i+1));
				//guardar cada dato en su respectivo array
				for(int k=0;k<7;k++) {
					notas[k] = introducirNotas(curso,evaluacion,k);
				}
				alumnos[j].setNotas(notas);
			}
			clases[i].setAlumnos(alumnos);
			
		}
		curso.setClases(clases);
		//menu para interactuar con las notas introducidas
		do {
			System.out.println("1) ver notas del modulo");
			System.out.println("2) ver media de un alumno");
			System.out.println("3) cambiar notas de un alumno");
			System.out.println("4) ver notas de un alumno");
			System.out.println("5) finalizar programa");
			System.out.print("Introducir opcion: ");
			seleccion = Console.readInt();
			switch(seleccion) {
			//ver todas las notas de una asignatura
			case (1):
				String idGrupo;
				System.out.println("Ver notas de una asignatura");
				System.out.println("Escoja el curso escribiendo su identificador (dw21): ");
				curso.getIDGrupos();
				idGrupo = Console.readString();
				for(int i=0;i<clases.length;i++) {
					if(idGrupo == clases[i].getIdentificador()) {
						clases[i].verNotaModulo();
					}
				}
				
				break;
			// ver la media de un alumno
			case(2):
				System.out.println("Ver media del alumno");
				curso.verMedia();
				break;
			//cambiar todas las notas de un alumno
			case(3):

				System.out.println("Cambiar las notas de un alumno");
				System.out.print("Escoja el curso escribiendo su identificador (dw21): ");
				curso.getIDGrupos();
				selecGrupo = Console.readString();
				System.out.print("Escoja el numero del alumno al que le quiera cambiar la nota: ");
				curso.imprimiAlumnos(selecGrupo);
				selecAlumno = Console.readInt();
				curso.cambiarNotasGrupo(selecGrupo, selecAlumno);
				break;
			//ver notas de un alumno
			case(4):
				
				System.out.println("ver las notas de un alumno");
				System.out.print("Escoja el curso escribiendo su identificador (dw21): ");
				curso.getIDGrupos();
				selecGrupo = Console.readString();
				System.out.print("Escoja el numero del alumno al que le quiera cambiar la nota: ");
				curso.imprimiAlumnos(selecGrupo);
				selecAlumno = Console.readInt();
				curso.verNotasAlumno(selecAlumno,selecGrupo);
				break;
			
			case(5):
				System.out.println("FIN");
			default:
				System.out.println("Esa opcion no esta disponible");
			}
			
		}while(seleccion!=5);
	}

}