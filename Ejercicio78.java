import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un monto: ");
        double monto = in.nextDouble();
        in.close();
        double descuento;
        if(monto<10000){
            descuento = (monto*0.1);
        }else{
            descuento = (monto*0.2);
        }
        System.out.println("Descuento: "+(int)descuento);
        System.out.println("Monto: "+(int)monto);
        System.out.println("Total: "+(int)(monto-descuento));
    }
}
