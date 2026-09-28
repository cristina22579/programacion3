package Arreglos;


import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros que tendra el arreglo: ");
        int numero = sc.nextInt();
        
        int[] A = new int[numero];
        int[] B = new int[numero];

        System.out.println("Ingrese los elementos:");

        for (int i = 0; i < numero; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        System.out.print("Ingrese el valor que desea buscar: ");
        int numeroBuscado = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < numero; i++) {

            if (A[i] == numeroBuscado) {
                B[contador] = i + 1;
                contador++;
            }
        }

        System.out.println("\nPosiciones donde aparece " + numeroBuscado + ":");

        for (int i = 0; i < contador; i++) {
            System.out.print(B[i] + " ");
        }
    }
}

