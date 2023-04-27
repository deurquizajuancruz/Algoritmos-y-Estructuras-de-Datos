package tp04.ejercicio7;

import tp04.ejercicio1.ArbolGeneral;

public class TestRedDeAguaPotable {
	public static void main(String[] args) {
		ArbolGeneral<Double> raiz = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> uno1 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> uno2 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> uno3 = new ArbolGeneral<Double>((double) 0);
		//ArbolGeneral<Double> uno4 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> dos1 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> dos2 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> dos3 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> dos4 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> dos5 = new ArbolGeneral<Double>((double) 0);
		//ArbolGeneral<Double> dos6 = new ArbolGeneral<Double>((double) 0);
		//ArbolGeneral<Double> dos7 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> tres1 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> tres2 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> tres3 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> tres4 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> cuatro1 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> cuatro2 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> cuatro3 = new ArbolGeneral<Double>((double) 0);
		ArbolGeneral<Double> cuatro4 = new ArbolGeneral<Double>((double) 0);

		tres3.agregarHijo(cuatro1);
		tres3.agregarHijo(cuatro2);
		tres3.agregarHijo(cuatro3);
		tres3.agregarHijo(cuatro4);
		
		dos2.agregarHijo(tres1);
		dos2.agregarHijo(tres2);
		dos5.agregarHijo(tres3);
		dos5.agregarHijo(tres4);
		
		uno2.agregarHijo(dos1);
		uno2.agregarHijo(dos2);
		uno3.agregarHijo(dos3);
		uno3.agregarHijo(dos4);
		uno3.agregarHijo(dos5);

		raiz.agregarHijo(uno1);
		raiz.agregarHijo(uno2);
		raiz.agregarHijo(uno3);
		RedDeAguaPotable caudal = new RedDeAguaPotable(raiz);
		System.out.println("El caudal minimo es de " + caudal.minimoCaudal(1000));
	}
}
