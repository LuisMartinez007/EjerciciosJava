import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = in.nextInt();
        in.close();
        int cifras = 0,nTemporal = numero;
        while (nTemporal != 0) {
            nTemporal = nTemporal / 10;
            cifras++;
        }
        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
    }
}
