public class Ejercicio223{
    public static void main(String[] args) {
        System.out.println("Multiplos de 2");
        for(int i=1;i<=100;i++){
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("\nMultiplos de 3");
        for(int i=1;i<=100;i++){
            if (i%3==0) {
                System.out.print(i+" ");
            }
        }
    }
}