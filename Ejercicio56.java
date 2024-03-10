import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de tiempo expresada en segundos: ");
        int segIngresados=in.nextInt();
        in.close();
        int segundos = segIngresados%60;
        int minutos= (segIngresados/60)%60;
        int hrs= (segIngresados/3600)%60;
        System.out.println("Horas: "+hrs+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
    }
}
