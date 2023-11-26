package com.practica.ejercicio04;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese un numero para sacar el factorial: ");
		int num = ingreso.nextInt();
		
		System.out.println("El factorial de "+ num + " es " + mySolution(num));
		ingreso.close();
	}
	public static int mySolution(int num) {
		int resultado = num;
		for (int i =num -1 ; i > 0 ; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
}
