import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el sueldo básico del empleado: ");
        double sueldoBasico = entrada.nextDouble();
        System.out.print("Ingrese el monto por horas extras: ");
        double horasExtras = entrada.nextDouble();
        entrada.close();
        double sueldoTotal = sueldoBasico + horasExtras;
        double descuento = sueldoTotal * 0.20;
        double sueldoFinal = sueldoTotal - descuento;
        System.out.println("Sueldo básico: " + sueldoBasico);
        System.out.println("Descuento: " + descuento);
        System.out.println("Ganado: " + sueldoFinal);
    }
}