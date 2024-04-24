import java.util.Scanner;

public class Ejercicio205 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Bolivianos: ");
        double montoBolivianos = in.nextDouble();
        in.close();
        System.out.print("Ingrese el tipo de cambio actual (1 Boliviano a X Dólares): ");
        double tipoCambio = in.nextDouble();
        double dolares = montoBolivianos/tipoCambio;
        System.out.println("El monto equivalente en Dólares es: " + dolares + " USD");
    }
}
