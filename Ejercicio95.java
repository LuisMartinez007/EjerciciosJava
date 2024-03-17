import java.util.Scanner;

public class Ejercicio95 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de valores para el vector: ");
        int longitud=in.nextInt();
        int vector[]= new int[longitud];
        System.out.println("Digite los valores: ");
        for(int a=0;a<longitud;a++){
            vector[a] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        System.out.println("Vector ordenado de mayor a menor:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
