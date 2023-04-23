package tp03.ejercicio3;

import tp03.ejercicio1.ArbolBinario;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ContadorArbol {
	private ArbolBinario<Integer> datos;

	public ContadorArbol(ArbolBinario<Integer> enteros) {
		this.datos = enteros;
	}

	public ListaEnlazadaGenerica<Integer> numerosParesInOrden() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosParesInOrdenAux(this.datos, lista);
		return lista;
	}

	private void numerosParesInOrdenAux(ArbolBinario<Integer> arbol, ListaEnlazadaGenerica<Integer> lista) {
		if (arbol.tieneHijoIzquierdo())
			numerosParesInOrdenAux(arbol.getHijoIzquierdo(), lista);
		if (arbol.getDato() % 2 == 0)
			lista.agregarFinal(arbol.getDato());
		if (arbol.tieneHijoDerecho())
			numerosParesInOrdenAux(arbol.getHijoDerecho(), lista);
	}

	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosParesPostOrdenAux(this.datos, lista);
		return lista;
	}

	private void numerosParesPostOrdenAux(ArbolBinario<Integer> arbol, ListaEnlazadaGenerica<Integer> lista) {
		if (arbol.tieneHijoIzquierdo())
			numerosParesPostOrdenAux(arbol.getHijoIzquierdo(), lista);
		if (arbol.tieneHijoDerecho())
			numerosParesPostOrdenAux(arbol.getHijoDerecho(), lista);
		if (arbol.getDato() % 2 == 0)
			lista.agregarFinal(arbol.getDato());
	}
}
