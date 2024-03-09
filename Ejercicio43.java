import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1=in.nextInt();
        System.out.print("Digite otro numero: ");
        int n2=in.nextInt();
        in.close();
        numeroMenor(n1, n2);
    }
    public static String numeroMenor(int n1, int n2){
        String respuesta="";
        if (n1<n2){
            System.out.println(n1+" es menor que "+n2);
        } else{
            System.out.println(n2+" es menor que "+n1);
        }
        return respuesta;
    }
}
