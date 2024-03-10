import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n= in.nextInt();
        in.close();
        numeroPrimo(n);
    }
    public static String numeroPrimo(int numero){
        String respuesta = "1";
        if (numero <= 1) {
            respuesta = "0"; 
        } else {
            for (int i = 2; i <(numero/2); i++) {
                if (numero % i == 0) {
                    respuesta = "0"; 
                }
            }
        }
        System.out.println(respuesta);
        return respuesta;
    }
}
