import java.util.Scanner;

public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de tiempo expresada en minutos: ");
        double minIngresados=in.nextDouble();
        in.close();
        int segundos = (int)(minIngresados*60)%60;
        int minutos= (int)minIngresados%60;
        int hrs= (int)(minIngresados/60)%60;
        System.out.println("Horas: "+hrs+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
    }
}
