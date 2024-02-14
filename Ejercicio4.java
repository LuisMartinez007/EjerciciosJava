import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.print("Digite el radio de un circulo: ");
        float r= entrada.nextFloat();
        entrada.close();
        double area= Math.PI *(r*r);
        System.out.println("Aréa = "+area);
    }
}
