import java.util.Scanner;

public class URI1007{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        //processar
        diferenca = A * B - C * D;

        System.out.println("DIFERENCA = "+diferenca);
    }
}
