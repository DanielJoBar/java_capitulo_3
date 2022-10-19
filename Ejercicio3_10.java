import java.util.Scanner;
public class Ejercicio3_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de Mb que desea convertir a Kb");
        int Mb = sc.nextInt();
        int Kb = Mb*1024;
        System.out.print(Mb+"  Megabyte es  en Kilobytes:"+Kb);
    sc.close();
    }
}
