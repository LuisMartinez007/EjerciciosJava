import java.util.Scanner;

public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1=in.nextInt();
        System.out.print("Digite otro numero: ");
        int n2=in.nextInt();
        System.out.print("Digite otro numero mas: ");
        int n3=in.nextInt();
        in.close();
        if(n1<n2 && n1<n3){
            System.out.println(n1+ " es el número menor de los ingresados.");
        }else if(n2<n1 &&n2<n3){
            System.out.println(n2+ " es el número menor de los ingresados.");
        }else{
            System.out.println(n3+ " es el número menor de los ingresados.");
        }
    }
}
