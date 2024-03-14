import java.util.Scanner;

public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        for(int i=1;i<=3;i++){
            System.out.print("Digite el voltaje #"+i+": ");
            int voltaje=in.nextInt();
            suma=suma+voltaje;
        }
        in.close();
        if(suma/3 <115){
            System.out.println("VOLTAJE CORRECTO.");
        }else if(suma/3>=115 && suma/3<220){
            System.out.println("VOLTAJE ALTO.");
        }else{
            System.out.println("PELIGRO.");
        }
    }
}
