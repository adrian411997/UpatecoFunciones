package com.practica.ejercicio10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
	  public static void main(String[] args) {
	        Scanner ingreso = new Scanner(System.in);
	        System.out.print("Ingresa la longitud del vector: ");
	        int longitud = ingreso.nextInt();
	        List<Integer> vector = new ArrayList<>();
	        System.out.println("Ingresa los elementos del vector:");
	        for (int i = 0; i < longitud; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vector.add(ingreso.nextInt());
	        }
	        List<Integer> pares = new ArrayList<>();
	        List<Integer> impares = new ArrayList<>();
	        clasificarNumeros(vector, pares, impares);
	        System.out.println("Números pares multiplicados por 2 (vector A): " + pares);
	        System.out.println("Números impares (vector B): " + impares);
	        ingreso.close();
	    }
    public static void clasificarNumeros(List<Integer> numeros, List<Integer> pares, List<Integer> impares) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero * 2);
            } else {
                impares.add(numero);
            }
        }
    }
}
