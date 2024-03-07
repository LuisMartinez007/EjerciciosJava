import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el monto de una compra: ");
        double monto = in.nextDouble();
        in.close();
        double descuento=0;
        if(monto>1000){
            descuento = monto *0.10;
        } else if(monto<=1000 && monto>500){
            descuento = monto*0.20;
        }
        System.out.println("\nMonto: "+monto);
        System.out.println("Descuento: "+ descuento);
        System.out.println("Total: "+(monto-descuento)); 
    }
}
