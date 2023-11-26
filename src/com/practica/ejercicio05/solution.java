package com.practica.ejercicio05;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		
		System.out.print("Ingrese el tamaño del vector: ");
		int tam = ingreso.nextInt();
		int[] nums = new int[tam];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Ingrese un numero: ");
			int num = ingreso.nextInt();
			nums[i] = num;
		}
		ingreso.close();
		bubbleSort(nums);

	}
	 static void bubbleSort(int array[]) {
		 int size = array.length;

		    for (int i = 0; i < size - 1; i++)
	
		      for (int j = 0; j < size - i - 1; j++)
	
		        if (array[j] > array[j + 1]) {
		   
		          int temp = array[j];
		          array[j] = array[j + 1];
		          array[j + 1] = temp;
		        }
		    System.out.println("El menor valor del vector es: " + array[0]);
		    System.out.println("El mayor valor del vector es: " + array[size-1]);
		  }
}
