import java.util.Scanner;

public class Ejercicio227 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double precBocaJamon=1.5,preRefresco=1.05,precCerveza=0.75;
        System.out.print("Digite el número de unidades cosumidas de bocadillo de jamón: ");
        int bocaJamon=in.nextInt();
        System.out.print("Digite el número de unidades cosumidas de refresco: ");
        int refresco=in.nextInt();
        System.out.print("Digite el número de unidades cosumidas de cerveza: ");
        int cerveza=in.nextInt();
        in.close();
        System.out.println("Bocadillo de jamón: "+(bocaJamon*precBocaJamon));
        System.out.println("Resfresco: "+(refresco*preRefresco));
        System.out.println("Cerveza: "+(cerveza*precCerveza));
        double total = (bocaJamon*precBocaJamon)+(refresco*preRefresco)+(cerveza*precCerveza);
        System.out.println("Total: "+total);
    }
}
