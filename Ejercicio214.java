import java.util.Scanner;

public class Ejercicio214 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la inversion de la primera persona: ");
        double inversion1=in.nextDouble();
        System.out.print("Digite la inversion de la segunda persona: ");
        double inversion2=in.nextDouble();
        System.out.print("Digite la inversion de la tercera persona: ");
        double inversion3=in.nextDouble();
        in.close();
        double inversionTotal=inversion1+inversion2+inversion3;
        System.out.println("Porcentaje de primera persona: "+(float)(inversion1/inversionTotal)*100+" %");
        System.out.println("Porcentaje de segunda persona: "+(float)(inversion2/inversionTotal)*100+" %");
        System.out.println("Porcentaje de tercera persona: "+(float)(inversion3/inversionTotal)*100+" %");
    }
}
