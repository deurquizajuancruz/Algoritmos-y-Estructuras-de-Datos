package practica2;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		System.out.println("Ingrese numeros. Para terminar de ingresar, ingrese el -999: ");
		Scanner s = new Scanner(System.in);
		int numLeido = s.nextInt();
		while (numLeido != -999) {
			lista.agregarFinal(numLeido);
			System.out.println("Ingrese numeros. Para terminar de ingresar, ingrese el -999: ");
			numLeido = s.nextInt();
		}
		System.out.println("Elementos de la lista: ");
		for (int i = 1; i < lista.tamanio() + 1; i++) {
			System.out.println(lista.elemento(i));
		}
	}

}
