import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,acumulador=0;
        do {
            System.out.print("Digite un numero (si digita un numero entre 20 y 30 o 0 termina): ");
            n=in.nextInt();
            if(n>0){
                acumulador+=n;
            }
        } while (n!=0 && (n<20 || n>30));
        in.close();
        System.out.println("Suma de valores mayores a 0: "+acumulador);
    }
}
