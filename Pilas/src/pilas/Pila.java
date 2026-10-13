package pilas;
public class Pila {

    private String[] elementos;
    private int cima;

    public Pila(int tamaño) {
        elementos = new String[tamaño];
        cima = -1;
    }

    public void insertar(String elemento) {
        if (!pilaLlena()) {
            cima++;
            elementos[cima] = elemento;
            System.out.println("Se inserto: " + elemento);
        } else {
            System.out.println("La pila esta llena.");
        }
    }

    public String quitar() {
        if (!pilaVacia()) {
            String elemento = elementos[cima];
            elementos[cima] = null;
            cima--;
            return elemento;
        } else {
            System.out.println("La pila esta vacía.");
            return null;
        }
    }

    public String cimaPila() {
        if (!pilaVacia()) {
            return elementos[cima];
        } else {
            return null;
        }
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public boolean pilaLlena() {
        return cima == elementos.length - 1;
    }

    public void limpiarPila() {
        for (int i = 0; i <= cima; i++) {
            elementos[i] = null;
        }

        cima = -1;

        System.out.println("La pila ha sido limpiada.");
    }

    public void mostrarPila() {
        if (pilaVacia()) {
            System.out.println("La pila esta vacia.");
        } else {
            System.out.println("\nContenido de la pila:");

            for (int i = cima; i >= 0; i--) {
                System.out.println("| " + elementos[i] + " |");
            }

        }
    }
}

