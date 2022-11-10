package tema1.ejercicio7;

// Un profesor de cuyo nombre no quiero acordarme quiere aprobar a todos sus alumnos.
// Pero de 20 alumnos, sólo 10 podrán tener el aprobado. El profesor cada 20
// milisegundos entregará en secretaría un aprobado y los alumnos por concurrencia
// competitiva irán cogiendo cada aprobado. Cada vez que un alumno haya cogido el
// aprobado mostrará: "Soy el alumno x, y he aprobado". Los que no hayan aprobado
// mostrarán un mensaje "Soy el alumno y, y no he aprobado". Solución deseable realizada
// con métodos get/set sincronizados, contará aunque menos otras soluciones.

public class Aplicacion {
	public static void main(String[] args) {
		Secretaria secretaria = new Secretaria();
		
		for (int i = 0; i < 20; i++) new Alumno(String.format("Alumno %02d", i + 1), secretaria).start();
		new Profesor(secretaria).start();
	}
}
