package hotel_pro3;

import java.util.Scanner;

public class CinemaStar {

    private Scanner scanner;

    private Pelicula[] peliculas;

    private int cantidadPeliculas;

    private Sala[] salas;

    private final String[] horarios = {
        "14:00 - 16:30",
        "16:30 - 19:00",
        "19:00 - 21:00"
    };

    public CinemaStar() {

        scanner = new Scanner(System.in);

        peliculas = new Pelicula[100];

        cantidadPeliculas = 0;

        salas = new Sala[3];

        for (int i = 0; i < salas.length; i++) {

            salas[i] = new Sala(i + 1);
        }
    }

    public void iniciar() {

        int opcion;

        do {

            mostrarMenuPrincipal();

            opcion = leerEntero(
                "Seleccione una opcion: "
            );

            switch (opcion) {

                case 1:
                    menuPeliculas();
                    break;

                case 2:
                    menuFunciones();
                    break;

                case 3:
                    menuVentas();
                    break;

                case 4:
                    System.out.println(
                        "Aplicacion finalizada."
                    );
                    break;

                default:
                    System.out.println(
                        "Opcion no valida."
                    );
            }

        } while (opcion != 4);
    }

    private void mostrarMenuPrincipal() {

        System.out.println();
        System.out.println(
            "======================================"
        );

        System.out.println(
            "          CINEMASTAR - MENU"
        );

        System.out.println(
            "======================================"
        );

        System.out.println(
            "1. Creacion de peliculas"
        );

        System.out.println(
            "2. Asignacion de funciones"
        );

        System.out.println(
            "3. Ventas"
        );

        System.out.println(
            "4. Salir"
        );

        System.out.println(
            "======================================"
        );
    }

    private void menuPeliculas() {

        int opcion;

        do {

            System.out.println();
            System.out.println(
                "===== CREACION DE PELICULAS ====="
            );

            System.out.println(
                "1. Registrar pelicula"
            );

            System.out.println(
                "2. Mostrar peliculas"
            );

            System.out.println(
                "3. Volver"
            );

            opcion = leerEntero(
                "Seleccione una opcion: "
            );

            switch (opcion) {

                case 1:
                    registrarPelicula();
                    break;

                case 2:
                    mostrarPeliculas();
                    break;

                case 3:
                    break;

                default:
                    System.out.println(
                        "Opcion no valida."
                    );
            }

        } while (opcion != 3);
    }

    private void registrarPelicula() {

        if (cantidadPeliculas == peliculas.length) {

            aumentarCapacidadPeliculas();
        }

        System.out.println();
        System.out.println(
            "===== REGISTRAR PELICULA ====="
        );

        String nombre = leerTexto(
            "Nombre: "
        );

        String idioma = leerTexto(
            "Idioma: "
        );

        String tipo;

        do {

            tipo = leerTexto(
                "Tipo (35mm o 3D): "
            );

            if (!tipo.equalsIgnoreCase("35mm")
                    && !tipo.equalsIgnoreCase("3D")) {

                System.out.println(
                    "Tipo no valido. Debe ser 35mm o 3D."
                );
            }

        } while (!tipo.equalsIgnoreCase("35mm")
                && !tipo.equalsIgnoreCase("3D"));

        int duracion;

        do {

            duracion = leerEntero(
                "Duracion en minutos: "
            );

            if (duracion <= 0) {

                System.out.println(
                    "La duracion debe ser mayor que cero."
                );
            }

        } while (duracion <= 0);

        peliculas[cantidadPeliculas] =
            new Pelicula(
                nombre,
                idioma,
                tipo,
                duracion
            );

        cantidadPeliculas++;

        System.out.println(
            "Pelicula registrada correctamente."
        );
    }

    private void aumentarCapacidadPeliculas() {

        Pelicula[] nuevoArreglo =
            new Pelicula[peliculas.length * 2];

        for (int i = 0; i < peliculas.length; i++) {

            nuevoArreglo[i] = peliculas[i];
        }

        peliculas = nuevoArreglo;
    }

