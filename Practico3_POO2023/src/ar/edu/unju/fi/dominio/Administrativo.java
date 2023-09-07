package ar.edu.unju.fi.dominio;
import ar.edu.unju.fi.manager.Constante;

// la clase administativo hereda los atributos y metodos de la clase Empleado
public class Administrativo extends Empleado {
	// atributo exclusivamente de la clase Administrativo
	private int categoria;

	// constructor
	public Administrativo(int legajo, String nombre, int cant_hijos, String fecha_Nac, int antiguedad, int categoria) {
		super(legajo, nombre, cant_hijos, fecha_Nac, antiguedad);

		this.categoria = categoria;
	}

	// se sobreescriben los metodos de la clase Empleado

	@Override
	public double getSueldoNeto() {
		return getRenBonificable() + getSalarioFamiliar() - getDescuentos();
	}

	@Override
	public double getRenBonificable() {
		return Constante.SUELDO_BASICO + getImporteAntiguedad() + getMontoCategoria(this.categoria);
	}

	@Override
	public double getRenBonificableIncremento() {
		return Constante.SUELDO_BASICO * 1.1 + getImporteAntiguedad() + getMontoCategoria(this.categoria) + getSalarioFamiliar()-getDescuentos();
	}

	@Override
	public double getSalarioFamiliar() {
		return getCant_hijos() * 8000d;
	}

	@Override
	public double getDescuentos() {
		return getRenBonificable() * Constante.DESCUENTO;
	}

	@Override
	public double getImporteAntiguedad() {
		return this.getAntiguedad() * Constante.ADICIONAL_POR_ANTIGUEDAD;
	}

	// metodo de la clase Administrativo para determinar un el monto de acuerdo al tipo de categoria

	public static double getMontoCategoria(int tipoCategoria) {
		double monto = 0;
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
}
