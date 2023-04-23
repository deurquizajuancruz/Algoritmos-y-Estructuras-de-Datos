package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;

	public RedBinariaLlena(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}

	public int retardoReenvio() {
		if (this.arbol.esHoja())
			return this.arbol.getDato();
		int izq=0,der=0;
		if (this.arbol.tieneHijoIzquierdo()) {
			RedBinariaLlena r = new RedBinariaLlena(this.arbol.getHijoIzquierdo());
			izq+= r.retardoReenvio();
		}
		if (this.arbol.tieneHijoDerecho()) {
			RedBinariaLlena r = new RedBinariaLlena(this.arbol.getHijoDerecho());
			der+=r.retardoReenvio();
		}
		return this.arbol.getDato() + Math.max(izq, der);
	}
}
