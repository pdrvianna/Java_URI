import java.util.Scanner;
public class Exercicio4{
    public static void main(String args[]) {

        Scanner tcl = new Scanner(System.in);

        float Valorhoras, Qtdhoras, desconto, valor, valordesc;

        System.out.println("Digite o valor da hora");
        Valorhoras = tcl.nextFloat();
        System.out.println("Digite a quantidade de horas");
        Qtdhoras = tcl.nextFloat();
        System.out.println("Digite o % desconto");
        desconto = tcl.nextFloat();

        //processar
        valor = (Valorhoras * Qtdhoras);
        valordesc = valor - (valor * desconto / 100);

        System.out.printf("Salario liquido: %.2f\n", valordesc);



    }
}