import java.util.Scanner;
public class Ejercicio3_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota del primer examen: ");
        float not1 = sc.nextFloat();
        System.out.print("Introcduzca la nota deseada del segundo examen: ");
        float notDes = sc.nextFloat();
        double not2 = (notDes-(not1*0.4))/0.6;
        System.out.printf("La nota necesaria en el segundo examen seria  %.2f\n :",not2);
    sc.close();
    }
}
