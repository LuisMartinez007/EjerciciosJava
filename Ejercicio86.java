import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        for(int i=1;i<=5;i++){
            System.out.print("Digite el voltaje #"+i+": ");
            int voltaje=in.nextInt();
            suma=suma+voltaje;
        }
        in.close();
        if(suma/5 >220){
            System.out.println("ALTO VOLTAJE.");
        }else{
            System.out.println("VOLTAJE CORRECTO.");
        }
    }
}
