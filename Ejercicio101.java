import java.util.Scanner;

public class Ejercicio101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1 = in.nextInt();
        System.out.print("Digite otro numero: ");
        int n2 = in.nextInt();
        in.close();
        if(n1%n2==0){
            System.out.println(n1+" es divisible por "+n2);
        }else{
            System.out.println(n1+" no es divisible por "+n2);
        }
    }
}
