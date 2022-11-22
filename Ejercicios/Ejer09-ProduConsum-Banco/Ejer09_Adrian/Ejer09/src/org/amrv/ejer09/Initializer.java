package org.amrv.ejer09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Initializer {

	/*
	 * Simular el procedimiento de una aplicación con un productor (banco) y un
	 * consumidor (político), de tal manera que cuando el banco coloca dinero en
	 * ventanilla habrá 10 políticos a la espera de que el banco avise de que ya se
	 * puede robar el dinero.
	 * 
	 * Se colocará aleatoriamente una cantidad en ventanilla (mínimo de 1.000.000€
	 * máx 2.000.000€) que serán cogidos por un solo político a la vez, y al final
	 * del procedimiento se mostrará lo robado por cada político.
	 * 
	 * Se supone 23.000.000€ iniciales en el banco.
	 * 
	 * Tener en cuenta la finalización correcta de todos los procesos, puesto que
	 * cuando se acaba todo el dinero del banco los políticos tendrán que ir a robar
	 * a otro sitio.
	 * 
	 * Mostrar un mensaje de cuánto roba cada uno.
	 */

	private static final long BANK_MONEY = 23000000;
	private static final long BANK_MIN_RELEASE = 1000000;
	private static final long BANK_MAX_RELEASE = 2000000;
	private static final long BANK_MIN_AMOUNT = 10;
	private static final long BANK_MIN_REST = 0;
	private static final long BANK_MAX_REST = 1000;

	public static final String POLITIC_STEAL = "{0} ha robado {1}€";
	private static final String[] POLITIC_NAMES = { "Donald Trumpeta", "Nicolas Madura", "Mariano Cuboy",
			"Poliedro Sanchez", "Adolfo Suarez", "Felipe Gonzalez", "Santiajo Pentabascal", "José noseque Zapatero",
			"Leopoldo Calvo" };

	private static final NumberFormat FORMATTER = new DecimalFormat("#,##0.00");

	public static String formatNumber(Number number) {
		return FORMATTER.format(number.doubleValue()) + " €";
	}

	public static void main(String[] args) {
		Ventanilla ventanilla = new Ventanilla();
		Politico[] politicos = new Politico[POLITIC_NAMES.length];
		Banco banco = new Banco(BANK_MONEY, BANK_MIN_RELEASE, BANK_MAX_RELEASE, BANK_MIN_AMOUNT, BANK_MIN_REST,
				BANK_MAX_REST, ventanilla);
		banco.start();
		for (int i = 0; i < politicos.length; i++) {
			politicos[i] = new Politico(POLITIC_NAMES[i], ventanilla);
			politicos[i].start();
		}

	}

}
