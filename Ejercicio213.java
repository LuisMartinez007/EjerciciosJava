import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos para el lunes:");
        int tiempoLunes = in.nextInt();
        System.out.println("Ingrese el tiempo en minutos para el miércoles:");
        int tiempoMiercoles = in.nextInt();
        System.out.println("Ingrese el tiempo en minutos para el viernes:");
        int tiempoViernes = in.nextInt();
        in.close();
        int tiempoTotal = tiempoLunes + tiempoMiercoles + tiempoViernes;
        double tiempoPromedioDiario = tiempoTotal / 3.0;
        double tiempoPromedioSemanal = tiempoPromedioDiario * 3;
        System.out.println("El tiempo promedio semanal es: " + tiempoPromedioSemanal + " minutos");
    }
}
