public class Ejercicio116 {
    public static void main(String[] args) {
        int suma=0;
        long multiplicacion=1;
        for(int i=2;i<=1000;i+=2){
                suma+=i;
        }
        for(int f=1; f<=50; f+=2){
            multiplicacion*=f;
        }
        System.out.println("La suma de numeros pares comprendidos entre 1 y 1000\nResultado: "+suma);
        System.out.println("La multiplicación de numeros nones comprendidos entre 1 y 50\nResultado: "+multiplicacion);
    }
}
