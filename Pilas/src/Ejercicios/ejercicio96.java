package Ejercicios;
public class ejercicio96 {

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

        public double cimaPila() {
            return elementos[cima];
        }
    }

    public static void main(String[] args) {

        double x = 2;
        double y = -1;
        double z = 3;
        double w = 1;

        double resultado;

        resultado = x * y - (z + w) / Math.pow(z + y, x);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        System.out.println("\nExpresion postfija:");
        System.out.println("xy*zw+zyx^/-");

        System.out.println("\nResultado:");
        System.out.println("r = " + resultado);
    }
}

