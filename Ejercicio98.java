import java.util.Scanner;

public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1=in.nextInt();
        System.out.print("Digite otro numero: ");
        int n2 = in.nextInt();
        in.close();
        double suma=n1+n2,resta=n1-n2,division=suma/resta;
        System.out.println("Division de suma("+(int)suma+") / resta("+(int)resta+") = "+division);
        if(suma%resta==0){
            System.out.println("La division es exacta.");
        }else{
            System.out.println("La division no es exacta.");
        }
        
    }
}
