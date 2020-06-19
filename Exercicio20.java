import java.util.Scanner;

public class Exercicio20{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

       int sexo;
       float calculo, altura;

       System.out.println("Didite a altura");
       altura = entrada.nextFloat();
       System.out.println("Didite o Sexo (0-Masculino/1-Feminino)");
       sexo = entrada.nextInt();
       if ( sexo == 0) {
        calculo = (72.7f * altura) - 58f;
       }
       else {
        calculo = (62.1f * altura) - 44.7f;
       }

       System.out.println("O seu peso ideal e:" + calculo);
    }
}
