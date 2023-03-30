package practica2;

import ejercicio3.Estudiante;
import tp02.ejercicio2.*;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		Estudiante e3 = new Estudiante();
		Estudiante e4 = new Estudiante();

		e1.setApellido("Rodriguez");
		e1.setNombre("Fernando");
		e1.setComision("A1");
		e1.setEmail("ferrodriguez@gmail.com");
		e1.setDireccion("City Bell");

		e2.setApellido("Hernandez");
		e2.setNombre("Joaquin");
		e2.setComision("A2");
		e2.setEmail("joakohernandez@gmail.com");
		e2.setDireccion("La Plata");

		e3.setApellido("Fernandez");
		e3.setNombre("Joaquina");
		e3.setComision("A6");
		e3.setEmail("joaquifernandez@gmail.com");
		e3.setDireccion("La Rioja");

		e4.setApellido("Dominguez");
		e4.setNombre("Florencia");
		e4.setComision("B8");
		e4.setEmail("fdominguez@gmail.com");
		e4.setDireccion("Berazategui");
		
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<>();
		
		lista.agregarFinal(e1);
		lista.agregarFinal(e2);
		lista.agregarFinal(e3);
		lista.agregarFinal(e4);
		
		
		Estudiante [] array = new Estudiante[4];
		array[0]=e1;
		array[1]=e2;
		array[2]=e3;
		array[3]=e4;
		lista.agregar(array);
		
		lista.comenzar();
		while (! lista.fin()) {
			System.out.println(lista.proximo().tusDatos());
		}
	}

}
