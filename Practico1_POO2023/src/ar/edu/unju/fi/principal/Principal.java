package ar.edu.unju.fi.principal;

import java.util.Scanner;

import ar.edu.unju.fi.manager.ManagerP2;

public class Principal {

	public static void main(String[] args) {
		
//		Manager manajer = new Manager();
//		
//		manajer.cargarAutomoviles();
//		
//		List <Automovil> listaAutos = new ArrayList<>();
//		
//		Automovil auto1 = new Automovil("jorge",'R','U',2023,5500023,100000f);
//		
//		listaAutos.add(auto1);
//		
//		for (Automovil automovil : listaAutos) {
//			System.out.println(automovil);
//		}
// <<<<<<<<<<<<<<<<<<<<<<EJEMPLOS STRING>>>>>>>>>>>>>>>>>>>>>>>>>>>
//	String texto = "jorge";
//	int longitud = texto.length();
//	String texto2 = texto.substring(0, 3);
//	
////	texto.toLowerCase();
//	texto.toUpperCase();
//	
//	
//	String texto3 = texto.replaceAll("jo", "yo");
//	
//	String texto4 = "    jorge tolaba     ";
//	
//	System.out.println(texto);
//	System.out.println("longitud del texto : "+longitud);
//	System.out.println("texto recortado : "+texto4.trim()+"-");
		
// <<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
		
// Manager manager = new Manager ();
//  manager.mostrarAutos();
		
// <<<<<<<<<<<<<<pruebaTP>>>>>>>>>>>>>>>>>>>>>>
		ManagerP2 manager2 = new ManagerP2();
//		manager2.cargarNumerosAleatoreos(12);
//		 manager2.eliminarMultiplos();
//		manager2.modificarMayor();
//		manager2.mayoresFac();
		
	//	manager2.substrings("123");
		
		System.out.println("resultado = "+manager2.sumAllSubstrings("1234"));
		
		

		
	}
}
