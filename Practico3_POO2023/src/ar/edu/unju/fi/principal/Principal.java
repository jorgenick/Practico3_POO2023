package ar.edu.unju.fi.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unju.fi.dominio.Empleado;
import ar.edu.unju.fi.dominio.Profesional;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Profesional(1000,"jorge",3,new Date(),5,2);
		Empleado empleado2 = new Profesional(2000,"jorge",5,new Date(),3,2);
		Empleado empleado3 = new Profesional(2000,"jorge",5,new Date(),3,2);
	//	Empleado empleado2 = new Profesional();

		List<Empleado> listaEmpleados = new ArrayList<>();

		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		listaEmpleados.add(empleado3);
		
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}
		
		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado1.getRenBonificable());
		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado1.getSalarioFamiliar());
		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado1.getDescuentos());
		
		System.out.println("SUELDO NETO PROFESIONAL 1 : $ "+empleado1.getSueldoBasico());

	}
}