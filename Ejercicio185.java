import java.util.*;

public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su apellido paterno: ");
        String apellidoPaterno = in.nextLine();
        System.out.print("Ingrese su apellido materno: ");
        String apellidoMaterno = in.nextLine();
        System.out.print("Ingrese su nombre(s): ");
        String nombres = in.nextLine();
        System.out.print("Ingrese su fecha de nacimiento (formato AAAAMMDD): ");
        String fechaNacimiento = in.nextLine();
        System.out.print("Ingrese su sexo (F/M): ");
        char sexo = in.next().charAt(0);
        System.out.print("Ingrese las dos letras correspondientes a la entidad de nacimiento (ej. DF): ");
        String entidadNacimiento = in.next();
        char curpPrimeraLetraApellidoPaterno = obtenerPrimeraConsonanteInterna(apellidoPaterno);
        char curpPrimeraLetraApellidoMaterno = obtenerPrimeraConsonanteInterna(apellidoMaterno);
        char curpPrimeraLetraNombre = obtenerPrimeraConsonanteInterna(nombres);
        String curp = curpPrimeraLetraApellidoPaterno + "" + curpPrimeraLetraApellidoMaterno + "" + curpPrimeraLetraNombre +
        fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(4, 6) + fechaNacimiento.substring(6, 8) +sexo + entidadNacimiento;
        System.out.println("La CURP generada es: " + curp);
        in.close();
    }
    public static char obtenerPrimeraConsonanteInterna(String palabra) {
        for (int i = 1; i < palabra.length() - 1; i++) {
            char letra = palabra.charAt(i);
            if (esConsonante(letra)) {
                return letra;
            }
        }
        return 'X';
    }
    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(Character.toLowerCase(letra)) != -1;
    }
    
}
