import java.util.*;
import java.time.*;

public class Ejercicio169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu año de nacimiento:");
        int añoNacimiento = in.nextInt();
        in.close();
        int edad = Year.now().getValue() - añoNacimiento;
        if (edad >= 1 && edad <= 100) {
            String etapa = "";
            if (edad >= 1 && edad <= 12) {
                etapa = "niñez";
            } else if (edad >= 13 && edad <= 18) {
                etapa = "adolescencia";
            } else if (edad >= 19 && edad <= 30) {
                etapa = "juventud";
            } else if (edad >= 31 && edad <= 60) {
                etapa = "adultez";
            } else {
                etapa = "vejez";
            }
            System.out.println("Según tu año de nacimiento, estás en la etapa de " + etapa + ".");
        } else {
            System.out.println("Por favor, ingresa un año de nacimiento válido entre 1 y 100 años de edad.");
        }
    }
}
