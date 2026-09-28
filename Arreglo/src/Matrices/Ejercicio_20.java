package Matrices;

import java.util.Random;

public class Ejercicio_20 {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (j > i) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = aleatorio.nextInt(10) + 1;
                }
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
