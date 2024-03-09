import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cmxMes = 0.5;
        System.out.println("Digite su edad: ");
        int edad =in.nextInt();
        in.close();
        edad = edad*12;
        double cabelloCm= edad*cmxMes;
        double cabelloMts= cabelloCm/100;
        System.out.println("Si nunca se hubiera cortado el cabello mediria "+cabelloMts+" Metros");
    }
}
