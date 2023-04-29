package tp04.ejercicio5;

import tp04.ejercicio1.ArbolGeneral;
import practica2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class AnalizadorArbol {

	public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		int maxPromedio = 0, cantNodos = 0;
		double promedioNivel = 0;
		cola.encolar(arbol);
		cola.encolar(null);
		while (!cola.esVacia()) {
			ArbolGeneral<AreaEmpresa> aux = cola.desencolar();
			if (aux != null) {
				cantNodos++;
				promedioNivel += aux.getDato().getTardanza();
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> listaHijos = aux.getHijos();
					listaHijos.comenzar();
					while (!listaHijos.fin())
						cola.encolar(listaHijos.proximo());
				}
			} else {
				promedioNivel = promedioNivel / cantNodos;
				if (promedioNivel > maxPromedio)
					maxPromedio = (int) promedioNivel;
				cantNodos = 0;
				promedioNivel = 0;
				if (!cola.esVacia())
					cola.encolar(null);
			}
		}
		return maxPromedio;
	}
}
