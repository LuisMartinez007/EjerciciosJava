public class Ejercicio90 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] vector = {10, 11, 12, 13, 14, 15};
        int contadorMatriz = 0,contadorVector = 0;
        System.out.println("     MATRIZ      ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if(esPrimo(matriz[i][j])){
                    contadorMatriz++;
                }
            }
            System.out.println("");
        }
        System.out.println("    VECTOR    ");
        for(int l=0;l<vector.length;l++){
            System.out.print(vector[l]+" ");
            if(esPrimo(vector[l])){
                contadorVector++;
            }
        }
        System.out.println("\n");
        System.out.println("Cantidad de números primos en la matriz: " + contadorMatriz);
        System.out.println("Cantidad de números primos en el vector: " + contadorVector);
    }
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}