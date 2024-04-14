import java.util.Scanner;

public class Ejercicio160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de segundos: ");
        int seg=in.nextInt();
        in.close();

        System.out.println("Dias: "+(seg/86400));
        System.out.println("Horas: "+(seg%86400)/3600);
        System.out.println("Minutos: "+(seg/60)%60);
    }
}
