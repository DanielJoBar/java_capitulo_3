import java.util.Scanner;
public class Ejercicio3_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de Kb que desea convertir a Mb");
        int Kb = sc.nextInt();
        float Mb = Kb/1024;
        System.out.print(Kb+"  Kb en Mb son:"+Mb);
    sc.close();
    }
}
