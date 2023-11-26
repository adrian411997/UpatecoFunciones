package com.practica.ejercicio03;
import java.util.Scanner;

public class solucion {
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

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Suma total de los elementos");
            System.out.println("2. Cantidad de números primos");
            System.out.println("3. Buscar un elemento");
            System.out.println("4. Ordenamiento y mostrar en pantalla");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    int suma = sumaTotal(vector);
                    System.out.println("La suma total de los elementos es: " + suma);
                    break;
                case 2:
                    int cantidadPrimos = contarNumerosPrimos(vector);
                    System.out.println("La cantidad de números primos en el vector es: " + cantidadPrimos);
                    break;
                case 3:
                    System.out.print("Ingresa el elemento a buscar: ");
                    int elementoBuscar = ingreso.nextInt();
                    boolean encontrado = buscarElemento(vector, elementoBuscar);
                    System.out.println("El elemento " + elementoBuscar + " " + (encontrado ? "está" : "no está") + " en el vector.");
                    break;
                case 4:
                    ordenarYMostrar(vector);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 5);

        ingreso.close();
    }
    public static int sumaTotal(int[] vector) {
        int suma = 0;
        for (int elemento : vector) {
            suma += elemento;
        }
        return suma;
    }

    public static int contarNumerosPrimos(int[] vector) {
        int cantidadPrimos = 0;
        for (int elemento : vector) {
            if (esPrimo(elemento)) {
                cantidadPrimos++;
            }
        }
        return cantidadPrimos;
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean buscarElemento(int[] vector, int elemento) {
        for (int num : vector) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    public static void ordenarYMostrar(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.print("Vector ordenado: ");
        for (int elemento : vector) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }


}
