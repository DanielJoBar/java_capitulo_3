import java.util.Scanner;
public class Ejercicio3_3{
    public static void main(String[] args){
    //Se usa la variable float asumiendo que se pueden tener 1.5 euros 
    double euros ;
    float pesetas;
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba cuantas pesetas quiere convertir : ");
    pesetas = sc.nextFloat();
    euros =  pesetas/166.386 ;
    System.out.print(pesetas+"pesetas en euros serian : "+(euros)+"   ");
    sc.close();
    }
}

