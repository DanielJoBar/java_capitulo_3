import java.util.Scanner;
public class Ejercicio3_9 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, introduzca la altura del cono:  ");
    double altura = sc.nextDouble();
    System.out.println("Introduzca el radio de la base del cono: ");
    double radio = sc.nextDouble();
    double volumen = (Math.PI *(radio*radio)*altura)/3;
    System.out.printf("El volumen del cono es de %.f:  ", volumen);
    sc.close();
}
}