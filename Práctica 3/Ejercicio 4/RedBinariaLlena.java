package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;

	public RedBinariaLlena(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}

	public int retardoReenvio(ArbolBinario<Integer> a) {
		if (a.esHoja())
			return a.getDato();
		else {
			int izquierda = 0, derecha = 0;
			if (a.tieneHijoIzquierdo())
				izquierda = retardoReenvio(a.getHijoIzquierdo());
			if (a.tieneHijoDerecho())
				derecha = retardoReenvio(a.getHijoDerecho());
			return Math.max(izquierda, derecha) + a.getDato();
		}
	}
}
