package Arreglos;


import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros que tendra el arreglo: ");
        int numero = sc.nextInt();
        
        int[] numeros = new int [numero];
        
        for(int i = 0; i < numero; i++){
            System.out.print("Ingrese el numero: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Ingrese el numero que desea buscar: ");
        int numeroBuscado = sc.nextInt();
        
        int contador = 0;
        
        for(int i = 0; i < numero; i++){
            
            if(numeros[i] == numeroBuscado){
                contador ++;
            }
        }
        System.out.println("El numero " + numeroBuscado + " se encuentra " + contador + " veces en el arreglo");
    }
}
