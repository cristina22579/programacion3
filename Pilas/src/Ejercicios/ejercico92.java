package Ejercicios;
public class ejercico92 {

    static class Pila {

        private String[] elementos;
        private int cima;

        public Pila(int tamaño) {
            elementos = new String[tamaño];
            cima = -1;
        }

        public void insertar(String elemento) {
            cima++;
            elementos[cima] = elemento;
        }

        public String quitar() {
            String elemento = elementos[cima];
            cima--;
            return elemento;
        }

        public boolean pilaVacia() {
            return cima == -1;
        }
    }

    public static void mostrarPila(Pila pila) {

        Pila auxiliar = new Pila(100);

        while (!pila.pilaVacia()) {
            String elemento = pila.quitar();
            System.out.println(elemento);
            auxiliar.insertar(elemento);
        }

        while (!auxiliar.pilaVacia()) {
            pila.insertar(auxiliar.quitar());
        }
    }

    public static void main(String[] args) {

        Pila pila = new Pila(100);

        pila.insertar("Carlos");
        pila.insertar("Juan");
        pila.insertar("Pedro");
        pila.insertar("Luis");

        System.out.println("Elementos de la pila:");

        mostrarPila(pila);
    }
}

