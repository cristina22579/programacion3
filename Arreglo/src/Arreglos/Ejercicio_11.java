package Arreglos;


import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros que tendra el arreglo: ");
        int numero = sc.nextInt();
        
        int[] A = new int[numero];
        int[] negativos = new int[numero];
        int[] ceros = new int[numero];
        int[] positivos = new int[numero];
        
        int contadorNegativo = 0;
        int contadorCero = 0;
        int contadorPositivo = 0;
        
        for (int i = 0; i < numero; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            A[i] = sc.nextInt();
            
            if (A[i] < 0){
                negativos[contadorNegativo] = A[i];
                contadorNegativo++;
            }else if (A[i] == 0){
                ceros[contadorCero] = A[i];
                contadorCero++;
            }else{
                positivos[contadorPositivo] = A[i];
                contadorPositivo++;
            }
        }
        System.out.println("Numeros negativos: ");
        for (int i = 0; i < contadorNegativo; i++){
            System.out.println(negativos[i] + " ");
        }
        
        System.out.println("Ceros: ");
        for (int i = 0; i < contadorCero; i++){
            System.out.println(ceros[i] + " ");
        }
        System.out.println("Numeros positivos: ");
        for (int i = 0; i < contadorPositivo; i++){
            System.out.println(positivos[i] + " ");
        }
    }
}
