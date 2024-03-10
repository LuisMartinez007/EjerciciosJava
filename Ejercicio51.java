import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la base del rectangulo: ");
        float n1= in.nextFloat();
        System.out.print("Digite la altura del rectangulo: ");
        float n2= in.nextFloat();
        in.close();
        float area = n1*n2;
        float perimetro= (2*n1)+(2*n2);
        System.out.println("Area de rectangulo: "+area);
        System.out.println("Perimetro de rectangulo: "+ perimetro);
    }
}
