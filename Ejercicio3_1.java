import java.util.Scanner;
public class Ejercicio3_1{
    public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba dos números que desea multiplicar:  ");
    float n1 = sc.nextFloat();
    float n2 = sc.nextFloat();
    float suma = (n1*n2);
    Math.round(suma);
    System.out.println("El resultado de la multiplicación es :  "+suma);
    sc.close();
    }
}
