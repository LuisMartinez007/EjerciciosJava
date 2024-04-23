import java.util.*;

public class Ejercicio182 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un número menor o igual a 1000 para convertir a número romano: ");
        int numero = in.nextInt();
        in.close();
        if (numero <= 0 || numero > 1000) {
            System.out.println("El número debe ser mayor que 0 y menor o igual a 1000.");
        } else {
            String[] romanosUnidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String[] romanosDecenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] romanosCentenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            int unidades = numero % 10;
            int decenas = (numero / 10) % 10;
            int centenas = (numero / 100) % 10;
            String numeroRomano = romanosCentenas[centenas] + romanosDecenas[decenas] + romanosUnidades[unidades];
            System.out.println("El número romano de " + numero + " es: " + numeroRomano);
        }
    }
}
