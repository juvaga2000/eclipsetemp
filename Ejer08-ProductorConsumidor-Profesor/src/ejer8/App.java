package ejer8;

public class App {

	/*
	 * Un profesor de cuyo nombre no quiero acordarme quiere aprobar a todos sus alumnos. Pero de 20 alumnos, 
	 * sólo 10 podrán tener el aprobado. El profesor cada 20 milisegundos entregará en secretaría un aprobado 
	 * y los alumnos por concurrencia competitiva irán cogiendo cada aprobado. Cada vez que un alumno haya cogido 
	 * el aprobado mostrará: “Soy el alumnox y he aprobado”. Los que no hayan aprobado mostrarán un mensaje “Soy 
	 * el alumnoy y no he aprobado”.
	 * Solución deseable realizada con métodos get/set sincronizados, contará aunque menos otras soluciones.
	 * */
	
	public static void main(String[] args) {
		 
		Nota nota = new Nota();
		
		ThreadGroup grupo = new ThreadGroup("grupo");
		
		// Creamos el prdocutor
		Profesor prod = new Profesor(nota);
		prod.start();
		
		// Creamos el consumidor
		Alumno cons;
		for (int i = 0; i < 20; i++) {
			cons = new Alumno("C"+(i+1), grupo, nota);
			cons.start();
		} 
		

		
	}

}
