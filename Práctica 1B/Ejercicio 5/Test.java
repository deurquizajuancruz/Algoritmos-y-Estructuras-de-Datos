package ejercicio5;

public class Test {
	public static void main(String[] args) {
		int [] numeros = new int [7];
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int) Math.round(Math.random()*100);
		}
		System.out.println("Elementos del vector: ");
		for (int elem: numeros) {
			System.out.println(elem);
		}
		System.out.println("Metodo con retorno: ");
		Valores v = retornar(numeros);
		System.out.println("Valor máximo: "+ v.getMaximo());
		System.out.println("Valor mínimo: "+ v.getMinimo());
		System.out.println("Promedio: "+ v.getPromedio());
		
		System.out.println("Metodo con parámetro: ");
		Valores v2= new Valores();
		parametro(numeros, v2);
		System.out.println("Valor máximo: "+ v2.getMaximo());
		System.out.println("Valor mínimo: "+ v2.getMinimo());
		System.out.println("Promedio: "+ v2.getPromedio());
		
		System.out.println("Metodo sin parámetros: ");
		sinReturn(numeros);
	}
	
	public static Valores retornar(int [] arr) {
		Valores v = new Valores();
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		double suma=0;
		for (int elem: arr) {
			if (elem>max) {
				max=elem;
			}
			if (elem<min) {
				min=elem;
			}
			suma+=elem;
		}
		v.setMaximo(max);
		v.setMinimo(min);
		v.setPromedio(Math.round((suma/arr.length) * 100.0) / 100.0);
		return v;
	}

	public static void parametro(int []arr, Valores v) {
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		double suma=0;
		for (int elem: arr) {
			if (elem>max) {
				max=elem;
			}
			if (elem<min) {
				min=elem;
			}
			suma+=elem;
		}
		v.setMaximo(max);
		v.setMinimo(min);
		v.setPromedio(Math.round((suma/arr.length) * 100.0) / 100.0);
	}
	
	public static void sinReturn(int []arr) {
		Valores v = new Valores();
		int max=Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		double suma=0;
		for (int elem: arr) {
			if (elem>max) {
				max=elem;
			}
			if (elem<min) {
				min=elem;
			}
			suma+=elem;
		}
		v.setMaximo(max);
		v.setMinimo(min);
		v.setPromedio(Math.round((suma/arr.length) * 100.0) / 100.0);
		System.out.println("Valor máximo: "+ v.getMaximo());
		System.out.println("Valor mínimo: "+ v.getMinimo());
		System.out.println("Promedio: "+ v.getPromedio());
	}
	
}
