public class Ejercicio79 {
    public static void main(String[] args) {
        int voltaje = 120; 
        int bombillos = 3;
        double kilovoltios = (voltaje * bombillos) / 1000.0;
        System.out.println("El voltaje total de los " + bombillos + " bombillos es: " + kilovoltios + " kilovoltios.");
    }
}
