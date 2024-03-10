import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        do{
        System.out.print("Digite un numero entre 1 y 10: ");
        n=in.nextInt();
        }while(n<1 || n>10);
        in.close();
        tablaDeMultiplicar(n);
    }
    public static String tablaDeMultiplicar (int numero){
        String respuesta="";
        for(int i =0;i<=10;i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        return respuesta;
    }
}
