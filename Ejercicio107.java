import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad; 
        do{
        System.out.print("Digite su edad: ");
        edad=in.nextInt();
        if (edad<1 || edad>100) {
            System.out.println("Edad invalida.");
        }
        }while(edad<1 || edad>100);
        in.close();
        if(edad<18){
            System.out.println("Usted es menor de edad.");
        }else{
            System.out.println("Usted es mayor de edad.");
        }
    }
}
