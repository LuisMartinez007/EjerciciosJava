import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la nota de su examen matematico: ");
        float nota = entrada.nextFloat();
        entrada.close();
        if(nota>=3 & nota<=5){
            System.out.println("Usted gano su examen de matematica.");
        } else if(nota<3 & nota>=0){
            System.out.println("Usted perdio su examen de matematica.");
        }
    }
}
