import java.util.Scanner;

public class Ejercicio228 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codigo="1",contrseña="1234";
        String codigoIn="",contraseñaIn="";
        do {
            System.out.print("Ingrese su codigo: ");
            codigoIn=in.next();
            System.out.print("Ingrese su contraseña: ");
            contraseñaIn=in.next();
            if(codigoIn!=codigo ){
                System.out.println("CODIGO INCORRECTO.");
            }
            if(contraseñaIn!=contrseña){
                System.out.println("CONTRASEÑA INCORRECTA.");
            }
        } while (codigoIn!=codigo && contraseñaIn!=contrseña);
        in.close();
    }
}
