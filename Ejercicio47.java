import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la cantidad comprada: ");
        double cant = in.nextDouble();
        System.out.print("Introduce el precio de la compra: ");
        double precCompra = in.nextDouble();
        precCompra=precCompra*cant;
        System.out.print("Introduce el precio pagado: ");
        double precPagado = in.nextDouble();
        in.close();
        double descuento = ((precCompra - precPagado) / precCompra) * 100;
        System.out.println("El porcentaje descontado es: " + descuento + "%");
    }
}
