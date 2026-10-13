package Ejercicios;
public class Bicola {

    private class Nodo {
        Object elemento;
        Nodo anterior;
        Nodo siguiente;

        Nodo(Object elemento) {
            this.elemento = elemento;
            anterior = null;
            siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fin;

    public Bicola() {
        frente = null;
        fin = null;
    }

    public boolean bicolaVacia() {
        return frente == null;
    }

    public void ponerFrente(Object elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (bicolaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = frente;
            frente.anterior = nuevo;
            frente = nuevo;
        }
    }

    public void ponerFinal(Object elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (bicolaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            nuevo.anterior = fin;
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Object quitarFrente() throws Exception {
        if (bicolaVacia()) {
            throw new Exception("Bicola vacia");
        }

        Object elemento = frente.elemento;

        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            frente = frente.siguiente;
            frente.anterior = null;
        }

        return elemento;
    }

    public Object quitarFinal() throws Exception {
        if (bicolaVacia()) {
            throw new Exception("Bicola vacia");
        }

        Object elemento = fin.elemento;

        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }

        return elemento;
    }

    public Object frenteBicola() throws Exception {
        if (bicolaVacia()) {
            throw new Exception("Bicola vacia");
        }

        return frente.elemento;
    }

    public Object finalBicola() throws Exception {
        if (bicolaVacia()) {
            throw new Exception("Bicola vacia");
        }

        return fin.elemento;
    }
}

