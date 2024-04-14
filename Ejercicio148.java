import java.util.*;

public class Ejercicio148 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de datos a procesar: ");
        int n = in.nextInt();
        double[] datos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            datos[i] = in.nextDouble();
        }
        in.close();
        Arrays.sort(datos);
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        double media = suma / n;
        double mediana;
        if (n % 2 == 0) {
            mediana = (datos[n / 2 - 1] + datos[n / 2]) / 2;
        } else {
            mediana = datos[n / 2];
        }
        double sumatoria = 0;
        for (double dato : datos) {
            sumatoria += Math.pow(dato - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumatoria / n);
        System.out.println("Datos ingresados: " + Arrays.toString(datos));
        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }
}
