import java.util.Scanner;

public class URI1002{
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        double area, n, raio;

        n = 3.14159;
        raio = entrada.nextDouble();

        //processar

        area = n * (raio * raio);

        System.out.printf("A=%.4f\n",area);

    }
}

