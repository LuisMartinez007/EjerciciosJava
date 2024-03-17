import java.util.Scanner;

public class Ejercicio97{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el consumo energetico: ");
        int consumo=in.nextInt();
        in.close();
        int consumoGeneral=10000;
        if(consumo>=(consumoGeneral*0.80) && consumo<=consumoGeneral){
            System.out.println("CONSUMO MEDIO");
        }else if(consumo>consumoGeneral){
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        } else{
            System.out.println("CONSUMO POR DEBAJO DE MEDIO");
        }
    }
}