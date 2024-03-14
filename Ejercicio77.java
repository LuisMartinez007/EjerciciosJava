import java.util.Scanner;

public class Ejercicio77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double c, r, n,cuota,p; 
        System.out.print("Digite el capital: ");
        c= in.nextDouble();
        System.out.print("Digite la tasa de interes: ");
        r= in.nextDouble();
        System.out.print("Digite el numero de pagos: ");
        n= in.nextDouble();
        in.close();
        p= Math.pow(1/(1+r), n);
        cuota=(r*c)/(1-p);
        System.out.println("Cuota mesual: "+cuota);
    }
}
