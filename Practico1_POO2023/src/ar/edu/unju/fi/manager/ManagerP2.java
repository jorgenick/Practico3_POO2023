package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ManagerP2 {
	
	public static List<Integer> lista = new ArrayList<>();
	public static Integer numeroAleatorio;
	
	
	public static Integer generarNumeroAleatorio() {
		
		Random random = new Random();
		 // numeroAleatorio = random.nextInt(100); 
		numeroAleatorio = random.nextInt(10) + 1;
        return numeroAleatorio;
	}
	
	public static List cargarNumero(Integer numeroAleatorio) {
		lista.add(numeroAleatorio);
		return lista;
	}
	
	
	
	public static void cargarNumerosAleatoreos(Integer numeroAleatorio) {
		
		boolean primerNum=false;
		int cantidadValores = 10;
		
		while (cantidadValores > 0) {
			if (primerNum == false) {
				lista.add(numeroAleatorio);
				primerNum = true;
				cantidadValores--;
			} else {
				for (int i = 0; i < lista.size(); i++) {
					if (numeroAleatorio != lista.get(i)) {
						lista.add(numeroAleatorio);
						cantidadValores--;
					} else {
						i--;
					}
				}
			}
		}
	}
}

