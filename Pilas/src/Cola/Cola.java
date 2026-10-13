package Cola;
public class Cola {

    private String[] elementos;
    private int frente;
    private int fin;

    public Cola(int tamaño) {
        elementos = new String[tamaño];
        frente = 0;
        fin = -1;
    }

    public void insertar(String elemento) {
        if (!colaLlena()) {
            fin++;
            elementos[fin] = elemento;
            System.out.println("Se inserto: " + elemento);
        } else {
            System.out.println("La cola esta llena.");
        }
    }

    public String quitar() {
        if (!colaVacia()) {
            String elemento = elementos[frente];

            for (int i = 0; i < fin; i++) {
                elementos[i] = elementos[i + 1];
            }

            elementos[fin] = null;
            fin--;

            return elemento;
        } else {
            System.out.println("La cola esta vacaa.");
            return null;
        }
    }

    public String frenteCola() {
        if (!colaVacia()) {
            return elementos[frente];
        } else {
            return null;
        }
    }

    public boolean colaVacia() {
        return fin == -1;
    }

    public boolean colaLlena() {
        return fin == elementos.length - 1;
    }

    public void limpiarCola() {
        for (int i = 0; i <= fin; i++) {
            elementos[i] = null;
        }

        frente = 0;
        fin = -1;

        System.out.println("La cola ha sido limpiada.");
    }

    public void mostrarCola() {
        if (colaVacia()) {
            System.out.println("La cola esta vacia.");
        } else {
            System.out.println("\nContenido de la cola:");

            for (int i = frente; i <= fin; i++) {
                System.out.println("| " + elementos[i] + " |");
            }
        }
    }
}

