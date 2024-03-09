import java.text.DecimalFormat;

public class Ejercicio44 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        for(int i=2; i<=10; i++){
            double potencia = Math.pow(Math.PI, i);
            System.out.println("\nPI elevado a la " + i + " = " + df.format(potencia));
            System.out.println("Raiz cuadrada de PI elevado a "+i+ " = "+df.format(Math.sqrt(potencia)));
        }
    }
}
