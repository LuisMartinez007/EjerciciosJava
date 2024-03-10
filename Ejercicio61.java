public class Ejercicio61 {
    public static void main(String[] args) {
        int n[]= new int[10];
        int contador=1,acumulador=0;
        for(int i=0;i<10;i++){
            n[i]= contador;
            int potencia =n[i]*n[i];
            acumulador+=potencia;
            contador++;
        }
        System.out.println("La suma de los cuadrados del 1 al 10 = "+acumulador);
    }
}
