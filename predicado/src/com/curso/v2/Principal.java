package com.curso.v2;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version Lambdas");

		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,200.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Epeneneto",50,10000.00) 
			);
		
		Predicado pre1 = e -> e.edad>20;
		
		Predicado pre2 = x -> x.nombre.endsWith("o");
		
		Predicado pre3 = pato -> pato.sueldo < 200;
		
		
		System.out.println("Mayor a 20 años");
				
		for (Empleado e:listaEmpleados) {
			if (pre1.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Nombre termina en 'o'");
		
		for (Empleado e:listaEmpleados) {
			if (pre2.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Sueldo menor a 200");
		
		for (Empleado e:listaEmpleados) {
			if (pre3.probar(e))
				System.out.println(e);
		}
	}

}
