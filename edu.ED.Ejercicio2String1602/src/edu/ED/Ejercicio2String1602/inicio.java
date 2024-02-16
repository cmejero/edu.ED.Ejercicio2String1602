package edu.ED.Ejercicio2String1602;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra para verificar si es un palíndromo:");
		String cadena = scanner.nextLine();

		if (esPalindromo(cadena)) {
			System.out.println("La palabra ingresada es un palíndromo.");
		} else {
			System.out.println("La palabra ingresada no es un palíndromo.");
		}

		
	}
	
	public static boolean esPalindromo(String cadena) {
		int longitud = cadena.length();
		for (int i = 0; i < longitud / 2; i++) {
			if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
