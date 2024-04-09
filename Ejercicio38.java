import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Una persona por cada año de vida debe consumir 8 kilogramos de fruta. Dada la
        edad de una persona, imprimir cuántos gramos de fruta ha consumido y
        adicionalmente si una manzana pesa en promedio 4 gramos, determinar cuántas
        manzanas ha consumido.*/
        System.out.print("Digite su edad: ");
        int edad = in.nextInt();
        int gramos = edad *8000;
        System.out.println("Ha consumido alrededor "+gramos+" gramos de fruta en sus "+edad+" años.");
        System.out.println("Suponiendo que ha consumido solo manzanas, ha consumido: "+(gramos/4)+" manzanas");
    }
}
