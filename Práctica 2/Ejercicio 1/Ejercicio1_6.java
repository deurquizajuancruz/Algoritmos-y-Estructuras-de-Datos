package practica2;

import tp02.ejercicio1.*;

public class Ejercicio1_6 {

	public static ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada lista;
		if (n == 1) {
			lista = new ListaDeEnterosEnlazada();
		} else if (n % 2 == 0) {
			lista = calcularSucesion(n / 2);
		} else
			lista = calcularSucesion(3 * n + 1);
		lista.agregarInicio(n);
		return lista;
	}

	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = calcularSucesion(5);
		l.comenzar();
		while (!l.fin()) {
			System.out.println(l.proximo());
		}
	}

}
