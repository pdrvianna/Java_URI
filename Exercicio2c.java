import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){

        Scanner tcl = new Scanner(System.in);

        float base, altura, area;

        //Entrada
        System.out.println("Digite a base do traiangulo");
        base = tcl.nextFloat();
        System.out.println("Digite a altura do triangulo");
        altura = tcl.nextFloat();

        //processamento
        area = base * altura /2;

        //saida
        System.out.println("A area do triângulo é: " + String.format("%.2f",area));




    }
}