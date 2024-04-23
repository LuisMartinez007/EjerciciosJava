import java.util.Scanner;

public class Ejercicio162{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número positivo menor a 10 para mostrar su tabla de multiplicar: ");
        int numero = in.nextInt();
        in.close();
        if (numero > 0 && numero < 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("El número ingresado no es válido. Debe ser positivo y menor a 10.");
        }
    }
}