public class Ejercicio144 {
    public static void main(String[] args) {
        int suma=0;
        long multiplicacion=1;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                suma+=i;
            }else{
                multiplicacion*=i;
            }
        }
        System.out.println("Suma de los números pares entre 1 y 100: "+suma);
        System.out.println("Multiplicación de los números impares entre 1 y 100: "+multiplicacion);
    }
}
