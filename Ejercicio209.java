import java.util.Scanner;

public class Ejercicio209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número de reprobados: ");
        int reprobados = in.nextInt();
        System.out.print("Ingrese el número de aprobados: ");
        int aprobados = in.nextInt();
        System.out.print("Ingrese el número de sobresalientes: ");
        int sobresalientes = in.nextInt();
        in.close();
        int totalAlumnos = reprobados + aprobados + sobresalientes;
        double porcentajeAprobados = ( aprobados / totalAlumnos) * 100;
        double porcentajeReprobados = (reprobados / totalAlumnos) * 100;
        double porcentajeSobresalientes = (sobresalientes / totalAlumnos) * 100;
        double porcentajeSuperados = ((aprobados + sobresalientes) / totalAlumnos) * 100;
        System.out.println("Tantos por ciento de alumnos que han superado la asignatura: " + porcentajeSuperados + "%");
        System.out.println("Tantos por ciento de reprobados: " + porcentajeReprobados + "%");
        System.out.println("Tantos por ciento de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Tantos por ciento de sobresalientes: " + porcentajeSobresalientes + "%");
    }
}
