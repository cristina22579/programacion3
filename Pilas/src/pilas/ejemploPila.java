package pilas;
public class ejemploPila {

    public static void main(String[] args) {

        Pila personas = new Pila(5);

        System.out.println("EJEMPLO DE PILA");
        System.out.println("Situacion real: Registro de personas.");

        System.out.println("\nLa pila esta vacia?");
        System.out.println(personas.pilaVacia());

        System.out.println("\n INSERTAR PERSONAS ");

        personas.insertar("Carlos");
        personas.insertar("Juan");
        personas.insertar("Pedro");
        personas.insertar("Andres");
        personas.insertar("Luis");

        personas.mostrarPila();

        System.out.println("\nLa pila esta llena?");
        System.out.println(personas.pilaLlena());

        System.out.println("\nCONSULTAR LA CIMA");

        System.out.println("La persona que esta en la cima es: "
                + personas.cimaPila());

        System.out.println("\n QUITAR PERSONA ");

        String personaRetirada = personas.quitar();

        System.out.println("Se retiro: " + personaRetirada);

        personas.mostrarPila();

        System.out.println("\nLa nueva persona en la cima es: "
                + personas.cimaPila());

        System.out.println("\n INSERTAR OTRA PERSONA ");

        personas.insertar("Santiago");

        personas.mostrarPila();

        System.out.println("\n LIMPIAR PILA ");

        personas.limpiarPila();

        System.out.println("\nLa pila esta vacia despues de limpiarla?");
        System.out.println(personas.pilaVacia());

        personas.mostrarPila();
    }
}

