package com.practica.ejercicio09;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        List<Double> numerosPrueba = List.of(5.0, 10.0, 15.0, 20.0, 25.0);
        double media = calcularMedia(numerosPrueba);
        System.out.println("La media de la lista es: " + media);
    }
    public static double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            System.out.println("La lista está vacía o es nula. No se puede calcular la media.");
            return 0.0;
        }
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }

}
