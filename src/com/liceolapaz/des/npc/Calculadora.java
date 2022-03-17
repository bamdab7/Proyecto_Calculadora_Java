package com.liceolapaz.des.npc;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		while(true) {
		//Mostrar menú principal
		mostrarMenu();
		//Pedir opción 
		pedirOpcion();
		//Leer opción y guardarla
		int opcionMenu = leerInt();
		//Según la opción escogida
		//Si la opción es 1,2,3 o 4:
		if(opcionMenu == 1|| opcionMenu ==2|| opcionMenu == 3|| opcionMenu == 4) {
			//Mostrar submenú 
			mostrarSubmenu();
			//Pedir opción submenu
			pedirOpcion(); 
			//Pedir opción submenu y guardarla
			int opcionSubmenu = leerInt();
			Numero operando1 = null;
			Numero operando2 = null;
			Numero resultado = null;
			//Segun la opcion escogida:
			switch(opcionSubmenu) {
			//Si la opcion submenú es 1:
			case 1:
				//Pedir el valor del operando 1
				pedirValor1();
				//Leer valor del operando 1 y guardarlo
				int valor1 = leerInt();
				//Pedir el valor del operando 2
				pedirValor2(); 
				//Leer valor del operando 2 y guardarlo	
				int valor2 = leerInt();
				//Realizar operación escogida en menú principal
				operando1 = new Entero(valor1);
				operando2 = new Entero(valor2);
				switch(opcionMenu) {
				case 1:
					resultado = operando1.suma(operando2);
					break;
				case 2:
					resultado = operando1.resta(operando2);
					break;
				case 3:
					resultado = operando1.producto(operando2);
					break;
				case 4:
					resultado = operando1.division(operando2);
					break;
				}
				//Mostrar resultado
				if(resultado != null) {
					mostrarResultado(resultado);
				} else {
					System.out.println("Error al calcular el resultado");
				}
				
				break;
			//Si la opción submenú es 2:
			case 2:
				//Pedir numerador del operando 1
				pedirNumerador1();
				//Leer numerador operando 1 y guardarlo
				int numerador1 = leerInt();
				//Pedir el denominador del operando 1
				 pedirDenominador1();
				//Leer denominador del operando 1 y guardarlo
				int denominador1 = leerInt();
				//Pedir numerador del operando 2
				pedirNumerador2();
				//Leer numerador operando 2 y guardarlo
				int numerador2 = leerInt();
				//Pedir el denominador del operando 2
				pedirDenominador2();
				//Leer denominador del operando 2 y guardarlo
				int denominador2 = leerInt();
				//Realizar operación escogida en menú principal
				operando1 = new Racional(numerador1,denominador1);
				operando2 = new Racional(numerador2,denominador2);
				switch(opcionMenu) {
				case 1:
					resultado = operando1.suma(operando2);
					break;
				case 2:
					resultado = operando1.resta(operando2);
					break;
				case 3:
					resultado = operando1.producto(operando2);
					break;
				case 4:
					resultado = operando1.division(operando2);
					break;
				}
				//Mostrar resultado
				if(resultado != null) {
					mostrarResultado(resultado);
				} else {
					System.out.println("Error al calcular el resultado");
				}
				break;
				
			//Si la opción submenu es 0:
			case 0:
				//Volver a mostrar el menu principal
				break;
			//Si es otra opción distinta:
				default:
				//Mostrar mensaje de error	
					System.out.println("Opción no válida");
			}
		}
		//Si la opción es 0:
		else if (opcionMenu ==0) {
			//Salir del programa
			System.exit(0);
		}
		//Si es otra opción:
	 else {
			//Mostrar mensaje de error
			System.out.println ("Opción no válida");
			}
		}
	}

	private static void pedirDenominador2() {
		System.out.println("Escriba el denominador del operando : ");		
	}

	private static void pedirNumerador2() {
		System.out.println("Escriba el numerador del operando 2: ");		
	}

	private static void pedirDenominador1() {
		System.out.println("Escriba el denominador del operando 1: ");
	}

	private static void pedirNumerador1() {
		System.out.println("EScriba el numerador del operando 1: ");	
	}

	private static void mostrarResultado(Numero resultado) {
		System.out.print("El resultado es: "+ resultado.mostrar());	
	}

	private static void pedirValor2() {
		System.out.print("Escriba el valor del segundo operando: ");		
	}

	private static void pedirValor1() {
		System.out.print("Escriba el valor del primero operando: ");	
	}

	private static void mostrarSubmenu() {
		System.out.println("\r\nTipo de números\r\n"
				+ "1. Números enteros\r\n"
				+ "2. Números racionales\r\n"
				+ "0. Cancelar");
		
	}

	private static int leerInt() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción:");	
	}

	private static void mostrarMenu() {
		System.out.println("\r\nCALCULADORA\r\n"
				+ "1. Suma\r\n"
				+ "2. Resta\r\n"
				+ "3. Producto\r\n"
				+ "4. División\r\n"
				+ "0. Salir");		
	}

}
