package Ejemplos;
    import java.util.ArrayList;
import java.util.List;

public class Inventario {

    static class Producto {
        String nombre;
        int cantidad;
        double precio;

        Producto(String nombre, int cantidad, double precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return nombre + " x" + cantidad + " $" + precio;
        }
    }

    public static void main(String[] args) {

        List<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto("Mouse", 10, 25000));
        inventario.add(new Producto("Teclado", 0, 60000));
        inventario.add(new Producto("Monitor", 3, 450000));

        double total = 0;

        for (Producto producto : inventario) {
            total += producto.cantidad * producto.precio;
        }

        System.out.println("Valor total: $" + total);

        inventario.removeIf(producto -> producto.cantidad == 0);

        System.out.println("Disponibles: " + inventario);

        for (Producto producto : inventario) {
            if (producto.nombre.equalsIgnoreCase("monitor")) {
                System.out.println("Encontrado: " + producto);
            }
        }
    }
}

