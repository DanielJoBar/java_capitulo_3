import java.util.Scanner;
public class Ejercicio3_5{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba la altura del rectángulo");
    float altura=sc.nextFloat();
    System.out.println("Escriba la base del rectángulo");
    float base = sc.nextFloat();
    float area = base*altura;
    System.out.print("Un rectángulo de "+altura+"  de altura y con  "+base+"  de base tendrá un área de  "+area+"m^2");
    sc.close();
}}