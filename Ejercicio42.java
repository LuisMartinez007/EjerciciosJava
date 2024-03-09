import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de kilovoltios requeridos para el sistema de iluminación: ");
        double kVRequeridos = in.nextDouble();
        in.close();
        double naranjas = kVRequeridos / 0.05;
        double pesoToneladas = (naranjas * 6) / 1000000;
        System.out.println("Se necesitarían " + naranjas + " naranjas para producir " + kVRequeridos + " kilovoltios de energía.");
        System.out.println("El peso seria de " + pesoToneladas + " toneladas.");
    }
}
