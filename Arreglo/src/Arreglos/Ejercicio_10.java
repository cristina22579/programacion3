package Arreglos;


import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros que tendra el arreglo: ");
        int numero = sc.nextInt();
        
        int[] A= new int [numero];
        
        for(int i = 0; i < numero; i++){
            System.out.print("Ingrese el numero: " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        int tamañoB = (numero + 1) / 2;
        int[] B = new int [tamañoB];
        
        for(int i = 0; i < tamañoB; i++){
            B[i] = A[i] + A[numero - 1 - i];
        }
        
        System.out.println("Arreglo A:");
        for(int i = 0; i < numero; i++){
            System.out.println(A[i] + " ");
        }
        
        System.out.println("Arreglo B:");
        for(int i = 0; i < tamañoB; i++){
            System.out.println(B[i] + " ");
        }
    }
}
