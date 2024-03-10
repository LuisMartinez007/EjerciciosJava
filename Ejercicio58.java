import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite las horas trabajadas: ");
        int hrs = in.nextInt();
        System.out.print("Digite la tarifa por hora: ");
        int tarifa = in.nextInt();
        in.close();
        int salario = hrs*tarifa;
        System.out.println("Salario: "+salario);
    }
}
