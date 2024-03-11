import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        /*.Crear un función que reciba un número real y devuelva un número entero con el
        valor: -1 si el número es negativo, 1 si el número es positivo o 0 si es cero. */
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
        } else if(n==0){
            respuesta="0";
        } else{
            respuesta="1";
        }
        System.out.println(respuesta);
        return respuesta;
    }
}
