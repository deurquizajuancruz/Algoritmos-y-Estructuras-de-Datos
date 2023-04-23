package tp04.ejercicio4;

import tp04.ejercicio1.ArbolGeneral;

public class TestArbolGeneral {

	public static void main(String[] args) {
		ArbolGeneral<Integer> raiz = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> unoUno = new ArbolGeneral<Integer>(42);
		ArbolGeneral<Integer> unoDos = new ArbolGeneral<Integer>(31);
		ArbolGeneral<Integer> dosUno = new ArbolGeneral<Integer>(59);
		ArbolGeneral<Integer> dosDos = new ArbolGeneral<Integer>(66);
		ArbolGeneral<Integer> dosTres = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> dosCuatro = new ArbolGeneral<Integer>(77);
		ArbolGeneral<Integer> dosCinco = new ArbolGeneral<Integer>(89);
		ArbolGeneral<Integer> tresUno = new ArbolGeneral<Integer>(28);
		ArbolGeneral<Integer> tresDos = new ArbolGeneral<Integer>(33);
		ArbolGeneral<Integer> tresTres = new ArbolGeneral<Integer>(16);
		ArbolGeneral<Integer> tresCuatro = new ArbolGeneral<Integer>(17);
		ArbolGeneral<Integer> tresCinco = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> tresSeis = new ArbolGeneral<Integer>(41);

		// hijos nodos nivel 2
		dosUno.agregarHijo(tresSeis);
		dosUno.agregarHijo(tresUno);
		dosUno.agregarHijo(tresDos); // nodo 59 hijos: 41,28,33
		dosDos.agregarHijo(tresTres); // nodo 66 hijos:16
		dosTres.agregarHijo(tresCuatro);
		dosTres.agregarHijo(tresCinco); // nodo 12 hijos: 4 17

		// hijos nodos nivel 1
		unoUno.agregarHijo(dosUno);
		unoUno.agregarHijo(dosDos); // nodo 42 hijos: 59 y 66
		unoDos.agregarHijo(dosTres);
		unoDos.agregarHijo(dosCuatro);
		unoDos.agregarHijo(dosCinco); // nodo 31 hijos: 12 77 89

		// hijos raiz
		raiz.agregarHijo(unoUno);
		raiz.agregarHijo(unoDos);

		System.out.println("La altura de este arbol es de: " + raiz.altura());

		int datoEncontrar = 0;
		int queNivel = raiz.nivel(datoEncontrar);
		if (queNivel != -1)
			System.out.println("El nivel del dato " + datoEncontrar + " es el nivel " + queNivel);
		else
			System.out.println("El dato " + datoEncontrar + " no existe en el arbol.");

		System.out.println("El ancho de este arbol es de " + raiz.ancho());

		int a = 50, b = 28;
		if (raiz.esAncestro(a, b))
			System.out.println(a + " es ancestro de " + b);
		else
			System.out.println(a + " NO es ancestro de " + b);
	}

}
