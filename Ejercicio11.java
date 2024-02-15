import java.util.*;
public class Ejercicio11 {
    //base por altura
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("HALLAR AREA DE UN RECTANGULO");
        System.out.println("****************************");
        System.out.print("Digite la base del rectangulo: ");
        float n1= entrada.nextFloat();
        System.out.print("Digite la altura del rectangulo: ");
        float n2= entrada.nextFloat();
        float r = n1*n2;
        System.out.print("Area de rectangulo = "+r);
    }
}
