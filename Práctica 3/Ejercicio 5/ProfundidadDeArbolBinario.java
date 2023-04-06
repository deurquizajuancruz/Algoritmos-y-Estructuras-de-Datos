package tp03.ejercicio5;

import practica2.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;

	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	public int sumaElementosProfundidad(int p) {
		int suma = 0, nivel = 0;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> datosCola;
		boolean seguir = false;
		cola.encolar(this.arbol);
		cola.encolar(null);
		while (!cola.esVacia() && !seguir) {
			datosCola = cola.desencolar();
			if (datosCola != null) {
				if (nivel == p)
					suma += datosCola.getDato();
				if (datosCola.tieneHijoDerecho())
					cola.encolar(datosCola.getHijoDerecho());
				if (datosCola.tieneHijoIzquierdo())
					cola.encolar(datosCola.getHijoIzquierdo());
			} else {
				if (!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}
			}
			if (nivel > p) {
				seguir = true;
			}
		}
		return suma;
	}
}
