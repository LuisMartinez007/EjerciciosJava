import java.util.Scanner;

public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero para hallar su valor absoluto: ");
        int numero=in.nextInt();
        in.close();
        int valorAbsoluto = Math.abs(numero); 
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}
