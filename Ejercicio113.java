import java.util.Scanner;

public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia=500;
        System.out.println("      Opciones\n1. Motocicleta\n2. Automóvil\n3. Pickup");
        System.out.print("Digite el número del transporte: ");
        int numero=in.nextInt();
        in.close();
        switch (numero) {
            case 1:
                System.out.println("En motocicleta tendría un gasto de "+distancia/20+" lt de gasolina para viajar a Monterrey");
                break;
                case 2:
                System.out.println("En automovil tendría un gasto de "+distancia/10+" lt de gasolina para viajar a Monterrey");
                break;
                case 3:
                System.out.println("En pickup1 tendría un gasto de "+distancia/5+" lt de gasolina para viajar a Monterrey");
                break;
            default:
                break;
        }
    }
}
