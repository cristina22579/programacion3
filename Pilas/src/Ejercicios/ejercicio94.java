package Ejercicios;

import java.util.Scanner;

public class ejercicio94 {

    static class Pila {

        private double[] elementos;
        private int cima;

        public Pila(int tamaño) {
            elementos = new double[tamaño];
            cima = -1;
        }

        public void insertar(double elemento) {
            cima++;
            elementos[cima] = elemento;
        }

        public double quitar() {
            double elemento = elementos[cima];
            cima--;
            return elemento;
        }

        public boolean pilaVacia() {
            return cima == -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        Pila pila = new Pila(10);

        System.out.println("Ingrese 10 numeros reales:");

        for (int i = 0; i < 10; i++) {

            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();

            pila.insertar(numeros[i]);
        }

        System.out.println("\nSecuencia original:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nElementos de la pila:");

        while (!pila.pilaVacia()) {
            System.out.print(pila.quitar() + " ");
        }
    }
}

