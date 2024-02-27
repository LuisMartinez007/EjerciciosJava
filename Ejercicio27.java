import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.print("Ingrese su genero: ");
        String genero = in.next();
        if (genero.equalsIgnoreCase("Masculino")) {
            System.out.println("Bienvenido "+nombre);
        } else if(genero.equalsIgnoreCase("Femenino")) {
            System.out.println("Bienvenida "+nombre);
        } else {
            System.out.println("Hola indeciso");
        }
    }
}
