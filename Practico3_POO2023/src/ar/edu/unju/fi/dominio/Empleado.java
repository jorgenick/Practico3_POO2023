package ar.edu.unju.fi.dominio;

import java.util.Date;

import ar.edu.unju.fi.manager.Constante;

public abstract class Empleado {
	
	private int id_Empleado;
	private int legajo;
	private String nombre;
	private int cant_hijos;
	private String fecha_Nac;
	private int antiguedad;
	
	private static int next_Id = 1;
	
	public Empleado() {
		super();
	}

	public Empleado(int legajo, String nombre, int cant_hijos, String fecha_Nac, int antiguedad) {
		
		super();
		this.id_Empleado = next_Id;
		next_Id++;
		this.legajo = legajo;
		this.nombre = nombre;
		this.cant_hijos = cant_hijos;
		this.fecha_Nac = fecha_Nac;
		this.antiguedad = antiguedad;
		
	}

	public int getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(int id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCant_hijos() {
		return cant_hijos;
	}

	public void setCant_hijos(int cant_hijos) {
		this.cant_hijos = cant_hijos;
	}

	public String getFecha_Nac() {
		return fecha_Nac;
	}

	public void setFecha_Nac(String fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public abstract double getSueldoNeto();

	public abstract double getRenBonificableIncremento();
	
	public abstract double getRenBonificable();
	
	public abstract double getSalarioFamiliar();
	
	public abstract double getDescuentos();
	
	public abstract double getImporteAntiguedad();
	
	
	

	@Override
	public String toString() {
		return "Empleado [id_Empleado=" + id_Empleado + ", legajo=" + legajo + ", nombre=" + nombre + ", cant_hijos="
				+ cant_hijos + ", fecha_Nac=" + fecha_Nac + ", antiguedad=" + antiguedad + "]";
	}
	
	
	


	

}
