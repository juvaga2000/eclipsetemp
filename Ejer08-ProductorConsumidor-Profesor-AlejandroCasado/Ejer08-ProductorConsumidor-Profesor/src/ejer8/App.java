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
		 
		Alumno alumno = new Alumno(20, 10);
		
		ThreadGroup grupo = new ThreadGroup("grupo");
		
		// Creamos el prdocutor
		Productor prod = new Productor(alumno);
		prod.start();
		
		// Creamos el consumidor
		Consumidor cons;
		for (int i = 0; i < alumno.getNumAlumnos(); i++) {
			cons = new Consumidor("C"+(i+1), grupo, alumno);
			cons.start();
		} 
		

		
	}

}
