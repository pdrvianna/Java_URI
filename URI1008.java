import java.util.Scanner;

public class URI1008{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int id, horastrabalhas;
        float valorhora, salario;

        id = entrada.nextInt();
        horastrabalhas = entrada.nextInt();
        valorhora = entrada.nextFloat();
       
        salario = valorhora * (float)horastrabalhas;

        System.out.println("NUMBER = "+id);
        System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}
