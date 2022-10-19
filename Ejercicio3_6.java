import java.util.Scanner;
public class Ejercicio3_6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba la altura del triángulo");
    float altura=sc.nextFloat();
    System.out.println("Escriba un lado  del triángulo");
    float lado = sc.nextFloat();
    float area = lado*altura;
    System.out.print("Un triángulo de "+altura+"  de altura y con  "+lado+"  de lado,suponiendo que sea equilátero, tendrá un área de  "+area+"m^2");
    sc.close();
}}