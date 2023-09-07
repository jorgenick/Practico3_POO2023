package ar.edu.unju.fi.dominio;

import ar.edu.unju.fi.manager.Constante;

//la clase profesional hereda los atributos y metodos de la clase Empleado
public class Profesional extends Empleado {
	// declaracion de atributos propios de la clase Profesional
	private int cantTitulos;

	// constructor
	public Profesional(int legajo, String nombre, int cant_hijos, String fecha_Nac, int antiguedad,int cantTitulos) {
		super(legajo, nombre, cant_hijos, fecha_Nac, antiguedad);
		
		this.cantTitulos = cantTitulos;
	}

	// se sobrescriben los metodos
	
	@Override
	public double getSueldoNeto() {
		return getRenBonificable()+getSalarioFamiliar()-getDescuentos();
	}
	
	@Override
	public double getRenBonificableIncremento() {
		return Constante.SUELDO_BASICO * 1.1 + this.cantTitulos * Constante.ADICIONAL_POR_TITULO + getImporteAntiguedad() +getSalarioFamiliar()-getDescuentos();

	}
	
	@Override
	public double getRenBonificable() {

		return Constante.SUELDO_BASICO + this.cantTitulos * Constante.ADICIONAL_POR_TITULO + getImporteAntiguedad();
	}

	@Override
	public double getSalarioFamiliar() {
		
		return getCant_hijos()*Constante.ADICIONAL_POR_HIJO;
	}

	@Override
	public double getDescuentos() {
		return getRenBonificable()*Constante.DESCUENTO;
	}

	@Override
	public double getImporteAntiguedad() {
		return getAntiguedad() * Constante.ADICIONAL_POR_ANTIGUEDAD;
	}
}
