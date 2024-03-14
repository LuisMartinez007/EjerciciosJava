import java.util.Scanner;

public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la tarifa por hora: ");
        int tarifa = in.nextInt();
        System.out.print("Digite las horas trabajadas: ");
        int hrs = in.nextInt();
        in.close();
        if(hrs>40){
            int hrsExtra = hrs -40;
            int tarifaAumentada = tarifa +(tarifa/2);
            System.out.println("Salario: "+((40*tarifa)+(hrsExtra*tarifaAumentada))+"$");
        } else{
            System.out.println("Salario: "+(tarifa*hrs)+"$");
        }
    }
}
