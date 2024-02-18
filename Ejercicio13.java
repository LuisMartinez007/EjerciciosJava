import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = entrada.nextInt();
        System.out.print("Introduce el tercer número: ");
        int numero3 = entrada.nextInt();
        entrada.close();
        int ultimoDigito1 = numero1 % 10;
        int ultimoDigito2 = numero2 % 10;
        int ultimoDigito3 = numero3 % 10;
        System.out.println("Último dígito del primer número: " + ultimoDigito1);
        System.out.println("Último dígito del segundo número: " + ultimoDigito2);
        System.out.println("Último dígito del tercer número: " + ultimoDigito3);
    }
}