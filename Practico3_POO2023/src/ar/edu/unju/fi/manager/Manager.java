package ar.edu.unju.fi.manager;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.dominio.Administrativo;
import ar.edu.unju.fi.dominio.Empleado;
import ar.edu.unju.fi.dominio.Profesional;

public class Manager {
	
	public static List <Empleado> listaEmpleados = new ArrayList<>();
	
	public static void cargarEmpleados() {
		
		Empleado empleado1 = new Profesional(1000,"pedro",3,"2000-06-17",5,2);
		Empleado empleado2 = new Profesional(2000,"jorge",5,"1993-06-17",3,2);
		Empleado empleado3 = new Profesional(2000,"karen",5,"1993-06-17",3,2);
		Empleado empleado4 = new Administrativo(2000,"juan",5,"1994-06-17",3,4);

		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		listaEmpleados.add(empleado3);
		listaEmpleados.add(empleado4);
		
	}
	
	public static void mostrarEmpleados( List<Empleado> listaEmpleados) {
		
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}
	}
	
	public static void mostrarEmpleadosAntiguedad (int anti , List<Empleado> listaEmpleados) {
		double acumuladorRenBonificable=0;
		double acumuladorSalarioFam=0;
		double acumuladorDescuentos=0;
		double acumuladorImportesNetos=0;
	
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getAntiguedad()>anti) {
				System.out.println(empleado);
				acumuladorImportesNetos = acumuladorImportesNetos+empleado.getSueldoNeto();
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
	
	
	public static void mostrarEmpleadosEdad() {
		
		cargarEmpleados();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese edad limite");
		int edadLimite = scanner.nextInt();
		
		
		for (Empleado empleado : listaEmpleados) {
			if (calcularEdad(empleado.getFecha_Nac()) >= edadLimite) {
				System.out.println(empleado);
			}
		}
	}
	
	public static void mostrarEmpleadosEdadNeto() {
		
		cargarEmpleados();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese edad limite");
		int edadLimite = scanner.nextInt();
		double netoAcumulado = 0;
		for (Empleado empleado : listaEmpleados) {
			if (calcularEdad(empleado.getFecha_Nac()) >= edadLimite) {
				netoAcumulado = netoAcumulado + empleado.getSueldoNeto();
			}
		}
		System.out.println("SUELDO NETO ACUMULADO DE EMPLEADOS CON EDAD MAYOR A "+edadLimite+" = "+netoAcumulado);
	}
	
	
	public static int calcularEdad (String fecha_de_nacimiento) {

		   LocalDate fechaNac = LocalDate.parse(fecha_de_nacimiento) ;
		   LocalDate fechaHoy = LocalDate.now();
		   Period edad = Period.between(fechaNac, fechaHoy);
			int edadIm = edad.getYears();
		   
		return edadIm;
	}
	
	public static void incremetarSueldoBasico () {
		
		cargarEmpleados();
		
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getAntiguedad()<= 2) {
				empleado.getRenBonificableIncremento();
			} 
		}
	}
}
