import java.util.*;

public class Ejercicio159 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n= in.nextInt();
        in.close();
        numeroPrimo(n);
    }
    public static String numeroPrimo(int numero){
        String respuesta = " si es primo";
        if (numero <= 1) {
            respuesta = " no es primo"; 
        } else {
            for (int i = 2; i <(numero/2); i++) {
                if (numero % i == 0) {
                    respuesta = " no es primo"; 
                }
            }
        }
        System.out.println(numero+ respuesta);
        return respuesta;
    }
}
