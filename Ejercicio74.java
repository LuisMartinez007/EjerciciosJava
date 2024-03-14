import java.util.Scanner;

public class Ejercicio74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1=in.nextInt();
        System.out.print("Digite otro numero: ");
        int n2=in.nextInt();
        System.out.print("Digite otro numero mas: ");
        int n3=in.nextInt();
        in.close();
        numerosDeMayoraMenor(n1, n2, n3);
    }
    public static String numerosDeMayoraMenor(int n1 ,int n2 ,int n3){
        String respuesta="";
        if(n1>n2 && n2>n3 ){
            respuesta=n1+" "+n2+" "+n3;
        }else if(n1>n3 && n3>n2){
            respuesta=n1+" "+n3+" "+n2;
        }else if(n2>n1 && n1>n3){
            respuesta=n2+" "+n1+" "+n3;
        }else if(n2>n3 && n3>n1){
            respuesta=n2+" "+n3+" "+n1;
        }else if(n3>n1 && n1>n2){
            respuesta=n3+" "+n1+" "+n2;
        }else{
            respuesta=n3+" "+n2+" "+n1;
        }
        System.out.println(respuesta);
        return respuesta;
    }
}
