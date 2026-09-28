package Arreglos;


import java.util.Scanner;

public class ejercicio_13 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros que tendra el arreglo: ");
        int numero = sc.nextInt();

        int[] A = new int[numero];
        int[] mayores = new int[numero];
        int[] menores = new int[numero];

        int suma = 0;

        for (int i = 0; i < numero; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            A[i] = sc.nextInt();

            suma += A[i];
        }

        double media = (double) suma / numero;

        int contMayores = 0;
        int contMenores = 0;

        for (int i = 0; i < numero; i++) {

            if (A[i] > media) {
                mayores[contMayores] = A[i];
                contMayores++;
            } else if (A[i] < media) {
                menores[contMenores] = A[i];
                contMenores++;
            }
        }

        System.out.println("Media: " + media);

        System.out.println("Elementos mayores que l a media:");
        for (int i = 0; i < contMayores; i++) {
            System.out.print(mayores[i] + " ");
        }

        System.out.println("Elementos menores que l a media:");
        for (int i = 0; i < contMenores; i++) {
            System.out.print(menores[i] + " ");
        }
    }
}

