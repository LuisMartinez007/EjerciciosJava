import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double oro, onz=28.3295, onz_oro, prec_oro, pago;
        System.out.println("Digite los kilos de oro: ");
        oro= entrada.nextDouble();
        oro= oro*1000;
        System.out.println("Digite el precio de una onza de oro: ");
        prec_oro=entrada.nextDouble();
        entrada.close();
        onz_oro=oro/onz;
        int onz_oro_int= (int)onz_oro;
        System.out.println("Los kilos de oro ingresados equivalen a "+onz_oro_int+" onzas ");
        pago=onz_oro*prec_oro;
        int pago_int= (int)pago;
        System.out.println("Las "+onz_oro_int+" onzas de oro equivalen a $"+pago_int);
    }
}
