package Ejercicios;
public class ejercicio93 {

    static class Pila {

        private char[] elementos;
        private int cima;

        public Pila(int tamaño) {
            elementos = new char[tamaño];
            cima = -1;
        }

        public void insertar(char elemento) {
            cima++;
            elementos[cima] = elemento;
        }

        public char quitar() {
            char elemento = elementos[cima];
            cima--;
            return elemento;
        }

        public char cimaPila() {
            return elementos[cima];
        }

        public boolean pilaVacia() {
            return cima == -1;
        }
    }

    public static int prioridad(char operador) {

        if (operador == '^') {
            return 3;
        }

        if (operador == '*' || operador == '/') {
            return 2;
        }

        if (operador == '+' || operador == '-') {
            return 1;
        }

        return 0;
    }

    public static String postFija(String expresion) {

        Pila pila = new Pila(expresion.length());
        String resultado = "";

        for (int i = 0; i < expresion.length(); i++) {

            char caracter = expresion.charAt(i);

            if (caracter == ' ') {
                continue;
            }

            if (Character.isLetter(caracter)) {

                resultado += caracter;

            } else if (caracter == '(') {

                pila.insertar(caracter);

            } else if (caracter == ')') {

                while (!pila.pilaVacia()
                        && pila.cimaPila() != '(') {

                    resultado += pila.quitar();
                }

                if (!pila.pilaVacia()) {
                    pila.quitar();
                }

            } else {

                while (!pila.pilaVacia()
                        && pila.cimaPila() != '('
                        && prioridad(caracter) <= prioridad(pila.cimaPila())) {

                    resultado += pila.quitar();
                }

                pila.insertar(caracter);
            }
        }

        while (!pila.pilaVacia()) {
            resultado += pila.quitar();
        }

        return resultado;
    }

    public static void main(String[] args) {

        String expresion = "(x-y)/(z+w)-(z+y)^x";

        System.out.println("Expresion infija:");
        System.out.println(expresion);

        System.out.println("\nExpresion postfija:");
        System.out.println(postFija(expresion));
    }
}

