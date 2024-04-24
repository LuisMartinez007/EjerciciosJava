import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite su edad: ");
        int edad = in.nextInt();
        in.close();
        int pulsasiones = (220-edad)/10;
        System.out.println("El numero de pulsasiones por cada 10 segundos: "+pulsasiones);
    }
}
