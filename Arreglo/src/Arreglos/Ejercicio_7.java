package Arreglos;


import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] pares = new int[10];
        int[] impares = new int [10];
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            A[i] = sc.nextInt();
            
            if (A[i] % 2 == 0){
                pares[contadorPares] = A[i];
                contadorPares++;
            }else{
                impares[contadorImpares] = A[i];
                contadorImpares++;
            }
        }
        
        System.out.println("Numeros pares: ");
        for (int i = 0; i < contadorPares; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println("Numeros impares: ");
        for (int i = 0; i < contadorImpares; i++){
            System.out.print(impares[i] + " ");
        }
    }
}
