package tp02.ejercicio4;

import java.util.Scanner;
import practica2.PilaGenerica;

public class TestBalanceo {

	public static boolean balanceado(String cadena) {
		if (cadena.length()==0) return true;
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char actual = cadena.charAt(i);
			if (actual == '(' || actual == '[' || actual == '{') {
				pila.apilar(actual);
				contador++;
			} else if (actual == ')' || actual == ']' || actual == '}') {
				if (pila.esVacia()) return false;
				char ultimo = pila.desapilar();
				if (actual == ')' && ultimo != '(' || actual == ']' && ultimo != '[' || actual == '}' && ultimo != '{') return false;
			}
		}
		if (contador == 0) return false;
		return pila.esVacia();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la cadena a verificar si está balanceada: ");
		String cadena = s.nextLine();
		if (balanceado(cadena))
			System.out.println("Cadena balanceada");
		else
			System.out.println("Cadena no balanceada");
		s.close();
	}
}
