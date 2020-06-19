import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        float altura, base, area;

        //Entrada
        System.out.println("Digite a altura do triangulo");
        altura = teclado.nextFloat();
        System.out.println("Digite a base do triangulo");
        base = teclado.nextFloat();

        //processamento
        area = base * altura;

        //saida
        System.out.println("A area do triangulo é: "+area);

    }


}