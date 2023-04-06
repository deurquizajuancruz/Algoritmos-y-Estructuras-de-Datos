package tp03.ejercicio3;

import tp03.ejercicio1.ArbolBinario;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ContadorArbol {
	private ArbolBinario<Integer> datos;

	public ContadorArbol(ArbolBinario<Integer> enteros) {
		this.datos = enteros;
	}

	public ListaEnlazadaGenerica<Integer> numerosPares() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		inOrden(lista, this.datos);
		//postOrden(lista, this.datos);
		return lista;
	}

	public void inOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> h) {
		if (h.tieneHijoIzquierdo())
			inOrden(lista, h.getHijoIzquierdo());
		if (h.getDato() % 2 == 0)
			lista.agregarFinal(h.getDato());
		if (h.tieneHijoDerecho())
			inOrden(lista, h.getHijoDerecho());
	}

	public void postOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> h) {
		if (h.tieneHijoIzquierdo())
			postOrden(lista,h.getHijoIzquierdo());
		if (h.tieneHijoDerecho())
			postOrden(lista, h.getHijoDerecho());
		if (h.getDato() % 2 ==0)
			lista.agregarFinal(h.getDato());
	}

}
