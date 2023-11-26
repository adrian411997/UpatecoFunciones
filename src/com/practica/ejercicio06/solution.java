package com.practica.ejercicio06;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = ingreso.nextDouble();
        mySolution(radio);
        ingreso.close();
	}
	public static void mySolution(double radio) {
	   
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

     
        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);
	}
}
