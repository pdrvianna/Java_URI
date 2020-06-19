import java.util.Scanner;

public class URI1005{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double A, B, media;

        A = entrada.nextFloat();
        B = entrada.nextFloat();

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f\n",media);


    }
}
