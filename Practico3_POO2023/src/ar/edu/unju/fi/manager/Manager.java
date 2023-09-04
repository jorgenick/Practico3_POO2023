package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.fi.dominio.Empleado;
import ar.edu.unju.fi.dominio.Profesional;

public class Manager {
	
	public static List <Empleado> listaEmpleados = new ArrayList<>();
	
	public static void cargarEmpleados() {
		
		Empleado empleado1 = new Profesional(1000,"jorge",3,new Date(),5,2);
		Empleado empleado2 = new Profesional(2000,"jorge",5,new Date(),3,2);
		Empleado empleado3 = new Profesional(2000,"jorge",5,new Date(),3,2);
		
	}
	
	public static void mostrarEmpleados( List<Empleado> listaEmpleados) {
		
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}
	}
	
	public static void mostrarEmpleadosEdad (int edad , List<Empleado> listaEmpleados) {
		double acumuladorRenBonificable=0;
		double acumuladorSalarioFam=0;
		double acumuladorDescuentos=0;
		double acumuladorImportesNetos=0;
	
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getAntiguedad()>edad) {
				System.out.println(empleado);
				acumuladorImportesNetos = acumuladorImportesNetos+empleado.getSueldoBasico();
				acumuladorRenBonificable=acumuladorDescuentos+empleado.getRenBonificable();
				acumuladorSalarioFam = acumuladorSalarioFam +empleado.getSalarioFamiliar();
				acumuladorDescuentos = acumuladorDescuentos+empleado.getDescuentos();
			}
		}
		System.out.println("acumuladorImportesNetos : "+acumuladorImportesNetos);
		System.out.println("acumuladorSalarioFam : "+acumuladorSalarioFam);
		System.out.println("acumuladorRenBonificable : "+acumuladorRenBonificable);
		System.out.println("acumuladorDescuentos : "+acumuladorDescuentos);
	}

}
