package com.liceolapaz.des.npc;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		while(true) {
		//Mostrar men� principal
		mostrarMenu();
		//Pedir opci�n 
		pedirOpcion();
		//Leer opci�n y guardarla
		int opcionMenu = leerInt();
		//Seg�n la opci�n escogida
		//Si la opci�n es 1,2,3 o 4:
		if(opcionMenu == 1|| opcionMenu ==2|| opcionMenu == 3|| opcionMenu == 4) {
			//Mostrar submen� 
			mostrarSubmenu();
			//Pedir opci�n submenu
			pedirOpcion(); 
			//Pedir opci�n submenu y guardarla
			int opcionSubmenu = leerInt();
			Numero operando1 = null;
			Numero operando2 = null;
			Numero resultado = null;
			//Segun la opcion escogida:
			switch(opcionSubmenu) {
			//Si la opcion submen� es 1:
			case 1:
				//Pedir el valor del operando 1
				pedirValor1();
				//Leer valor del operando 1 y guardarlo
				int valor1 = leerInt();
				//Pedir el valor del operando 2
				pedirValor2(); 
				//Leer valor del operando 2 y guardarlo	
				int valor2 = leerInt();
				//Realizar operaci�n escogida en men� principal
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
			//Si la opci�n submen� es 2:
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
				//Realizar operaci�n escogida en men� principal
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
				
			//Si la opci�n submenu es 0:
			case 0:
				//Volver a mostrar el menu principal
				break;
			//Si es otra opci�n distinta:
				default:
				//Mostrar mensaje de error	
					System.out.println("Opci�n no v�lida");
			}
		}
		//Si la opci�n es 0:
		else if (opcionMenu ==0) {
			//Salir del programa
			System.exit(0);
		}
		//Si es otra opci�n:
	 else {
			//Mostrar mensaje de error
			System.out.println ("Opci�n no v�lida");
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
		System.out.println("\r\nTipo de n�meros\r\n"
				+ "1. N�meros enteros\r\n"
				+ "2. N�meros racionales\r\n"
				+ "0. Cancelar");
		
	}

	private static int leerInt() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n:");	
	}

	private static void mostrarMenu() {
		System.out.println("\r\nCALCULADORA\r\n"
				+ "1. Suma\r\n"
				+ "2. Resta\r\n"
				+ "3. Producto\r\n"
				+ "4. Divisi�n\r\n"
				+ "0. Salir");		
	}

}
