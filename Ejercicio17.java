import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite otro numero: ");
        int n2 = entrada.nextInt();
        entrada.close();
        if(n1>n2){
            System.out.println(n1+" > "+n2);
        } else{
            System.out.println(n1+" < "+n2);
        }
    }
}
