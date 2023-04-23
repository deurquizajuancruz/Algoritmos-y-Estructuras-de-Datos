package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import practica2.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}

	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}

	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo))
				hijos.eliminar(hijo);
		}
	}

	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}

	public Integer altura() {
		int alturaMax = 0;
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> listaHijos = this.getHijos();
			listaHijos.comenzar();
			while (!listaHijos.fin()) {
				int alturaHijo = listaHijos.proximo().altura();
				if (alturaHijo > alturaMax)
					alturaMax = alturaHijo;
			}
		}
		return 1 + alturaMax;
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 1;
		while (!cola.esVacia()) {
			ArbolGeneral<T> aux = cola.desencolar();
			if (aux != null) {
				if (aux.getDato() == dato) {
					return nivel;
				}
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> listaHijos = aux.getHijos();
					listaHijos.comenzar();
					while (!listaHijos.fin()) {
						cola.encolar(listaHijos.proximo());
					}
				}
			} else if (!cola.esVacia()) {
				cola.encolar(null);
				nivel++;
			}
		}
		return -1;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		int cantNodos = 0, max = 0;
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia()) {
			ArbolGeneral<T> aux = cola.desencolar();
			if (aux != null) {
				cantNodos++;
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> listaHijos = aux.getHijos();
					listaHijos.comenzar();
					while (!listaHijos.fin()) {
						cola.encolar(listaHijos.proximo());
					}
				}
			} else { // si es null = se termino el nivel
				if (cantNodos > max)
					max = cantNodos;
				cantNodos = 0;
				if (!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}
		return max;
	}

	private ArbolGeneral<T> buscarNodo(T a) {
		ArbolGeneral<T> aux = null;
		if (this.getDato() == a)
			return this;
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> listaHijos = this.getHijos();
			listaHijos.comenzar();
			while ((!listaHijos.fin()) && (aux == null)) {
				aux = listaHijos.proximo().buscarNodo(a);
			}
		}
		return aux;
	}

	public Boolean esAncestro(T a, T b) {
		ArbolGeneral<T> nodoA = buscarNodo(a);
		ArbolGeneral<T> nodoB = null;
		if (nodoA != null) {
			nodoB = nodoA.buscarNodo(b);
		}
		return nodoB != null;
	}

}