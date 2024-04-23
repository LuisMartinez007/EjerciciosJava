import java.util.*;

public class Ejercicio180{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalPersonas = 0;
        int hombres = 0;
        int mujeres = 0;
        int sumaEdadHombres = 0;
        int sumaEdadMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;
        System.out.print("Ingrese la cantidad de personas que asistieron a la fiesta: ");
        totalPersonas = in.nextInt();
        for (int i = 1; i <= totalPersonas; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = in.nextInt();
            if (edad < 18) {
                System.out.println("No se permiten menores de edad en la fiesta.");
                continue;
            }
            System.out.print("Ingrese el sexo de la persona (Hombre o Mujer): ");
            String sexo = in.next();
            if (sexo.equalsIgnoreCase("Hombre")) {
                hombres++;
                sumaEdadHombres += edad;
            } else if (sexo.equalsIgnoreCase("Mujer")) {
                mujeres++;
                sumaEdadMujeres += edad;
            }
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
            }
        }in.close();
        double promedioEdadHombres = hombres != 0 ? (double) sumaEdadHombres / hombres : 0;
        double promedioEdadMujeres = mujeres != 0 ? (double) sumaEdadMujeres / mujeres : 0;
        System.out.println("Total de personas en la fiesta: " + totalPersonas);
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Promedio de edad hombres: " + promedioEdadHombres);
        System.out.println("Promedio de edad mujeres: " + promedioEdadMujeres);
        System.out.println("Edad de la persona más joven: " + edadMasJoven);
        
    }
}