    private void mostrarPeliculas() {

        System.out.println();
        System.out.println(
            "===== PELICULAS REGISTRADAS ====="
        );

        if (cantidadPeliculas == 0) {

            System.out.println(
                "No hay peliculas registradas."
            );

            return;
        }

        for (int i = 0; i < cantidadPeliculas; i++) {

            System.out.println();
            System.out.println(
                "Pelicula #" + (i + 1)
            );

            peliculas[i].mostrarInformacion();
        }
    }

    private void menuFunciones() {

        if (cantidadPeliculas == 0) {

            System.out.println(
                "Primero debe registrar al menos una pelicula."
            );

            return;
        }

        int opcion;

        do {

            System.out.println();
            System.out.println(
                "===== ASIGNACION DE FUNCIONES ====="
            );

            System.out.println(
                "1. Asignar pelicula a una sala"
            );

            System.out.println(
                "2. Mostrar funciones"
            );

            System.out.println(
                "3. Volver"
            );

            opcion = leerEntero(
                "Seleccione una opcion: "
            );

            switch (opcion) {

                case 1:
                    asignarFuncion();
                    break;

                case 2:
                    mostrarTodasLasFunciones();
                    break;

                case 3:
                    break;

                default:
                    System.out.println(
                        "Opcion no valida."
                    );
            }

        } while (opcion != 3);
    }

    private void asignarFuncion() {

        mostrarPeliculas();

        int indicePelicula;

        do {

            indicePelicula = leerEntero(
                "Seleccione el numero de la pelicula: "
            );

            if (indicePelicula < 1
                    || indicePelicula > cantidadPeliculas) {

                System.out.println(
                    "Pelicula no valida."
                );
            }

        } while (indicePelicula < 1
                || indicePelicula > cantidadPeliculas);

        Pelicula pelicula =
            peliculas[indicePelicula - 1];

        int numeroSala = leerEntero(
            "Seleccione la sala (1-3): "
        );

        if (numeroSala < 1 || numeroSala > 3) {

            System.out.println(
                "Sala no valida."
            );

            return;
        }

        if ((numeroSala == 1 || numeroSala == 2)
                && pelicula.getTipo()
                    .equalsIgnoreCase("3D")) {

            System.out.println(
                "Las salas 1 y 2 no pueden presentar peliculas 3D."
            );

            return;
        }

        if (numeroSala == 3
                && !pelicula.getTipo()
                    .equalsIgnoreCase("3D")) {

            System.out.println(
                "La sala 3 solamente puede presentar peliculas 3D."
            );

            return;
        }

        mostrarHorarios();

        int franja = leerEntero(
            "Seleccione la franja (1-3): "
        );

        if (franja < 1 || franja > 3) {

            System.out.println(
                "Franja no valida."
            );

            return;
        }

        Sala sala = salas[numeroSala - 1];

        if (sala.getFuncion(franja - 1) != null) {

            System.out.println(
                "Ya existe una pelicula asignada en esa sala y franja."
            );

            return;
        }

        int filas;

        int columnas = 12;

        if (numeroSala == 3) {

            filas = 6;

        } else {

            filas = 8;
        }

        Funcion funcion =
            new Funcion(
                pelicula,
                horarios[franja - 1],
                numeroSala,
                filas,
                columnas
            );

        boolean asignada =
            sala.asignarFuncion(
                franja - 1,
                funcion
            );

        if (asignada) {

            System.out.println(
                "Funcion asignada correctamente."
            );

        } else {

            System.out.println(
                "No fue posible asignar la funcion."
            );
        }
    }

    private void mostrarHorarios() {

        System.out.println();
        System.out.println(
            "===== FRANJAS HORARIAS ====="
        );

        for (int i = 0; i < horarios.length; i++) {

            System.out.println(
                (i + 1) + ". " + horarios[i]
            );
        }
    }

    private void mostrarTodasLasFunciones() {

        for (int i = 0; i < salas.length; i++) {

            salas[i].mostrarFunciones();
        }
    }

