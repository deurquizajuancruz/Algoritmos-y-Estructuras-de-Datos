package practica2;

import tp02.ejercicio2.*;

public class ColaGenerica<T> {
	private ListaGenerica<T> datos;

	public ColaGenerica() {
		this.datos = new ListaEnlazadaGenerica<>();
	}

	public void encolar(T elem) {
		this.datos.agregarFinal(elem);
	}

	public T desencolar() {
		if (!this.esVacia()) {
			T elem = this.tope();
			this.datos.eliminarEn(1);
			return elem;
		}
		return null;
	}

	public T tope() {
		return this.datos.elemento(1);
	}

	public boolean esVacia() {
		return this.datos.esVacia();
	}

}
