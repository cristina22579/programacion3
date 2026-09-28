package Matrices;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("Ingrese [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {

            int suma = 0;

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] % 2 == 0) {
                    suma = suma + matriz[i][j];
                }
            }

            B[i] = suma;
        }

        System.out.println("\nVector B:");

        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
