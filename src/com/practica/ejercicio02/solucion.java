package com.practica.ejercicio02;

import java.util.Scanner;

public class solucion {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del vector: ");
		int tam = ingreso.nextInt();
		int[] nums = new int[tam];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Ingrese un numero: ");
			int num = ingreso.nextInt();
			nums[i] = num;
		}
		ingreso.close();
		mySolution(nums);
	}
	public static void mySolution(int[] nums) {
		int pares = 0;
		int impares = 0;
		int mayor = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 == 0) {
				pares++;
			} else {
				impares++;
			}
			if (nums[i] > mayor) {
				mayor = nums[i];
			}
		}
		System.out.println("La cantidad de numeros pares es de: " + pares);
		System.out.println("La cantidad de numeros impares es de: " + impares);
		System.out.println("El mayor numero del vector es : " + mayor);
	}
}
