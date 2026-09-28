package Matrices;

import java.util.Scanner;

public class Ejercicio_17 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("Ingrese [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSuma de cada fila:");

        for (int i = 0; i < filas; i++) {

            int suma = 0;

            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Fila " + (i + 1) + ": " + suma);
        }

        System.out.println("\nSuma de cada columna:");

        for (int j = 0; j < columnas; j++) {

            int suma = 0;

            for (int i = 0; i < filas; i++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Columna " + (j + 1) + ": " + suma);
        }
    }
}
