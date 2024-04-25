import java.util.Scanner;

public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la nota del examen de matematicas: ");
        double examenMath=in.nextDouble();
        double totalMath=0;
        for(int i=1;i<=3;i++){
            System.out.print("Digite la nota de la tarea #"+i+" de matematicas: ");
            double nota=in.nextDouble();
            totalMath+=nota;
        }

        System.out.print("Digite la nota del examen de fisica: ");
        double examenFisica=in.nextDouble();
        double totalFisica=0;
        for(int i=1;i<=2;i++){
            System.out.print("Digite la nota de la tarea #"+i+" de fisica: ");
            double nota=in.nextDouble();
            totalFisica+=nota;
        }

        System.out.print("Digite la nota del examen de quimica: ");
        double examenQuimica=in.nextDouble();
        double totalQuimica=0;
        for(int i=1;i<=3;i++){
            System.out.print("Digite la nota de la tarea #"+i+" de quimica: ");
            double nota=in.nextDouble();
            totalQuimica+=nota;
        }
        in.close();
        double notaMath=examenMath*0.9+(totalMath/3)*0.1;
        System.out.println("Matematica: "+notaMath);
        double notaFisica=examenFisica*0.8+(totalFisica/2)*0.2;
        System.out.println("Fisica: "+notaFisica);
        double notaQuimica=examenQuimica*0.85+(totalQuimica/3)*0.15;
        System.out.println("Quimica: "+notaQuimica);
        double promedioNotas=(notaFisica+notaMath+notaQuimica)/3;
        System.out.println("Promedio: "+promedioNotas);
    }
}
