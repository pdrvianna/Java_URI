import java.util.Scanner;
public class Exercicio3{
    public static void main(String args[]) {

        Scanner tcl = new Scanner(System.in);

        float salarioMinimo, Kw, Valorkw, Custo, Desconto;

        System.out.println("Digite o Salario minimo");
        salarioMinimo = tcl.nextFloat();
        System.out.println("Digite a Quantidade de KW");
        Kw = tcl.nextFloat();

            //processamento
                Valorkw = salarioMinimo / 7 / 100;
                Custo = Valorkw * Kw;
                Desconto = Custo - (Custo * 0.1f);

        

        //saida
        System.out.printf("Valor em reais KW %.2f\n", Valorkw);
        System.out.printf("Valor a ser pago %.2f\n", Custo);
        System.out.printf("Novo valor com 10%% desconto %.2f\n", Desconto);

       


        System.out.printf("Valor em reais KW %.2f\n", Valorkw);
    }
}