import java.util.Scanner;

public class Ejercicio83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double suma=0;
        for(int i =1;i<=3;i++){
            System.out.print("Digite la nota #"+i+": ");
            double nota=in.nextDouble();
            suma=suma+nota;
        }
        in.close();
        if (suma/3 >7) {
            System.out.println("APROBADO.");
        }else{
            System.out.println("MEJORE LA NOTA.");
        }
    }
}
