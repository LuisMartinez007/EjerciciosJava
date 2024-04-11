public class Ejercicio115 {
    public static void main(String[] args) {
        int suma=0;
        for(int i=1;i<=1000;i++){
            if(i%2==0){
                suma+=i;
            }
        }
        System.out.println("La suma de numeros pares comprendidos entre 1 y 1000\nSuma: "+suma);
    }
}
