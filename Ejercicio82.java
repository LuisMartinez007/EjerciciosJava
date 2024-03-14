import java.util.Scanner;

public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int numero = in.nextInt();
        in.close();
        if(numero<0){
            System.out.println(numero + " es un número negativo.");
        }else{
            System.out.println(numero+ " es un número positivo");
        }
    }
}
