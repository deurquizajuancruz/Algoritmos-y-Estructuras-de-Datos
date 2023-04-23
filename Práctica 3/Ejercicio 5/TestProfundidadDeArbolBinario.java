package tp03.ejercicio5;

import tp03.ejercicio1.ArbolBinario;

public class TestProfundidadDeArbolBinario {
	public static void main(String[] args) {
		ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> uno1 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> uno2 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> dos1 = new ArbolBinario<Integer>(14);
		ArbolBinario<Integer> dos2 = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> dos3 = new ArbolBinario<Integer>(20);
		ArbolBinario<Integer> dos4 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> tres1 = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> tres2 = new ArbolBinario<Integer>(18);
		ArbolBinario<Integer> tres3 = new ArbolBinario<Integer>(17);
		ArbolBinario<Integer> tres4 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> tres5 = new ArbolBinario<Integer>(42);
		ArbolBinario<Integer> tres6 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> tres7 = new ArbolBinario<Integer>(21);
		ArbolBinario<Integer> tres8 = new ArbolBinario<Integer>(97);

		dos1.agregarHijoIzquierdo(tres1);
		dos1.agregarHijoDerecho(tres2);
		dos2.agregarHijoIzquierdo(tres3);
		dos2.agregarHijoDerecho(tres4);
		dos3.agregarHijoIzquierdo(tres5);
		dos3.agregarHijoDerecho(tres6);
		dos4.agregarHijoIzquierdo(tres7);
		dos4.agregarHijoDerecho(tres8);

		uno1.agregarHijoIzquierdo(dos1);
		uno1.agregarHijoDerecho(dos2);
		uno2.agregarHijoIzquierdo(dos3);
		uno2.agregarHijoDerecho(dos4);

		raiz.agregarHijoIzquierdo(uno1);
		raiz.agregarHijoDerecho(uno2);

		ProfundidadDeArbolBinario profundidad = new ProfundidadDeArbolBinario(raiz);
		int p = 1;
		System.out.println("La suma de todos los elementos en la profundidad " + p + " es de: "
				+ profundidad.sumaElementosProfundidad(p));
	}
}
