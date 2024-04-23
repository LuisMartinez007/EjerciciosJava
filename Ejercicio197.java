import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio197 {
    public static void main(String[] args) {
        String nombre = "";
        String numeroCuenta = "";
        String movimientos = "";
        double saldo = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader("estado_cuenta.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Nombre:")) {
                    nombre = line.substring(8).trim();
                } else if (line.startsWith("Numero de cuenta:")) {
                    numeroCuenta = line.substring(17).trim();
                } else if (line.startsWith("Movimientos:")) {
                    movimientos += line + "\n";
                } else if (line.startsWith("Saldo actual:")) {
                    saldo = Double.parseDouble(line.substring(14).replace("$", ""));
                } else if (line.startsWith("-")) {
                    movimientos += line + "\n";
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
            e.printStackTrace();
        }
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Movimientos:\n" + movimientos);
        System.out.println("Saldo actual: $" + saldo);
    }
}
