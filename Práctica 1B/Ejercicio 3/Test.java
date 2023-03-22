package ejercicio3;

public class Test {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		Profesor pr1 = new Profesor();
		Profesor pr2 = new Profesor();
		Profesor pr3 = new Profesor();
	
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
		
		pr1.setApellido("Florencio");
		pr1.setCatedra("Prima");
		pr1.setNombre("Rodrigo");
		pr1.setEmail("rodrigof@yahoo.com");
		pr1.setFacultad("UBA");
		
		pr2.setApellido("Dairu");
		pr2.setCatedra("Principal");
		pr2.setNombre("Lucia");
		pr2.setEmail("luD@yahoo.com");
		pr2.setFacultad("UNLP");
		
		pr3.setApellido("Rapit");
		pr3.setCatedra("Secundaria");
		pr3.setNombre("Sofia");
		pr3.setEmail("soorapit@yahoo.com");
		pr3.setFacultad("UTN");
		
		Estudiante [] students = new Estudiante [2];
		students[0] = e1;
		students[1] = e2;
		
		Profesor [] professors = new Profesor [3];
		professors[0] = pr1;
		professors[1] = pr2;
		professors[2] = pr3;
		
		System.out.println("Estudiantes: ");
		for (int i=0;i<students.length;i++) {
			System.out.println(students[i].tusDatos());;
		}
		
		System.out.println("Profesores: ");
		for (int i=0;i<professors.length;i++) {
			System.out.println(professors[i].tusDatos());
		}
	}
}
