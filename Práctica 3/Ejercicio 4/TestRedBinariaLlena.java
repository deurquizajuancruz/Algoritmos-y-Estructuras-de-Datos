package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class TestRedBinariaLlena {
	public static void main(String[] args) {
		ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> uno1 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> uno2 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> dos1 = new ArbolBinario<Integer>(14);
		ArbolBinario<Integer> dos2 = new ArbolBinario<Integer>(23);
		ArbolBinario<Integer> dos3 = new ArbolBinario<Integer>(20);
		ArbolBinario<Integer> dos4 = new ArbolBinario<Integer>(7);

		uno1.agregarHijoIzquierdo(dos1);
		uno1.agregarHijoDerecho(dos2);
		uno2.agregarHijoIzquierdo(dos3);
		uno2.agregarHijoDerecho(dos4);

		raiz.agregarHijoIzquierdo(uno1);
		raiz.agregarHijoDerecho(uno2);

		RedBinariaLlena red = new RedBinariaLlena(raiz);

		System.out.println("El mayor retardo de reenvio es " + red.retardoReenvio());

	}
}
