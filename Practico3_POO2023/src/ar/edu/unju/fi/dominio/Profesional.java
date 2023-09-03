package ar.edu.unju.fi.dominio;


import java.util.Date;

import ar.edu.unju.fi.manager.Constante;

public class Profesional extends Empleado {
	
	private int cantTitulos;

	public Profesional(int legajo, String nombre, int cant_hijos, Date fecha_Nac, int antiguedad,int cantTitulos) {
		super(legajo, nombre, cant_hijos, fecha_Nac, antiguedad);
		
		this.cantTitulos = cantTitulos;
		
	}

	public double getSueldoNetoProfesional() {
		
		return getRenBonificable()+getSalarioFamiliar()-getDescuentos();
	}
	
	@Override
	public double getRenBonificable() {

		return super.getSueldoBasico()+this.cantTitulos*Constante.ADICIONAL_POR_TITULO+getImporteAntiguedad();
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
		return getAntiguedad()*Constante.ADICIONAL_POR_ANTIGUEDAD;
	}


	


}
