import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.print("Digite las horas que estuvo estacionado: ");
    int hrs = in.nextInt();
    System.out.print("Digite los minutos que estuvo estacionado: ");
    double min = in.nextDouble();
    in.close();
        if(min<=10){
            hrs = hrs*15;
            System.out.println("\nDebe pagar: "+(hrs)+"$");
        } else{
            hrs++;
            hrs = hrs*15;
            System.out.println("\nDebe pagar: "+(hrs)+"$");
        }
    }
}
