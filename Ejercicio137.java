import java.util.Scanner;

public class Ejercicio137 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el valor de a: ");
        double a=in.nextDouble();
        System.out.print("Digite el valor de b: ");
        double b=in.nextDouble();
        System.out.print("Digite el valor de a: ");
        double c=in.nextDouble();
        in.close();
        double x1= (-b+Math.sqrt((b*b)-4*a*c))/ 2*a;
        double x2= (-b-Math.sqrt((b*b)-4*a*c))/ 2*a;
        System.out.println("X1 = "+x1);
        System.out.println("X2 = "+x2);
    }
}
