package com.practica.ejercicio07;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingresa la longitud del vector: ");
        int longitud = ingreso.nextInt();
        int[] vector = new int[longitud];
        System.out.println("Ingresa los elementos del vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = ingreso.nextInt();
        }
        elementosDivisiblesEntre4(vector);

        ingreso.close();
    
	}
	public static void elementosDivisiblesEntre4(int[] vector) {
	     
		int[] divisiblesEntre4 = new int[vector.length];
		int contador = 0; 
		for (int elemento : vector) {
			if (elemento % 4 == 0) {
				divisiblesEntre4[contador] = elemento;
				contador++;
			}
		}
		System.out.println("Elementos divisibles entre 4:");
			for (int i = 0; i < contador; i++) {
				System.out.print(divisiblesEntre4[i] + " ");
	        }
	    }
}
