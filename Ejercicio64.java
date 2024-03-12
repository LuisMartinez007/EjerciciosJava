import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Potencia sin usar Math.pow
        System.out.print("Digite un numero: ");
        int n1=in.nextInt();
        System.out.print("Digite otro numero: ");
        int n2=in.nextInt();
        in.close();
        int acumulador =1;
        for(int i=1; i<=n2 ; i++){
            acumulador=acumulador*n1;
        }
        System.out.println(n1+" ^ "+n2+" = "+acumulador);
    }
}
