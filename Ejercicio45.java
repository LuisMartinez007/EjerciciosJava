import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        double n = in.nextDouble();
        in.close();
        numeroEntero(n);
    }
    public static String numeroEntero(double n){
        String respuesta="";
        if(n<0){
            respuesta="-1";
            System.out.println(respuesta);
        } else if(n==0){
            respuesta="0";
            System.out.println(respuesta);
        } else{
            respuesta="1";
            System.out.println(respuesta);
        }
        return respuesta;
    }
}
