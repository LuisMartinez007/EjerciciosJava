import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad=0;
        do {
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
        } while (edad<0);
        entrada.close();
        if (edad<18){
            System.out.println("Usted es menor de edad.");
        } else {
            System.out.println("Usted es mayor de edad.");
        }
    }
}
