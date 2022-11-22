

public class App {
	/**
	 * Simular el procedimiento de una aplicación con un productor (banco) y un consumidor 
	 * (político), de tal manera que cuando el banco coloca dinero en ventanilla habrá 10 políticos a la 
	 * espera de que el banco avise de que ya se puede robar el dinero. Se colocará aleatoriamente una cantidad 
	 * en ventanilla (mínimo de 1.000.000€ máx 2.000.000€) que serán cogidos por un solo político a la vez, 
	 * y al final del procedimiento se mostrará lo robado por cada político. Se supone 23.000.000€ iniciales en el banco.
	 * Tener en cuenta la finalización correcta de todos los procesos, puesto que cuando se acaba todo el dinero 
	 * del banco los políticos tendrán que ir a robar a otro sitio. Mostrar un mensaje de cuánto roba cada uno.
	 */
	public static void main(String[] args) {
		Ventanilla ventanilla = new Ventanilla();
		
		// Productor
		new Banco(ventanilla).start();
		
		for (int i = 0; i < 20; i++) {
			new Politico("Politico" + i, ventanilla).start();
		}
	}
}
