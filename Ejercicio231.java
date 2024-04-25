import java.util.Scanner;

public class Ejercicio231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        while (contador < 10) {
            System.out.print("Ingrese un número: ");
            int numero = in.nextInt();
            if (numero > 0) {
                System.out.println("Número positivo ingresado: " + numero);
                suma += numero;
            }
            contador++;
        }
        System.out.println("La suma de los números positivos es: " + suma);
        in.close();
    }
}
