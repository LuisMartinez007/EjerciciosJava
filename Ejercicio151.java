import java.util.*;

public class Ejercicio151 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = in.nextLine();
        in.close();
        if(cadena.length()>10){
            System.out.println(cadena);
        }else{
            System.out.println("-");
        }
    }
}
