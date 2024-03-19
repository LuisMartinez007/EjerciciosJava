import java.util.Scanner;

public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la tarifa por hora: ");
        double tarifa=in.nextInt();
        System.out.print("Digite las horas trabajadas: ");
        int horas=in.nextInt();
        in.close();
        if(horas>40){
            int horasExtra = horas-40;
            double tarifaHrsExtra=tarifa+tarifa*0.25;
            System.out.println("Salario: $"+40*tarifa);
            System.out.println("Salario horas extra: $"+horasExtra*tarifaHrsExtra);
            System.out.println("Salario total: $"+(40*tarifa+horasExtra*tarifaHrsExtra));
        }else{
            System.out.println("Salario: $"+horas*tarifa);
        }
    }
}
