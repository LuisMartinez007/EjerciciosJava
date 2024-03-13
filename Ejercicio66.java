import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n = in.nextInt();
        in.close();
        int suma=0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            suma += i;
        }
        System.out.println("La suma de numeros impares desde 1 hasta "+ (2 * n - 1) +" = "+suma);
    }
}
