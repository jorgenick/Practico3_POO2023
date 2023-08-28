package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ManagerP2 {
	
	public static List<Integer> lista = new ArrayList<>();
	public static int numeroAleatorio;
	
	public static Integer generarNumeroAleatorio(int topeNumeros) {
		Random random = new Random();
		numeroAleatorio = random.nextInt(topeNumeros) + 1;
        return numeroAleatorio;
	}
	
	public static List cargarNumero(Integer numeroAleatorio) {
		lista.add(numeroAleatorio);
		return lista;
	}
	
	/**
	 * metodo que carga X numeeros al azar de menera tal que
	 * sean todos diferentes
	 * @param cantidadValores : indica la cantidad de numeros a cargar
	 */
	public static void cargarNumerosAleatoreos(int cantidadValores) {
// 		declaracion de variables
		boolean primerNum = false;
		int topedeNumeros = cantidadValores;
		
// se crear una estructura de control while
		while (cantidadValores > 0) {
//	instanciacion de random para usar metodo aleatorio
			int alea = generarNumeroAleatorio(topedeNumeros);
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
	
	public static int ingreseNumeroMultiplo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Se eliminaran los numeros multiplos de (escriba numero):....?");
		int numeroMultiplo = scanner.nextInt();
		return numeroMultiplo;
	}
	
	public static void eliminarMultiplos() {
		int numero = ingreseNumeroMultiplo();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % numero == 0) {
				lista.remove(i);
				i--;
			}
		}
		mostrarLista(lista);
	}
	
	public static void mostrarLista(List listaMostrar) {
		for (int i = 0; i < listaMostrar.size(); i++) {
			System.out.println(listaMostrar.get(i));
		}
	}
	
	public static void modificarMayor() {
		int mayor = 0;
		boolean primerValor = true;
		for (int i = 0; i < lista.size(); i++) {
			if (primerValor == true) {
				primerValor = false;
				mayor = lista.get(i);
			} else {
				if (lista.get(i) > mayor)
					mayor = lista.get(i);
			}
		}
		double mcuadrado = Math.pow(mayor, 2);
		System.out.println("el numero mayor de la lista al cuadrado es : " + mcuadrado);
	}
	
	public static int factorial(int numeroFac) {
		int factoriado = 1;
		for (int i = 1; i <= numeroFac; i++) {
		 factoriado = factoriado*i;
		}
		System.out.println("factorial de "+numeroFac+" es "+factoriado);

		return factoriado;
	}
	
	public static void mayoresFac() {
		for (int i = 0; i < lista.size(); i++) 
		if (lista.get(i) > 10) 
			lista.set(i, factorial(lista.get(i))+lista.get(i));
		System.out.println("-------NUEVA LISTA-----");
		mostrarLista(lista);
	}
	
	
	public static int substrings(String n) {
		
		int cadenaNumero =0;
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese un numero en formato de cadena ej: doce, dieciseis");
			n= scanner.nextLine();
			System.out.println("El numero ingresado en fomato String es: "+n);
			
	//	cadenaNumero = Integer.parseInt(n);	
		
		int sumatoria = Integer.parseInt(n);
		
		switch (n.length()){
		case 1: 
			System.out.println(sumatoria);
			break;
		case 2: 
			System.out.println(sumatoria);
			for (int i = 0; i < n.length(); i++) 
				sumatoria = sumatoria +(n.charAt(i)- '0');
			break;
		
		case 3: 
			System.out.println(sumatoria);
			for (int i = 0; i < n.length(); i++) 
				sumatoria = sumatoria +(n.charAt(i)- '0');
			
			for (int j = 0; j+1 <= n.length()-1; j++) 
				sumatoria = sumatoria + ((n.charAt(j)- '0')*10+(n.charAt(j+1)- '0'));
			System.out.println(sumatoria);
			break;
			
		case 4: 
			System.out.println(sumatoria);
			for (int i = 0; i < n.length(); i++) 
				sumatoria = sumatoria +(n.charAt(i)- '0');
			
			for (int j = 0; j+1 <= n.length()-1; j++) 
				sumatoria = sumatoria + ((n.charAt(j)- '0')*10+(n.charAt(j+1)- '0'));
			System.out.println(sumatoria);
			
			for (int k = 0; k+2 <= n.length()-1; k++) 
			sumatoria = sumatoria + ((n.charAt(k)- '0')*100+(n.charAt(k+1)- '0')*10+(n.charAt(k+2)- '0'));
		
		System.out.println(sumatoria);
			break;
			
		default:
			System.out.println("el numero es muy grande");;
		}
		
		System.out.println("El String convertido a numero es: "+cadenaNumero);
		System.out.println("sumatoria de numeros = "+sumatoria);
		
		return 0;
		}
	


	    public static int sumAllSubstrings(String numberStr) {
	        int sum = 0;
	        int n = numberStr.length();

	        for (int i = 0; i < n; i++) {
	        	System.out.println("sumatoria I: "+sum);
	            int num = 0;
	            for (int j = i; j < n; j++) {
	                num = num * 10 + (numberStr.charAt(j) - '0');
	                sum += num;
	                System.out.println("sumatoria J: "+sum);
	            }
	        }

	        return sum;
	    }
	}

	


