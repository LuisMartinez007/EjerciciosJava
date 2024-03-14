import java.util.Scanner;

public class Ejercicio85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("### PAR O IMPAR ###");
        System.out.print("Digite un numero: ");
        int n=in.nextInt();
        in.close();
        if(n%2==0){
            System.out.println(n+" es par.");
        }else{
            System.out.println(n+" es impar.");
        }
    }
}
