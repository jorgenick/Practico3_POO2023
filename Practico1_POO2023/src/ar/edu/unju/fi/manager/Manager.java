package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.dominio.Automovil;

public class Manager {
	
	private static char RENAULT = 'R';
	private static char FORD = 'F';
	private static char CITROEN = 'C';
	
	private static char VENDIDO = 'V';
	private static char DISPONIBLE = 'D';
	private static char RESERVADO = 'R';
	
	public static List <Automovil> listaAutos = new ArrayList<>();
	
	public static void cargarAutomoviles() {
		Automovil auto1 = new Automovil("jorge",RENAULT,'U',2023,5500023,100000f);
		Automovil auto2 = new Automovil("karen",FORD,'U',2023,5500023,100000f);
		Automovil auto3 = new Automovil("flaco",FORD,'U',2023,5500023,100000f);
		Automovil auto4 = new Automovil("diego",CITROEN,'U',2023,5500023,100000f);
		Automovil auto5 = new Automovil("dito",CITROEN,'U',2023,5500023,100000f);
		Automovil auto6 = new Automovil("norma",RENAULT,'U',2023,5500023,100000f);
		
		listaAutos.add(auto1);
		listaAutos.add(auto2);
		listaAutos.add(auto3);
		listaAutos.add(auto4);
		listaAutos.add(auto5);
		listaAutos.add(auto6);
		
	}

	public Automovil cambiarEstado(Automovil cambioEstado) {
		cambioEstado.setEstado(VENDIDO);
		return cambioEstado;
	}
	
	public void mostrarAutos() {
		
		for (Automovil automovil : listaAutos) {
			
		}
		
		
	}
	
	public float calcularPorcentaje2(float precioVenta) {
		return precioVenta*1.1f;
	}
	

}
