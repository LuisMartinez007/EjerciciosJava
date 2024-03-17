import java.util.Scanner;

public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el año que desea verificar si es bisiesto: ");
        int año=in.nextInt();
        in.close();
        if(añoBisiesto(año)){
            System.out.println(año+" es bisiesto.");
        }else{
            System.out.println(año+" no es bisiesto.");
        }
    }
    public static boolean añoBisiesto(int año){
        if((año%4==0 && año%100!=0) || año %400==0){
            return true;
        }else{
            return false;
        }
    }
}
