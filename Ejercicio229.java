import java.util.Scanner;

public class Ejercicio229 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.print("Ingrese el primer número: ");
            num1 = in.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = in.nextInt();
            if (num1 % 2 == 0 && num2 % 2 == 0) {
                int suma = num1 + num2;
                System.out.println("La suma de los dos números pares es: " + suma);
            } else {
                System.out.println("Por favor, ingrese dos números pares.");
            }
        } while (num1 != 0 || num2 != 0);
        in.close();
    }
}
