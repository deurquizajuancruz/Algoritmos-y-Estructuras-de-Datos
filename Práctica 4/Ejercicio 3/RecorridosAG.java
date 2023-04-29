package tp04.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import practica2.ColaGenerica;

public class RecorridosAG {

	// PREORDEN:
	// version 1: metodo recursivo que va devolviendo listas, sin lista como
	// parametro
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		if (a.getDato() > n && a.getDato() % 2 != 0)
			lista.agregarFinal(a.getDato());
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> listaHijos = a.getHijos();
			listaHijos.comenzar();
			while (!listaHijos.fin()) {
				ArbolGeneral<Integer> proximo = listaHijos.proximo();
				ListaGenerica<Integer> nuevaLista = numerosImparesMayoresQuePreOrden(proximo, n);
				if (!nuevaLista.esVacia()) {
					nuevaLista.comenzar();
					while (!nuevaLista.fin())
						lista.agregarFinal(nuevaLista.proximo());
				}
			}
		}
		return lista;
	}

	// version 2: llamar a otro metodo y pasar la lista como parametro
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrdenVersionDos(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		numerosImparesMayoresQuePreOrdenVersionDosAux(a, lista, n);
		return lista;
	}

	private void numerosImparesMayoresQuePreOrdenVersionDosAux(ArbolGeneral<Integer> a, ListaGenerica<Integer> lista,
			Integer n) {
		if (a.getDato() > n && a.getDato() % 2 != 0)
			lista.agregarFinal(a.getDato());
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> listaHijos = a.getHijos();
			listaHijos.comenzar();
			while (!listaHijos.fin())
				numerosImparesMayoresQuePreOrdenVersionDosAux(listaHijos.proximo(), lista, n);
		}
	}

	// INORDEN:
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		numerosImparesMayoresQueInOrdenAux(a, lista, n);
		return lista;
	}

	private void numerosImparesMayoresQueInOrdenAux(ArbolGeneral<Integer> a, ListaEnlazadaGenerica<Integer> lista,
			Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
		if (!hijos.esVacia()) {
			hijos.comenzar();
			numerosImparesMayoresQueInOrdenAux(hijos.proximo(), lista, n);
		}
		if (a.getDato() > n && a.getDato() % 2 != 0)
			lista.agregarFinal(a.getDato());
		while (!hijos.fin())
			numerosImparesMayoresQueInOrdenAux(hijos.proximo(), lista, n);
	}

	// POSTORDEN:
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		numerosImparesMayoresQuePostOrdenAux(a, lista, n);
		return lista;
	}

	private void numerosImparesMayoresQuePostOrdenAux(ArbolGeneral<Integer> a, ListaEnlazadaGenerica<Integer> lista,
			Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> listaHijos = a.getHijos();
		if (!listaHijos.esVacia()) {
			listaHijos.comenzar();
			while (!listaHijos.fin())
				numerosImparesMayoresQuePostOrdenAux(listaHijos.proximo(), lista, n);
		}
		if (a.getDato() > n && a.getDato() % 2 != 0)
			lista.agregarFinal(a.getDato());
	}

	// POR NIVELES:
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		numerosImparesMayoresQuePorNivelesAux(a, lista, n);
		return lista;
	}

	private void numerosImparesMayoresQuePorNivelesAux(ArbolGeneral<Integer> a, ListaEnlazadaGenerica<Integer> lista,
			Integer n) {
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.encolar(a);
		cola.encolar(null);
		while (!cola.esVacia()) {
			ArbolGeneral<Integer> aux = cola.desencolar();
			if (aux != null) {
				if (aux.getDato() > n && aux.getDato() % 2 != 0)
					lista.agregarFinal(aux.getDato());
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Integer>> listaHijos = aux.getHijos();
					listaHijos.comenzar();
					while (!listaHijos.fin())
						cola.encolar(listaHijos.proximo());
				}
			} else if (!cola.esVacia())
				cola.encolar(null);
		}
	}
}
