import java.util.Scanner;
public class Exercicio2d{
    public static void main(String args[]) {

        Scanner tcl = new Scanner(System.in);

        float diagonal1, diagonal2, area;

        System.out.println("Digite a diagonal1");
        diagonal1 = tcl.nextFloat();
        System.out.println("Digite a diagonal2");
        diagonal2 = tcl.nextFloat();

        area = diagonal1 * diagonal2;

        System.out.println("A area do losangulo: "+String.format("%.2f",area));




        
    }
}