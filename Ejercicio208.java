import java.util.Scanner;

public class Ejercicio208 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la calificación del primer parcial: ");
        double parcial1 = in.nextDouble();
        System.out.print("Ingrese la calificación del segundo parcial: ");
        double parcial2 = in.nextDouble();
        System.out.print("Ingrese la calificación del tercer parcial: ");
        double parcial3 = in.nextDouble();
        System.out.print("Ingrese la calificación de prácticas: ");
        double practicas = in.nextDouble();
        System.out.print("Ingrese la calificación de asistencia a clases: ");
        double asistencia = in.nextDouble();
        in.close();
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        double calificacionFinal = (promedioParciales * 0.6) + (practicas * 0.3) + (asistencia * 0.1);
        System.out.println("La calificación final del alumno en Introducción a la programación es: " + calificacionFinal);
    }
}
