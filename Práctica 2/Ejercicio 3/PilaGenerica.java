package practica2;

import tp02.ejercicio2.*;

public class PilaGenerica<T> {
	private ListaGenerica<T> datos;

	public PilaGenerica() {
		this.datos = new ListaEnlazadaGenerica<>();
	}

	public void apilar(T elem) {
		this.datos.agregarInicio(elem);
	}

	public T desapilar() {
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
