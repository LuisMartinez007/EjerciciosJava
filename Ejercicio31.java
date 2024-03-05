import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("   Area de un triangulo   ");
        System.out.print("Digite la base de un triangulo en mm: ");
        double base = in.nextInt();
        System.out.print("Digite la altura de un triangulo en mm: ");
        double altura = in.nextInt();
        in.close();
        double resmm= (altura*base)/2;
        System.out.println("Area = "+resmm+ " MM^2");
        double rescm= resmm/100;
        System.out.println("Area = "+rescm+" CM^2");
        double resM = rescm/10000;
        System.out.println("Area = "+resM+ " M^2");
    }
}
