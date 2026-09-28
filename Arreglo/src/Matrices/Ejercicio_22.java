package Matrices;

import java.util.Scanner;

public class Ejercicio_22 {

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

        System.out.println("\nMatriz:");

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        int mayor = matriz[0][0];
        int menor = matriz[0][0];

        int filaMayor = 0;
        int columnaMayor = 0;

        int filaMenor = 0;
        int columnaMenor = 0;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }

        System.out.println("\nMayor: " + mayor);
        System.out.println("Posicion: fila " + (filaMayor + 1)
                + ", columna " + (columnaMayor + 1));

        System.out.println("\nMenor: " + menor);
        System.out.println("Posicion: fila " + (filaMenor + 1)
                + ", columna " + (columnaMenor + 1));
    }
}

