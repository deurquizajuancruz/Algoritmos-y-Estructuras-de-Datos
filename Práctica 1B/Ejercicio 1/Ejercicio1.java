package ejercicio1;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		System.out.println("Impresion con for: ");
		imprimirFor(4, 10);
		System.out.println("Impresion con while: ");
		imprimirWhile(5, 12);
		System.out.println("Impresion con recursion: ");
		imprimirRecursion(7, 15);
	}
	
	public static void imprimirFor(int a, int b) {
		for (int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}
	
	public static void imprimirWhile(int a, int b) {
		while (a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void imprimirRecursion(int a, int b) {
		if (a<=b) {
			System.out.println(a);
			imprimirRecursion(a+1, b);
		}
	}
}

