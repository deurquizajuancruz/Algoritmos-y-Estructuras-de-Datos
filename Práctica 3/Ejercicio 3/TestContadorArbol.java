package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class TestContadorArbol {
	public static void main(String[] args) {
		ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(40);
		ArbolBinario<Integer> uno1 = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> uno2 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> dos1 = new ArbolBinario<Integer>(21);
		ArbolBinario<Integer> dos2 = new ArbolBinario<Integer>(22);
		ArbolBinario<Integer> dos3 = new ArbolBinario<Integer>(23);
		ArbolBinario<Integer> dos4 = new ArbolBinario<Integer>(27);
		ArbolBinario<Integer> tres1 = new ArbolBinario<Integer>(36);
		ArbolBinario<Integer> tres2 = new ArbolBinario<Integer>(32);
		ArbolBinario<Integer> tres3 = new ArbolBinario<Integer>(330);
		ArbolBinario<Integer> tres4 = new ArbolBinario<Integer>(342);
		ArbolBinario<Integer> tres5 = new ArbolBinario<Integer>(351);
		ArbolBinario<Integer> cuatro1 = new ArbolBinario<Integer>(41);
		
		tres4.agregarHijoIzquierdo(cuatro1);

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
		
		ContadorArbol contador = new ContadorArbol(raiz);
		
		ListaEnlazadaGenerica<Integer> listaInOrden = contador.numerosParesInOrden();
		System.out.println("Numeros pares del arbol, In Orden: ");
		listaInOrden.comenzar();
		while (! listaInOrden.fin()) 
			System.out.println(listaInOrden.proximo());
		
		ListaEnlazadaGenerica<Integer> listaPostorden = contador.numerosParesPostOrden();
		System.out.println("Numeros pares del arbol, post Orden: ");
		listaPostorden.comenzar();
		while (! listaPostorden.fin())
			System.out.println(listaPostorden.proximo());
	}
}
