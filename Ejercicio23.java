import java.util.Random;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        int aleatorios[] = generarNumerosAzarEntre0y9();
        int intentos = 0;
        do{
        int n1= pedirNumeros("Digite el primer numero");
        int n2= pedirNumeros("Digite el primer numero");
        int n3= pedirNumeros("Digite el primer numero");
        String respuesta = validarNumeros(aleatorios, n1, n2, n3);
        System.out.println("Respuesta: "+respuesta);
        if(n1== aleatorios[0] && n2 == aleatorios[1] && n3 == aleatorios[2]){
            System.out.println("Felicidades ganó.");
            break;
        }
        intentos ++;
        System.out.println("Le quedan "+(4-intentos)+ " intentos");
        }while(intentos<5);
        
    }

    public static int[] generarNumerosAzarEntre0y9(){
        Random azar = new Random();
        int n1=0, n2=0, n3=0;
        do {
            n1 = azar.nextInt(10 - 0);
            n2 = azar.nextInt(10 - 0);
            n3 = azar.nextInt(10 - 0);
            if (n1 != n2 && n1!= n3 && n2 != n3) {
                break;
            }
        
        } while (true);
        return new int[] { n1,n2,n3 }; 
    }
    public static int pedirNumeros(String mensaje){
        var in = new Scanner(System.in);
        do {
            System.out.print(mensaje+": ");
            int n = in.nextInt();
            if(n<0 || n>9){
                System.out.println(n+ " no se encuentra entre 1 y 9.");
                continue;
            }
            return n;
        } while (true);
    }
    public static String validarNumeros(int aleatorios[], int n1, int n2, int n3){
        String respuesta = "";
        if(n1 == aleatorios[0]){
            respuesta += "V ";
        } else if(n1 == aleatorios[1]){
            respuesta += "A ";
        } else if(n1 == aleatorios[2]){
            respuesta += "A ";
        }
        else {
            respuesta+= "R ";
        } 
        // segundo
        if(n2 == aleatorios[0]){
            respuesta += "A ";
        } else if(n2 == aleatorios[1]){
            respuesta += "V ";
        } else if(n2 == aleatorios[2]){
            respuesta += "A ";
        }
        else {
            respuesta+= "R ";
        } 
        // tercero
        if(n3 == aleatorios[0]){
            respuesta += "A ";
        } else if(n3 == aleatorios[1]){
            respuesta += "A ";
        } else if(n3 == aleatorios[2]){
            respuesta += "V ";
        }
        else {
            respuesta+= "R ";
        } 
        return respuesta;
    }
}
