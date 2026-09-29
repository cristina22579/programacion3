package hotel_pro3;
public class Sala {

    private int numero;

    private Funcion[] funciones;

    public Sala(int numero) {

        this.numero = numero;

        funciones = new Funcion[3];
    }

    public int getNumero() {
        return numero;
    }

    public Funcion[] getFunciones() {
        return funciones;
    }

    public Funcion getFuncion(int posicion) {

        if (posicion < 0 || posicion >= funciones.length) {
            return null;
        }

        return funciones[posicion];
    }

    public boolean asignarFuncion(int posicion, Funcion funcion) {

        if (posicion < 0 || posicion >= funciones.length) {
            return false;
        }

        if (funciones[posicion] != null) {
            return false;
        }

        funciones[posicion] = funcion;

        return true;
    }

    public void mostrarFunciones() {

        System.out.println();
        System.out.println("===== SALA " + numero + " =====");

        for (int i = 0; i < funciones.length; i++) {

            System.out.println("Franja " + (i + 1) + ":");

            if (funciones[i] == null) {

                System.out.println(
                    "Sin pelicula asignada."
                );

            } else {

                funciones[i].mostrarInformacion();
            }

            System.out.println();
        }
    }
}

