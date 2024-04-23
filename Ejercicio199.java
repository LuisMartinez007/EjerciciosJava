import java.util.Scanner;

public class Ejercicio199 {
    static char[][] tablero = new char[8][8];
    static int puntosJugador1 = 0;
    static int puntosJugador2 = 0;

    public static void main(String[] args) {
        inicializarTablero();
        Scanner in = new Scanner(System.in);
        boolean jugador1 = true;
        while (true) {
            mostrarTablero();
            int filaOrigen, columnaOrigen, filaDestino, columnaDestino;
            System.out.println("Turno del Jugador " + (jugador1 ? "1" : "2"));
            System.out.print("Ingrese coordenadas de origen (fila columna): ");
            filaOrigen = in.nextInt();
            columnaOrigen = in.nextInt();
            System.out.print("Ingrese coordenadas de destino (fila columna): ");
            filaDestino = in.nextInt();
            columnaDestino = in.nextInt();
            if (validarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino, jugador1)) {
                tablero[filaDestino][columnaDestino] = tablero[filaOrigen][columnaOrigen];
                tablero[filaOrigen][columnaOrigen] = ' ';
                if (jugador1) {
                    puntosJugador1++;
                } else {
                    puntosJugador2++;
                }
                jugador1 = !jugador1;
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }
    }
    static void inicializarTablero() {
    }

    static void mostrarTablero() {
    }

    static boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino, boolean jugador1) {
        return true;
    }
}
