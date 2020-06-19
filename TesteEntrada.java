import java.util.Scanner;  // preciso usar a biblioteca Scanner

public class TesteEntrada {
    public static void main(String arg[]){

    Scanner teclado = new Scanner(System.in);
   
    int a,b,c;

    a = 10;
    b = 15;
    

    System.out.println("Digite os valodes de A e B");
    a = teclado.nextInt();
    b = teclado.nextInt();

    c = a + b;

    System.out.println("Valor de a = " + a);
    System.out.println("Valor de b = " + b);
    System.out.println("Valor de c = " + c);

    System.out.println("Agora digite o valor de d:");
    double d = teclado.nextDouble();
    System.out.println("Valor de d = " + d);
    }

}