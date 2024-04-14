import java.util.*;

public class Ejercicio141 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int numero = in.nextInt();
        int raizCuadrada = calcularRaizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es aproximadamente: " + raizCuadrada);
        in.close();
    }
    public static int calcularRaizCuadrada(int num) {
        int estimacionInicial = num / 2;
        int raiz = 0;
        while (estimacionInicial != raiz) {
            raiz = estimacionInicial;
            estimacionInicial = (num / estimacionInicial + estimacionInicial) / 2;
        }
        return raiz;
    }
}
