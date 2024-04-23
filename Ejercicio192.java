import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio192 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un texto de máximo 255 caracteres:");
        String texto = in.nextLine();
        if (texto.length() > 255) {
            System.out.println("El texto excede los 255 caracteres permitidos.");
        } else {
            String nombreArchivo = "ruta_del_archivo/nombre_archivo.txt";
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
                bw.write(texto);
                bw.close();
                
                System.out.println("El texto se ha escrito correctamente en el archivo.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
        in.close();
    }
}
