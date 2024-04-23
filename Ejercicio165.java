import java.util.*;

public class Ejercicio165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de horas: ");
        int horas = in.nextInt();
        System.out.print("Ingresa la cantidad de minutos: ");
        int minutos = in.nextInt();
        System.out.print("Ingresa la cantidad de segundos: ");
        int segundos = in.nextInt();
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        System.out.println("El total de segundos es: " + totalSegundos);
        in.close();
    }
}
