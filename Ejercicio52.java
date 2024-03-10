import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n=in.nextInt();
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
