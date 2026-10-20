package Ejemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaEstudiantes {

    static class Estudiante {

        String nombre;
        double nota;

        Estudiante(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return nombre + " (" + nota + ")";
        }
    }

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Ana", 4.5));
        estudiantes.add(new Estudiante("Luis", 3.2));
        estudiantes.add(new Estudiante("Sofia", 4.8));
        estudiantes.add(new Estudiante("Carlos", 2.9));

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        double suma = 0;

        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.nota;
        }

        System.out.println("Promedio: " + suma / estudiantes.size());

        List<Estudiante> aprobados = new ArrayList<>();

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.nota >= 3.0) {
                aprobados.add(estudiante);
            }
        }

        System.out.println("Aprobados: " + aprobados);

        estudiantes.sort(
                Comparator.comparingDouble(
                        (Estudiante estudiante) -> estudiante.nota
                ).reversed()
        );

        System.out.println("Ordenados por nota: " + estudiantes);
    }
}
