import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        int[] temperatura = new int[6];
        int acumulador=0,temperaturaMayor=0,temperaturaMenor=0;
        Scanner in = new Scanner(System.in);
        for(int i =0;i<6;i++){
            int hora=4;
            System.out.print("Digite la temperatura de la hora #"+hora*(i+1)+": ");
            temperatura[i]=in.nextInt();
            acumulador+=temperatura[i];
            if (i == 0) {
                temperaturaMayor = temperatura[i];
                temperaturaMenor = temperatura[i];
            } else {
                if (temperatura[i] > temperaturaMayor) {
                    temperaturaMayor = temperatura[i];
                }
                if (temperatura[i] < temperaturaMenor) {
                    temperaturaMenor = temperatura[i];
                }
            }  
        } in.close();
        System.out.println("Media de las temperaturas: "+(acumulador/6));
        System.out.println("Temperatura mayor: "+temperaturaMayor);
        System.out.println("Temperatura menor: "+temperaturaMenor);
    }
}

