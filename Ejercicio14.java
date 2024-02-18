import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número de 4 dígitos: ");
        int numero = entrada.nextInt();
        entrada.close();
        int digito1 = numero / 1000;
        int digito2 = (numero % 1000) / 100;
        int digito3 = (numero % 100) / 10;
        int digito4 = numero % 10;
        int sumaDigitos = digito1 + digito2 + digito3 + digito4;
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }
}