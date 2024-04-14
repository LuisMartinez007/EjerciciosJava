import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena1=in.nextLine();
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena2=in.nextLine();
        in.close();
        if (cadena1==cadena2) {
            System.out.println("Las cadenas de caracteres son iguales");
        }else{
            if (cadena1.length()>cadena2.length()) {
                System.out.println(cadena1+" es mayor alfabeticamente");
            }else{
                System.out.println(cadena2+" es mayor alfabeticamente");
            }
        }
    }
}
