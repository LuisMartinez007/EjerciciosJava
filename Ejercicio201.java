import java.util.Scanner;

public class Ejercicio201 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la calificación del primer parcial: ");
        double parcial1 = in.nextDouble();
        System.out.print("Ingrese la calificación del segundo parcial: ");
        double parcial2 = in.nextDouble();
        System.out.print("Ingrese la calificación del tercer parcial: ");
        double parcial3 = in.nextDouble();
        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = in.nextDouble();
        System.out.print("Ingrese la calificación del trabajo final: ");
        double trabajoFinal = in.nextDouble();
        in.close();
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        double calificacionFinal = 0.55 * promedioParciales + 0.30 * examenFinal + 0.15 * trabajoFinal;
        System.out.println("La calificación final del alumno en Algoritmos es: " + calificacionFinal);
    }
}
