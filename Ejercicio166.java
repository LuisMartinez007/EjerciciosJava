import java.util.*;

public class Ejercicio166 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa tu peso en kg: ");
        double peso = in.nextDouble();
        System.out.print("Ingresa tu altura en metros: ");
        double altura = in.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Tu IMC es: %.2f\n", imc);
        if (imc < 18.5) {
            System.out.println("Estás bajo de peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Tu peso es normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tienes sobrepeso");
        } else {
            System.out.println("Tienes obesidad");
        }
        in.close();
    }
}
