import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite su edad: ");
        int edad = in.nextInt();
        int gramos = edad *8000;
        System.out.println("Ha consumido alrededor "+gramos+" gramos de fruta en sus "+edad+" años.");
        System.out.println("Suponiendo que ha consumido solo manzanas, ha consumido: "+(gramos/4)+" manzanas");
    }
}
