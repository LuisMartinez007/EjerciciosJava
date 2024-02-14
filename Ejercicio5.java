import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la diagonal mayor del rombo: ");
        double diagonalMayor = scanner.nextDouble();
        System.out.println("Ingrese la longitud de la diagonal menor del rombo: ");
        double diagonalMenor = scanner.nextDouble();
        double area = (diagonalMayor * diagonalMenor) / 2;
        System.out.println("El área del rombo es: " + area);
        scanner.close();
    }
}

