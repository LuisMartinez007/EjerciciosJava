import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.print("Digite las horas que estuvo estacionado: ");
  int hrs = in.nextInt();
  System.out.print("Digite los minutos que estuvo estacionado: ");
  double min = in.nextDouble();
  in.close();
  double tarifaMin= 0.25;
  hrs = hrs*15;
  min = min*tarifaMin;
  System.out.println("\nDebe pagar: "+(min+hrs));
    }
}
