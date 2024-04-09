import java.util.Scanner;

public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Línea de autobuses ADO ");
        System.out.println("1. Cartagena $150\n2. Barranquilla $320\n3. Sincelejo $120\n4. Valledupar $90\n5. Santa Marta $110");
        System.out.print("Digite la opción de su destino: ");
        int opción= in.nextInt();
        in.close();
        switch (opción) {
            case 1:
                System.out.println("Su destino es Cartagena, tiempo de traslado 2 horas, costo $150.");
                break;
                case 2:
                System.out.println("Su destino es Barranquilla, tiempo de traslado 4 horas, costo $320.");
                break;
                case 3:
                System.out.println("Su destino es Sincelejo, tiempo de traslado 1 hora y 30 minutos, costo $120.");
                break;
                case 4:
                System.out.println("Su destino es Valledupar, tiempo de traslado 1 hora, costo $90.");
                break;
                case 5:
                System.out.println("Su destino es Santa Marta, tiempo de traslado 1 hora y 15 minutos, costo $110.");
                break;
            default:
                break;
        }
    }
}
