import java.util.*;

public class Ejercicio135 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la cantidad de números para evaluar: ");
        int cantNum=in.nextInt();
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 1; i <= cantNum; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = in.nextInt();
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        in.close();
    }
}
