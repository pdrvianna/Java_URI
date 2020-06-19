import java.util.Scanner;

public class URI1018A{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();

        Int milhar, centena, unidades, resto;

        milhar = valor / 1000;
        resto = milhar % 1000;
        centena = resto / 100;
        resto = centena % 100;
        dezena = resto / 10;
        resto = dezena % 10;
        unidades = resto;

        System.out.println("Milhar:"+milhar);
        System.out.println("centena:"+centena);
        System.out.println("dezena:"+dezena);
        System.out.println("Unidade:"+unidades);



    }
}