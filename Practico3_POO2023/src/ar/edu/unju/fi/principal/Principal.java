package ar.edu.unju.fi.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unju.fi.dominio.Empleado;
import ar.edu.unju.fi.dominio.Profesional;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Profesional(1000,"jorge",5,new Date(),3,2);
		Empleado empleado2 = new Profesional(1000,"jorge",5,new Date(),3,2);
	//	Empleado empleado2 = new Profesional();

		List<Empleado> listaEmpleados = new ArrayList<>();

		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}

	}
}