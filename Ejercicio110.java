import java.util.Scanner;

public class Ejercicio110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la temperatura: ");
        double temperatura=in.nextDouble();
        in.close();
        if(temperatura<=10){
            System.out.println("Hace mucho frío.");
        }else if(temperatura>10 && temperatura<=18){
            System.out.println("Hace frío.");
        }else if(temperatura>18 && temperatura<=25){
            System.out.println("Está templado.");
        }else{
            System.out.println("Hace calor.");
        }
    }
}
