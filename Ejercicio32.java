import java.util.*;
public class Ejercicio32 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("****************************");
            System.out.println("HALLAR AREA DE UN RECTANGULO");
            System.out.println("****************************");
            System.out.print("Digite la base del rectangulo en metros: ");
            double n1= entrada.nextDouble();
            System.out.print("Digite la altura del rectangulo en metros: ");
            double n2= entrada.nextDouble();
            entrada.close();
            double rM = n1*n2;
            System.out.println("Area = "+rM+" M^2");
            double rCM = rM*10000;
            System.out.println("Area = "+rCM+" CM^2");
            double rMM = rCM*100;
            System.out.println("Area = "+rMM+" MM^2");
        }
}