    private void menuVentas() {

        int numeroSala = seleccionarSala();

        if (numeroSala == -1) {
            return;
        }

        Sala sala = salas[numeroSala - 1];

        mostrarFuncionesDeSala(sala);

        int franja = leerEntero(
            "Seleccione la franja (1-3): "
        );

        if (franja < 1 || franja > 3) {

            System.out.println(
                "Franja no valida."
            );

            return;
        }

        Funcion funcion =
            sala.getFuncion(franja - 1);

        if (funcion == null) {

            System.out.println(
                "No hay una pelicula asignada en esa franja."
            );

            return;
        }

        realizarVentas(funcion);
    }

    private int seleccionarSala() {

        int sala = leerEntero(
            "Seleccione la sala (1-3): "
        );

        if (sala < 1 || sala > 3) {

            System.out.println(
                "Sala no valida."
            );

            return -1;
        }

        return sala;
    }

    private void mostrarFuncionesDeSala(Sala sala) {

        System.out.println();

        System.out.println(
            "===== FUNCIONES SALA "
            + sala.getNumero()
            + " ====="
        );

        for (int i = 0;
                i < sala.getFunciones().length;
                i++) {

            Funcion funcion =
                sala.getFuncion(i);

            System.out.println(
                (i + 1) + ". " + horarios[i]
            );

            if (funcion == null) {

                System.out.println(
                    "   Sin pelicula asignada."
                );

            } else {

                System.out.println(
                    "   Pelicula: "
                    + funcion.getPelicula().getNombre()
                );

                System.out.println(
                    "   Disponibles: "
                    + funcion.getDisponibles()
                );
            }
        }
    }

    private void realizarVentas(Funcion funcion) {

        int total = 0;

        int opcion;

        do {

            funcion.mostrarSillas();

            System.out.println(
                "Sillas disponibles: "
                + funcion.getDisponibles()
            );

            if (funcion.getDisponibles() == 0) {

                System.out.println(
                    "La sala esta llena."
                );

                return;
            }

            System.out.println(
                "1. Comprar silla"
            );

            System.out.println(
                "2. Finalizar compra"
            );

            opcion = leerEntero(
                "Seleccione una opcion: "
            );

            if (opcion == 1) {

                String identificador =
                    leerTexto(
                        "Ingrese la silla (ejemplo A3): "
                    );

                if (identificador.length() < 2) {

                    System.out.println(
                        "Identificador de silla no valido."
                    );

                    continue;
                }

                char fila =
                    Character.toUpperCase(
                        identificador.charAt(0)
                    );

                String numeroTexto =
                    identificador.substring(1);

                int numero;

                try {

                    numero =
                        Integer.parseInt(numeroTexto);

                } catch (NumberFormatException e) {

                    System.out.println(
                        "El numero de silla no es valido."
                    );

                    continue;
                }

                if (!funcion.sillaExiste(
                        fila, numero)) {

                    System.out.println(
                        "La silla solicitada no existe."
                    );

                    continue;
                }

                if (!funcion.sillaDisponible(
                        fila, numero)) {

                    System.out.println(
                        "La silla ya esta ocupada."
                    );

                    continue;
                }

                int precio =
                    funcion.comprarSilla(
                        fila,
                        numero
                    );

                total += precio;

                System.out.println(
                    "Compra realizada. Precio: $"
                    + precio
                );

                System.out.println(
                    "Total acumulado: $"
                    + total
                );

            } else if (opcion != 2) {

                System.out.println(
                    "Opcion no valida."
                );
            }

        } while (opcion != 2);

        System.out.println();
        System.out.println(
            "===== RESUMEN DE COMPRA ====="
        );

        System.out.println(
            "Total a pagar: $" + total
        );

        System.out.println(
            "Compra finalizada."
        );
    }

    private String leerTexto(String mensaje) {

        System.out.print(mensaje);

        return scanner.nextLine().trim();
    }

    private int leerEntero(String mensaje) {

        while (true) {

            System.out.print(mensaje);

            String entrada =
                scanner.nextLine().trim();

            try {

                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println(
                    "Debe ingresar un numero entero."
                );
            }
        }
    }
}

