package ejercicio5;

public class Test {

	public static void main(String[] args) {
		int [] numeros = new int [7];
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int) Math.round(Math.random()*100);
		}
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static Valores retornar(int [] arr) {
		Valores v = new Valores();
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		int suma=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
			suma+=arr[i];
		}
		v.setMaximo(max);
		v.setMinimo(min);
		v.setPromedio(suma/arr.length);
		return v;
	}

	public static void parametro(int []arr, Valores v) {
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		int suma=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
			suma+=arr[i];
		}
		v.setMaximo(max);
		v.setMinimo(min);
		v.setPromedio(suma/arr.length);
	}
	
	public static void sinReturn(int []arr) {
		Valores v = new Valores();
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		int suma=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
			suma+=arr[i];
		}
		v.setMaximo(max);
		v.setMinimo(min);
		v.setPromedio(suma/arr.length);
	}
	
}
