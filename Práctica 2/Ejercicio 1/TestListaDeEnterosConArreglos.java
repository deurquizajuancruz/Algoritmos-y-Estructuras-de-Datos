package practica2;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		for (String i : args) {
			lista.agregarFinal(Integer.parseInt(i));
		}

		/*
		 * System.out.
		 * println("Ingrese numeros. Para terminar de ingresar, ingrese el -999: ");
		 * Scanner s = new Scanner(System.in); int numLeido = s.nextInt(); while
		 * (numLeido != -999) { lista.agregarFinal(numLeido); System.out.
		 * println("Ingrese numeros. Para terminar de ingresar, ingrese el -999: ");
		 * numLeido = s.nextInt(); }
		 */

		System.out.println("Elementos de la lista: ");
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}

		/*
		 * for (int i = 1; i < lista.tamanio() + 1; i++) {
		 * System.out.println(lista.elemento(i)); }
		 */
	}
}
