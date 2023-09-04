package ar.edu.unju.fi.principal;

import ar.edu.unju.fi.manager.Manager;

public class Principal {

	public static void main(String[] args) {

//		Empleado empleado1 = new Profesional(1000,"jorge",3,new Date(),5,2);
//		Empleado empleado2 = new Profesional(2000,"jorge",5,new Date(),3,2);
//		Empleado empleado3 = new Profesional(2000,"jorge",5,new Date(),3,2);
//		
//		Empleado empleado4 = new Administrativo(2000,"jorge",2,new Date(),10,2);
//	//	Empleado empleado2 = new Profesional();
//
//		List<Empleado> listaEmpleados = new ArrayList<>();
//
//		listaEmpleados.add(empleado1);
//		listaEmpleados.add(empleado2);
//		listaEmpleados.add(empleado3);
//		listaEmpleados.add(empleado4);
//		
//		for (Empleado empleado : listaEmpleados) {
//			System.out.println(empleado);
//		}
//		
//		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado4.getRenBonificable());
//		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado4.getSalarioFamiliar());
//		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado4.getDescuentos());
//		
//		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado4.getSueldoBasico());
		
		Manager manager = new Manager();
		
		manager.mostrarEmpleadosEdad();

	}
}