import java.util.Scanner;

public class Ejercicio195 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el número a buscar: ");
        int numeroBuscado = in.nextInt();
        int contadorComparaciones = 0;
        int inicio = 0;
        int fin = numeros.length - 1;
        boolean encontrado = false;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            contadorComparaciones++;
            if (numeros[medio] == numeroBuscado) {
                encontrado = true;
                System.out.println("Elemento encontrado en la posición " + medio);
                break;
            } else if (numeros[medio] < numeroBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
        System.out.println("Cantidad de comparaciones realizadas: " + contadorComparaciones);
        in.close();
    }
}
