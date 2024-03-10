public class Ejercicio49 {
    public static void main(String[] args) {
        String nombre = "Luis Martinez";
        char primeraLetra = obtenerPrimeraLetra(nombre);
        System.out.println("La primera letra es: " + primeraLetra);
    }
    public static char obtenerPrimeraLetra(String texto) {
        return texto.charAt(0);
    }
}
