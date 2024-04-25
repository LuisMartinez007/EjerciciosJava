import java.util.Scanner;

public class Ejercicio240 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, resultado = 0;
        System.out.print("Ingrese el primer número: ");
        num1 = in.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = in.nextInt();
        for (int i = 0; i < num1; i++) {
            resultado += num2;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
        in.close();
    }
}
