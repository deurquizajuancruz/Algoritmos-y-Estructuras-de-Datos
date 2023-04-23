package tp04.ejercicio7;

import practica2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable {

	private ArbolGeneral<Double> estructura;

	public RedDeAguaPotable(ArbolGeneral<Double> estructura) {
		this.estructura = estructura;
	}

	public ArbolGeneral<Double> getEstructura() {
		return estructura;
	}

	public void setEstructura(ArbolGeneral<Double> estructura) {
		this.estructura = estructura;
	}

	public double recorridoNiveles() {
		double min = Double.MAX_VALUE;
		ColaGenerica<ArbolGeneral<Double>> cola = new ColaGenerica<ArbolGeneral<Double>>();
		cola.encolar(this.estructura);
		cola.encolar(null);
		while (!cola.esVacia()) {
			ArbolGeneral<Double> aux = cola.desencolar();
			if (aux != null) {
				if (aux.getDato() < min)
					min = aux.getDato();
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Double>> listaHijos = aux.getHijos();
					listaHijos.comenzar();
					while (!listaHijos.fin()) {
						cola.encolar(listaHijos.proximo());
					}
				}
			} else if (cola.esVacia()) {
				cola.encolar(null);
			}
		}
		return min;
	}

	private void minimoCaudalAux(double caudal) {
		this.getEstructura().setDato(caudal);
		if (this.estructura.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Double>> listaHijos = this.estructura.getHijos();
			listaHijos.comenzar();
			while (!listaHijos.fin()) {
				RedDeAguaPotable hijo = new RedDeAguaPotable(listaHijos.proximo());
				hijo.minimoCaudalAux(caudal / listaHijos.tamanio()); // le doy a cada nodo su valor correspondiente
			}
		}
	}

	public double minimoCaudal(double caudal) {
		minimoCaudalAux(caudal);
		return Math.round(recorridoNiveles()*100.0)/100.0;
	}

}
