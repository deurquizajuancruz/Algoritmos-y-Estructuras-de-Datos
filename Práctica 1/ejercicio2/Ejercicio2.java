package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int [] vector= arrayN();
		for (int i=0;i<vector.length;i++) {
			System.out.println(vector[i]);
		}
	}
	
	public static int [] arrayN() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		int n= s.nextInt();
		int [] array = new int[n];
		int m=1;
		int pos=0;
		for (int i=0;i<n;i++) {
			array[pos]=n*m;
			m++;
			pos++;
		}
		return array;
	}
}
