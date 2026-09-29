package hotel_pro3;
public class Funcion {

    private Pelicula pelicula;
    private String horario;
    private int sala;
    private char[][] sillas;
    private int disponibles;

    public Funcion(Pelicula pelicula, String horario, int sala,
                   int filas, int columnas) {

        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;

        sillas = new char[filas][columnas];

        disponibles = 0;

        inicializarSillas();
    }

    private void inicializarSillas() {

        for (int i = 0; i < sillas.length; i++) {

            for (int j = 0; j < sillas[i].length; j++) {

                if (sala == 1 || sala == 2) {

                    if ((i == 6 || i == 7) && j >= 9) {

                        sillas[i][j] = 'X';

                    } else {

                        sillas[i][j] = 'D';
                        disponibles++;
                    }

                } else {

                    sillas[i][j] = 'D';
                    disponibles++;
                }
            }
        }
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public int getSala() {
        return sala;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void mostrarInformacion() {

        System.out.println("Sala: " + sala);
        System.out.println("Horario: " + horario);
        System.out.println("Pelicula: " + pelicula.getNombre());
        System.out.println("Tipo: " + pelicula.getTipo());
        System.out.println("Sillas disponibles: " + disponibles);
    }

    public void mostrarSillas() {

        System.out.println();
        System.out.println(
            "             1  2  3  4  5  6  7  8  9 10 11 12"
        );

        System.out.println(
            "             ------------------------------------"
        );

        for (int i = 0; i < sillas.length; i++) {

            char fila = (char) ('A' + i);

            System.out.print("Fila " + fila + "       ");

            for (int j = 0; j < sillas[i].length; j++) {

                System.out.print(sillas[i][j] + "  ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("D = Disponible");
        System.out.println("O = Ocupada");
        System.out.println("X = No existe");
        System.out.println();
    }

    public boolean sillaExiste(char fila, int numero) {

        int indiceFila = fila - 'A';

        if (indiceFila < 0 || indiceFila >= sillas.length) {
            return false;
        }

        if (numero < 1 || numero > sillas[indiceFila].length) {
            return false;
        }

        return sillas[indiceFila][numero - 1] != 'X';
    }

    public boolean sillaDisponible(char fila, int numero) {

        if (!sillaExiste(fila, numero)) {
            return false;
        }

        int indiceFila = fila - 'A';

        return sillas[indiceFila][numero - 1] == 'D';
    }

    public int comprarSilla(char fila, int numero) {

        if (!sillaExiste(fila, numero)) {
            return -1;
        }

        int indiceFila = fila - 'A';

        if (sillas[indiceFila][numero - 1] != 'D') {
            return 0;
        }

        sillas[indiceFila][numero - 1] = 'O';

        disponibles--;

        if (sala == 3) {
            return 10000;
        }

        if (fila == 'G' || fila == 'H') {
            return 12000;
        }

        return 8000;
    }
}

