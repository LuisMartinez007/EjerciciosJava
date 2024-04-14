import java.util.Scanner;

public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena1=in.nextLine();
        System.out.print("Ingrese otra cadena de caracteres: ");
        String cadena2=in.nextLine();
        in.close();
        cadena1=cadena1.toUpperCase();
        cadena2=cadena2.toUpperCase();
        if(cadena1.equals(cadena2)){
            System.out.println("Las cadenas de caracteres son iguales");
        }else{
            System.out.println("Las cadenas de caracteres no son iguales");
        }
    }
}
