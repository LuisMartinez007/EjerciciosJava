import java.util.Scanner;

public class Ejercicio121{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        for(int i=1;i<=5;i++){
            System.out.print("Digite el numero #"+i+": ");
            int n=in.nextInt();
            suma+=n;
        }
        in.close();
        System.out.println("Suma: "+suma);
    }
}