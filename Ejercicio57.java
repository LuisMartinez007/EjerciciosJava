import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n=in.nextInt();
        in.close();
        System.out.println("Suma de los digitos de "+n+" es igual a: "+sumaDeDigitosDeUnNumero(n));
    }
    public static int sumaDeDigitosDeUnNumero(int numero){
        int suma = 0;
        while (numero != 0) {
            suma = suma + (numero % 10);
            numero =numero/ 10;
        }
        return suma;
    }
}
