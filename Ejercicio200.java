import java.util.Scanner;

public class Ejercicio200 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el capital a invertir: ");
        double capital = in.nextDouble();
        in.close();
        double tasaInteresMensual = 0.015;
        int meses = 2;
        double interesGanado = calcularInteresCompuesto(capital, tasaInteresMensual, meses);
        double totalDinero = capital + interesGanado;
        System.out.println("Después de " + meses + " meses, el dinero ganado por intereses será: $" + interesGanado);
        System.out.println("El total de dinero después de " + meses + " meses será: $" + totalDinero);
    }
    public static double calcularInteresCompuesto(double capital, double tasaInteres, int meses) {
        double interesGanado = capital * (Math.pow(1 + tasaInteres, meses) - 1);
        return interesGanado;
    }
}
