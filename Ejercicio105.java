import java.util.Scanner;

public class Ejercicio105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double suma=0;
        for(int i=1;i<5;i++){
            System.out.print("Digite la nota #"+i+": ");
            double nota=in.nextDouble();
            suma+=nota;
        }
        in.close();
        double promedio=suma/4;
        if(promedio>=14.5){
            System.out.println("APROBADO.");
        }else if(promedio<14.5 && promedio>10){
            System.out.println("SUPLETORIO.");
        }else{
            System.out.println("PERDIDO EL AÑO.");
        }
    }
}
