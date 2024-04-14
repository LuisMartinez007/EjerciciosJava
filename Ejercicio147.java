import java.util.*;

public class Ejercicio147 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alumnos = 5,aprobaronTodos = 0,aprobaronAlMenosUno = 0,aprobaronSoloUltimo = 0,contadorAprobados = 0;
        for (int i = 1; i <= alumnos; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la calificación del examen " + (j + 1) + " para el alumno " + i + ": ");
                int calificacion = in.nextInt();
                if (calificacion >= 3 ) {
                    contadorAprobados++;
                }
            }
            if (contadorAprobados == 3) {
                aprobaronTodos++;
            }
            if (contadorAprobados > 0) {
                aprobaronAlMenosUno++;
            }
            if (contadorAprobados == 1) {
                aprobaronSoloUltimo++;
            }
        }
        System.out.println("Alumnos que aprobaron todos los exámenes: " + aprobaronTodos);
        System.out.println("Alumnos que aprobaron al menos un examen: " + aprobaronAlMenosUno);
        System.out.println("Alumnos que aprobaron únicamente el último examen: " + aprobaronSoloUltimo);
        in.close();
    }
}
