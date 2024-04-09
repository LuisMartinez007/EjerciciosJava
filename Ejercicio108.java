import java.util.Scanner;

public class Ejercicio108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int numero=in.nextInt();
        in.close();
        if(numero%2==0){
            System.out.println(numero+" es par.");
        }else{
            System.out.println(numero+" es impar.");
        }
    }
}
