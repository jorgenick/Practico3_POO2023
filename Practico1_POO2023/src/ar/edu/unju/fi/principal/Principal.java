package ar.edu.unju.fi.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.fi.dominio.Automovil;

public class Principal {

	public static void main(String[] args) {


		Automovil automovil1 = new Automovil("DeJorge",'R','U',2010,19986,100f,'V');
		Automovil automovil2 = new Automovil("DeKaren",'R','U',2010,19986,2000000f,'V');
		
		List <Automovil> listaAutos = new ArrayList<>();
		
		listaAutos.add(automovil1);
		listaAutos.add(automovil2);
		
		for (Automovil automovil : listaAutos) {
		System.out.println(automovil);
//		System.out.println("dominio :"+automovil.getDominio()+
//				"precio venta: "+automovil.getPrecioVenta()+
//				"precio valuado :"+automovil.getPrecioValuado());
			
		}

		

	}

}
