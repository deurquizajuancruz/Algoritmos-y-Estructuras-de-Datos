package tp03.ejercicio5;

import practica2.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;

	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	public int sumaElementosProfundidad(int p) {
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(this.arbol);
		cola.encolar(null);
		int nivel = 0, suma = 0;
		boolean procesado = false;
		while (!cola.esVacia() && !procesado) {
			ArbolBinario<Integer> aux = cola.desencolar();
			if (aux != null) {
				if (nivel == p)
					suma += aux.getDato();
				if (aux.tieneHijoIzquierdo())
					cola.encolar(aux.getHijoIzquierdo());
				if (aux.tieneHijoDerecho())
					cola.encolar(aux.getHijoDerecho());
			} else {
				nivel++;
				if (nivel > p)
					procesado = true;
				if (!cola.esVacia())
					cola.encolar(null);
			}
		}
		return suma;
	}
}
