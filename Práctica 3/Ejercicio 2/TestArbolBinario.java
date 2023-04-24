package tp03.ejercicio2;

import tp03.ejercicio1.ArbolBinario;

public class TestArbolBinario {
	public static void main(String[] args) {
		ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(0);
		ArbolBinario<Integer> uno1 = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> uno2 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> dos1 = new ArbolBinario<Integer>(21);
		ArbolBinario<Integer> dos2 = new ArbolBinario<Integer>(22);
		ArbolBinario<Integer> dos3 = new ArbolBinario<Integer>(23);
		ArbolBinario<Integer> dos4 = new ArbolBinario<Integer>(24);
		ArbolBinario<Integer> tres1 = new ArbolBinario<Integer>(31);
		ArbolBinario<Integer> tres2 = new ArbolBinario<Integer>(32);
		ArbolBinario<Integer> tres3 = new ArbolBinario<Integer>(33);
		ArbolBinario<Integer> tres4 = new ArbolBinario<Integer>(34);
		ArbolBinario<Integer> tres5 = new ArbolBinario<Integer>(35);
		ArbolBinario<Integer> cuatro1 = new ArbolBinario<Integer>(41);
		ArbolBinario<Integer> cuatro2 = new ArbolBinario<Integer>(42);

		tres4.agregarHijoIzquierdo(cuatro1);
		tres4.agregarHijoDerecho(cuatro2);

		dos1.agregarHijoDerecho(tres1);
		dos2.agregarHijoDerecho(tres2);
		dos3.agregarHijoDerecho(tres3);
		dos4.agregarHijoIzquierdo(tres4);
		dos4.agregarHijoDerecho(tres5);

		uno1.agregarHijoIzquierdo(dos1);
		uno1.agregarHijoDerecho(dos2);
		uno2.agregarHijoIzquierdo(dos3);
		uno2.agregarHijoDerecho(dos4);

		raiz.agregarHijoIzquierdo(uno1);
		raiz.agregarHijoDerecho(uno2);
		
		System.out.println("El arbol tiene "+raiz.contarHojas()+" hojas");
		raiz.entreNiveles(0, 4);
		ArbolBinario<Integer> espejo = raiz.espejo();
		espejo.entreNiveles(0, 4);
	}
}
