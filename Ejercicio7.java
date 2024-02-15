import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n= entrada.nextInt();
        if (n>0){
            System.out.println(n+" es un numero positivo.");
        } else if(n==0) {
            System.out.println(n+" es un numero neutro.");
        } else {
            System.out.println(n+" es un numero negativo.");
        }
    }
}
