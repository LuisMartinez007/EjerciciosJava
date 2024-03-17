import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = in.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = in.nextInt();
        System.out.print("Ingrese su número de celular: ");
        long celular = in.nextLong();
        in.close();
        System.out.println("\n  Datos ingresados");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Número de celular: " + celular);
    }
}

