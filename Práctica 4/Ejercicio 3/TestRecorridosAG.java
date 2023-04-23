package tp04.ejercicio3;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestRecorridosAG {
	
	public static void imprimirLista(ListaGenerica<Integer> lista) {
		lista.comenzar();
		while (! lista.fin()) {
			System.out.println(lista.proximo());
		}
	}

	public static void main(String[] args) {
		RecorridosAG recorridos = new RecorridosAG();
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(10); //raiz
		ArbolGeneral<Integer> arbolNivel1Uno = new ArbolGeneral<Integer>(25); // primer hijo raiz
		ArbolGeneral<Integer> arbolNivel1Dos = new ArbolGeneral<Integer>(37); // segundo hijo raiz
		ArbolGeneral<Integer> arbolNivel1Tres = new ArbolGeneral<Integer>(14); // tercer hijo raiz
		ArbolGeneral<Integer> arbolNivel2Uno = new ArbolGeneral<Integer>(16); // primer hijo 25
		ArbolGeneral<Integer> arbolNivel2Dos = new ArbolGeneral<Integer>(7); // segundo hijo 25
		ArbolGeneral<Integer> arbolNivel2Tres = new ArbolGeneral<Integer>(18); // tercer hijo 25
		ArbolGeneral<Integer> arbolNivel2Cinco = new ArbolGeneral<Integer>(15); // primer hijo 37
		ArbolGeneral<Integer> arbolNivel2Seis = new ArbolGeneral<Integer>(47); // segundo hijo 37
		ArbolGeneral<Integer> arbolNivel2Siete = new ArbolGeneral<Integer>(32); // primer hijo 14
		
		arbolNivel1Uno.agregarHijo(arbolNivel2Uno);
		arbolNivel1Uno.agregarHijo(arbolNivel2Dos);
		arbolNivel1Uno.agregarHijo(arbolNivel2Tres);
		//agrego al nodo 25: 16,7 y 18
		arbolNivel1Dos.agregarHijo(arbolNivel2Cinco);
		arbolNivel1Dos.agregarHijo(arbolNivel2Seis);
		//agrego al nodo 37: 15 y 47
		arbolNivel1Tres.agregarHijo(arbolNivel2Siete);
		//agrego al nodo 14: 32
		arbol.agregarHijo(arbolNivel1Uno);
		arbol.agregarHijo(arbolNivel1Dos);
		arbol.agregarHijo(arbolNivel1Tres);
		//agrego a la raiz: 25,37 y 14
		
		int n=9;
		ListaGenerica<Integer>lista = recorridos.numerosImparesMayoresQuePreOrden(arbol, n); 
		System.out.println("Elementos impares mayores a "+n+" en pre Orden (version1)");
		imprimirLista(lista); //25,37,15,47
		n=5;
		lista= recorridos.numerosImparesMayoresQuePreOrdenVersionDos(arbol, n); 
		System.out.println("Elementos impares mayores a "+n+" en pre Orden (version2)");
		imprimirLista(lista); //25,7,37,15,47
		n=20;
		lista=recorridos.numerosImparesMayoresQueInOrden(arbol, n);
		System.out.println("Elementos impares mayores a "+n+" en in Orden");
		imprimirLista(lista); //25,37,47
		n=36;
		lista=recorridos.numerosImparesMayoresQuePostOrden(arbol, n);
		System.out.println("Elementos impares mayores a "+n+" en post Orden");
		imprimirLista(lista); // 47 37
		n=7;
		lista=recorridos.numerosImparesMayoresQuePorNiveles(arbol, n);
		System.out.println("Elementos impares mayores a "+n+" por niveles");
		imprimirLista(lista); //25 37 15 47
	}
}
