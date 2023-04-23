package tp03.ejercicio1;

import practica2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	public int contarHojas() {
		if (this.esHoja())
			return 1;
		int hojas = 0;
		if (this.tieneHijoDerecho()) {
			hojas += this.getHijoDerecho().contarHojas();
		}
		if (this.tieneHijoIzquierdo())
			hojas += this.getHijoIzquierdo().contarHojas();
		return hojas;
	}

	public ArbolBinario<T> espejo() {
		ArbolBinario<T> nodo = new ArbolBinario<T>(this.getDato());
		if (this.tieneHijoIzquierdo())
			nodo.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
		if (this.tieneHijoDerecho()) 
			nodo.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		return nodo;
	}

	public void entreNiveles(int n, int m) {
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nivel = 0;
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia()) {
			ArbolBinario<T> aux = cola.desencolar();
			if (aux != null) {
				if ((nivel >= n) && (nivel <= m))
					System.out.println(aux.getDato());
				if (aux.tieneHijoIzquierdo())
					cola.encolar(aux.getHijoIzquierdo());
				if (aux.tieneHijoDerecho())
					cola.encolar(aux.getHijoDerecho());
			} else {
				nivel++;
				if (!cola.esVacia())
					cola.encolar(null);
			}
		}
	}

}
