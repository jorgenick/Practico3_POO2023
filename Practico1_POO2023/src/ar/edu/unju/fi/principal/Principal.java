package ar.edu.unju.fi.principal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.dominio.Automovil;
import ar.edu.unju.fi.manager.Manager;

public class Principal {

	public static void main(String[] args) {
		
		Manager manajer = new Manager();
		
		manajer.cargarAutomoviles();
		
		List <Automovil> listaAutos = new ArrayList<>();
		
		Automovil auto1 = new Automovil("jorge",'R','U',2023,5500023,100000f);
		
		listaAutos.add(auto1);
		
		for (Automovil automovil : listaAutos) {
			System.out.println(automovil);
		}
	}
}
