package ar.edu.unju.fi.dominio;

import ar.edu.unju.fi.manager.Constante;

public class Administrativo extends Empleado {
	
	private int categoria;

	@Override
	public double getSueldoBasico() {
		return getRenBonificable()+getSalarioFamiliar()-getDescuentos();
	}

	@Override
	public double getRenBonificable() {
		return Constante.SUELDO_BASICO + getImporteAntiguedad()+getMontoCategoria(this.categoria);
	}
	
	public static double getMontoCategoria(int tipoCategoria) {
		
		double monto=0;
		
		switch (tipoCategoria) {
		case 1:
			monto = 10000d;
			break;
		case 2:
			monto = 14000d;
			break;
		case 3:
			monto = 18000d;
			break;
		case 4:
			monto = 30000d;
			break;
		case 5:
			monto = 40000d;
			break;
		default:
			System.out.println("La categoria ingresada no correponde a lo implementado ");
		}
		
		return monto;
	}

	@Override
	public double getSalarioFamiliar() {
		return getCant_hijos()*8000d;
	}

	@Override
	public double getDescuentos() {
		return getRenBonificable()*Constante.DESCUENTO;
	}

	@Override
	public double getImporteAntiguedad() {
		return this.getAntiguedad()*Constante.ADICIONAL_POR_ANTIGUEDAD;
	}
	
}
