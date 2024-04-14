import java.util.*;

public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = in.nextLine();
        in.close();
        char[] arregloOriginal = cadena.toCharArray();
        char[] arregloCopia = new char[arregloOriginal.length];
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }
        System.out.println("Contenido del arreglo original: " + new String(arregloOriginal));
        System.out.println("Contenido del arreglo copia: " + new String(arregloCopia));
    }
}
