import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,contador=0;
        do {
            System.out.print("Digite un numero (si digita 0 termina): ");
            n=in.nextInt();
            if(n>0){
                contador++;
            }
        } while (n!=0);
        in.close();
        System.out.println("Numeros mayores a 0: "+contador);
    }
}
