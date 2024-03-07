import java.util.Scanner;
public class Ejercicio33 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digte la cantidad de empleados que desea registrar: ");
        int n = in.nextInt();
        int gen = 0, totalSalarios=0, mujeres=0, hombres=0, salarioMayorA700 = 0;
        int salario[] = new int[n];
        for(int i=0 ; i<n; i++){
            do{
            System.out.println("\n          Opciones    \n1. Masculino    2. Femenino");
            System.out.print("Digite un numero de acuerdo al genero para empleado #"+(i+1)+": ");
            gen = in.nextInt();
            if (gen ==1 ) {
                hombres++;
            } else {
                mujeres++;
            }
            }while(gen<=0 || gen>2);
            System.out.print("Digite el salario de empleado #"+(i+1)+": ");
            salario[i] = in.nextInt();
            if(salario[i]>700){
                salarioMayorA700++;
            }
            
            totalSalarios = totalSalarios + salario[i];
        }
        double promSalarios = totalSalarios/n;
        double porcMujeres= (mujeres*100)/n;
        double porcHombres = (hombres*100)/n;
        System.out.println("             -Datos recopilados-\n");
        System.out.println("Personas que ganan mas de 700 al mes: "+salarioMayorA700);
        System.out.println("Promedio de salarios: "+promSalarios);
        System.out.println("Porcentaje de mujeres que trabajan en la empresa: "+porcMujeres+"%");
        System.out.println("Porcentaje de varones que trabajan en la empresa: "+porcHombres+"%");
    }
}
