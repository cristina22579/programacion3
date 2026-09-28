package Arreglos;


import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int [30];
        
        
        for(int i = 0; i < 30; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        int numeroMayor = numeros [0];
        int numeroMenor = numeros [0];
        
        for(int i = 0; i < 30; i++){
            
            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
        }
        
        int contadorMayor = 0;
        int contadorMenor = 0;
        
        for(int i = 0; i < 30; i++){
            
            if(numeros[i] == numeroMayor){
                contadorMayor++;
            }
            if(numeros[i] == numeroMenor){
                contadorMenor++;
            }
        }
        
        System.out.println("Numero mayor: " + numeroMayor);
        System.out.println("Se repite: " + contadorMayor + " veces");
        
        System.out.println("Numero menor: " + numeroMenor);
        System.out.println("Se repite: " + contadorMenor + " veces");
    }
}
