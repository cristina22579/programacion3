package Cola;
public class ejemploCola {

    public static void main(String[] args) {

        Cola clientes = new Cola(5);

        System.out.println(" EJEMPLO DE COLA ");
        System.out.println("Situacion real: Clientes esperando atencion.");

        System.out.println("\nLa cola esta vacia?");
        System.out.println(clientes.colaVacia());

        System.out.println("\n INSERTAR CLIENTES ");

        clientes.insertar("Carlos");
        clientes.insertar("Juan");
        clientes.insertar("Pedro");
        clientes.insertar("Andres");
        clientes.insertar("Luis");

        clientes.mostrarCola();

        System.out.println("\nLa cola esta llena?");
        System.out.println(clientes.colaLlena());

        System.out.println("\n CONSULTAR EL FRENTE ");

        System.out.println("El cliente que esta en el frente es: "
                + clientes.frenteCola());

        System.out.println("\n QUITAR CLIENTE ");

        String clienteAtendido = clientes.quitar();

        System.out.println("Se atendio: " + clienteAtendido);

        clientes.mostrarCola();

        System.out.println("\nEl nuevo cliente en el frente es: "
                + clientes.frenteCola());

        System.out.println("\n INSERTAR OTRO CLIENTE ");

        clientes.insertar("Santiago");

        clientes.mostrarCola();

        System.out.println("\n LIMPIAR COLA ");

        clientes.limpiarCola();

        System.out.println("\nLa cola esta vacia despues de limpiarla?");
        System.out.println(clientes.colaVacia());

        clientes.mostrarCola();
    }
}

