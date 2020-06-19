import java.util.Scanner;

public class URI1006{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double A, B, C,  media;

        A = entrada.nextFloat();
        B = entrada.nextFloat();
        C = entrada.nextFloat();

        media = (A * 2 + B * 3 + C * 5)/10;

        System.out.printf("MEDIA = %.1f\n",media);


    }
}