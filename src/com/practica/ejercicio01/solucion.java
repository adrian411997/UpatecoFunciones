package com.practica.ejercicio01;

import java.util.Scanner;

public class solucion {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = ingreso.nextInt();
		ingreso.close();
		System.out.println("La cantidad de divisores de " + num + " es: " + enteros(num));
	}
	public static int enteros(int num) {
		int divisores = 0;
		for (int j = 1; j <=num ; j++) {
			if(num % j == 0) {
				divisores++;
			}
		}
		return divisores;
	}
}
