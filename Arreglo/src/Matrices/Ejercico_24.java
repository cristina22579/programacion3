package Matrices;

import java.util.Scanner;

public class Ejercico_24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double[] produccion = new double[12];

        double suma = 0;

        for (int i = 0; i < 12; i++) {

            System.out.print("Ingrese las toneladas producidas en "
                    + meses[i] + ": ");

            produccion[i] = sc.nextDouble();

            suma = suma + produccion[i];
        }

        double promedio = suma / 12;

        int superiores = 0;
        int inferiores = 0;

        double mayor = produccion[0];
        int mesMayor = 0;

        for (int i = 0; i < 12; i++) {

            if (produccion[i] > promedio) {
                superiores++;
            }

            if (produccion[i] < promedio) {
                inferiores++;
            }

            if (produccion[i] > mayor) {
                mayor = produccion[i];
                mesMayor = i;
            }
        }

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Promedio anual: " + promedio);

        System.out.println("Meses con produccion superior al promedio: "
                + superiores);

        System.out.println("Meses con produccion inferior al promedio: "
                + inferiores);

        System.out.println("Mes con mayor produccion: "
                + meses[mesMayor]);

        System.out.println("Produccion: " + mayor + " toneladas");
    }
}

