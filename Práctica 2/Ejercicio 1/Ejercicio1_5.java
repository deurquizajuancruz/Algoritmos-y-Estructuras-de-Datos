package practica2;

import tp02.ejercicio1.*;

public class Ejercicio1_5 {

	public static void imprimirRecursivo(ListaDeEnterosConArreglos lista, int i) {
		if (i > 0) {
			System.out.println(lista.elemento(i));
			imprimirRecursivo(lista, i - 1);
		}
	}

	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		lista.agregarFinal(45);
		lista.agregarFinal(5);
		lista.agregarFinal(47);
		lista.agregarFinal(99);
		imprimirRecursivo(lista, lista.tamanio());
	}
}
