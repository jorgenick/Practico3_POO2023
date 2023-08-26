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
	
	
	
	public static void cargarNumerosAleatoreos() {
// 		declaracion de variables
		boolean primerNum = false;
		int cantidadValores = 10;
		int topedeNumeros = cantidadValores;
		
// se crear una estructura de control while
		while (cantidadValores > 0) {
//	instanciacion de random para usar metodo aleatorio
			Random random = new Random();
			int alea = random.nextInt(topedeNumeros) + 1;
// declaracion de variable booleana
			boolean esAleatorio = false;
// primer valor queda agregado a la lista
			if (primerNum == false) {
				lista.add(alea);
				primerNum = true;
				cantidadValores--;
			} else {
// a partir del 2do valor se verifica que el mismo no este repetido
				for (int i = 0; i < lista.size(); i++) {
					if (alea == lista.get(i))
						esAleatorio = true;
				}
// si no se encuentra en la lista se agrega y se disminuye la variable que determina cantidad de numeros				
				if (esAleatorio == false) {
					lista.add(alea);
					cantidadValores--;
				}
			}
		}
//		al final mostrar los numeros generados
		for (int j = 0; j < lista.size(); j++) {
			System.out.println(lista.get(j));
		}
	}
}

