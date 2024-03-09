import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        /*Una persona pasa el 34 por ciento de su vida durmiendo. Dado el año de
nacimiento, el año actual y el nombre de una persona, imprimir cuántos días ha
dormido. */
        Scanner in = new Scanner(System.in);
        System.out.print("Digite su año de nacimiento: ");
        int añoNac = in.nextInt();
        System.out.print("Digite el año actual: ");
        int añoAct = in.nextInt();
        System.out.print("Ingrese su nombre: ");
        String nombre = in.next();
        in.close();
        int edad = (añoAct-añoNac)*365;
        double dias = edad *0.34;
        System.out.println(nombre+" usted ha dormido "+dias+" dias");
    }
}
