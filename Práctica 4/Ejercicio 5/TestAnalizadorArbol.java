package tp04.ejercicio5;

import tp04.ejercicio1.ArbolGeneral;

public class TestAnalizadorArbol {

	public static void main(String[] args) {
		ArbolGeneral<AreaEmpresa> raiz = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(15)); // promedio 15
		ArbolGeneral<AreaEmpresa> uno1 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(12));
		ArbolGeneral<AreaEmpresa> uno2 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(24));
		ArbolGeneral<AreaEmpresa> uno3 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(17)); // promedio 17
		ArbolGeneral<AreaEmpresa> dos1 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(7));
		ArbolGeneral<AreaEmpresa> dos2 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(18));
		ArbolGeneral<AreaEmpresa> dos3 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(21));
		ArbolGeneral<AreaEmpresa> dos4 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(14));
		ArbolGeneral<AreaEmpresa> dos5 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(3));
		ArbolGeneral<AreaEmpresa> dos6 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(15));
		ArbolGeneral<AreaEmpresa> dos7 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(46));
		ArbolGeneral<AreaEmpresa> dos8 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(32));
		ArbolGeneral<AreaEmpresa> dos9 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(31)); // promedio 20

		uno1.agregarHijo(dos1);
		uno1.agregarHijo(dos2);
		uno1.agregarHijo(dos3);

		uno2.agregarHijo(dos4);
		uno2.agregarHijo(dos5);
		uno2.agregarHijo(dos6);

		uno3.agregarHijo(dos7);
		uno3.agregarHijo(dos8);
		uno3.agregarHijo(dos9);

		raiz.agregarHijo(uno1);
		raiz.agregarHijo(uno2);
		raiz.agregarHijo(uno3);

		AnalizadorArbol analizador = new AnalizadorArbol();
		System.out.println("El mayor promedio del arbol es " + analizador.devolverMaximoPromedio(raiz));
	}

}
