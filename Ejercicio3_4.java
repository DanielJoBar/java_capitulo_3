import java.util.Scanner;
public class Ejercicio3_4{
    public static void main(System[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el primer número:  ");
    double n1 = sc.nextDouble();
    System.out.println("Introduzca el segundo número:  ");
    double n2 = sc.nextDouble();
    System.out.printf("x = %.f\n",n1);
    System.out.printf("x = %.f\n",n2);
    System.out.printf("x + y= %.f\n",(n1+n2));
    System.out.printf("x - y = %.f\n",(n1-n2));
    System.out.printf("x * y = %.f\n",(n1*n2));
    System.out.printf("x / y = %.f\n",(n1/n2));
    sc.close();
}

}