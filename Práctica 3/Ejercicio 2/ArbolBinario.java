package tp03.ejercicio1;

import practica2.ColaGenerica;

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
		int derecha = 0, izquierda = 0;
		if (this.esHoja())
			return 1;
		else {
			if (this.tieneHijoIzquierdo())
				izquierda = this.getHijoIzquierdo().contarHojas();
			if (this.tieneHijoDerecho())
				derecha = this.getHijoDerecho().contarHojas();
		}
		return derecha + izquierda;
	}

	public ArbolBinario<T> espejo() {
		if (this.esVacio())
			return this;
		else {
			ArbolBinario<T> nodo = new ArbolBinario<T>(this.getDato());
			if (this.tieneHijoIzquierdo())
				nodo.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
			if (this.tieneHijoDerecho())
				nodo.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
			return nodo;
		}
	}

	public void entreNiveles(int n, int m) {
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nroNivel = 0;
		while (!cola.esVacia() && (nroNivel <= m)) {
			ArbolBinario<T> dato = cola.desencolar();
			if (dato != null) {
				if (nroNivel >= n)
					System.out.println(dato.getDato());
				if (dato.tieneHijoIzquierdo())
					cola.encolar(dato.getHijoIzquierdo());
				if (dato.tieneHijoDerecho())
					cola.encolar(dato.getHijoDerecho());
			} else if (!cola.esVacia()) {
				cola.encolar(null);
				nroNivel++;
			}
		}
	}

}
