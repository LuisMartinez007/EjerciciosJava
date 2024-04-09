import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el valor de la venta: ");
        int valor = in.nextInt();
        in.close();
        if(valor>1000){
            double descuento=valor*0.10;
            System.out.println("Descuento: $"+descuento);
            System.out.println("Valor de la venta: $"+valor);
            System.out.println("Total a pagar: $"+(valor-descuento));
        }else{
            System.out.println("Total a pagar: $"+valor);
        }
    }
}
