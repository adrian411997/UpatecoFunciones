package com.practica.ejercicio08;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radioCirculo = ingreso.nextDouble();
        double areaCirculo = calcularAreaCirculo(radioCirculo);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.print("Ingresa el radio del cilindro: ");
        double radioCilindro = ingreso.nextDouble();
        System.out.print("Ingresa la altura del cilindro: ");
        double alturaCilindro = ingreso.nextDouble();
        double volumenCilindro = calcularVolumenCilindro(radioCilindro, alturaCilindro);
        System.out.println("Volumen del cilindro: " + volumenCilindro);
        ingreso.close();
	}
	public static double calcularAreaCirculo(double radio) {
	        return Math.PI * Math.pow(radio, 2);
	}
	public static double calcularVolumenCilindro(double radio, double altura) {
		double areaBase = calcularAreaCirculo(radio);
		return areaBase * altura;
	}
}
