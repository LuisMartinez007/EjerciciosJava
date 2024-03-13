import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = in.nextInt();
        in.close();
        int resultado =0;
        for(int i=1; i<=n ;i++){
            if(i%2==0){
                resultado-=i;
            }else{
                resultado+=i;
            }
        }
        System.out.println("Resultado: "+resultado);
    }
}
