import java.util.Scanner;
public class Exercicio5{
    public static void main(String args[]) {

        Scanner tcl = new Scanner(System.in);

        float tempogasto, velocidademedia, distancia, litros;

        System.out.println("Qual tempo da viagem");
        tempogasto = tcl.nextFloat();
        System.out.println("Qual Velocidade media");
        velocidademedia = tcl.nextFloat();

            //processa
            distancia = tempogasto * velocidademedia;
            litros = distancia / 12;


           // System.out.printf("Litros de combustivel gastos: %.3f\n Em uma distacia de: %.3f\n E gastou o tempo de: %.3f"
           // ,litros,distancia,tempogasto);

            System.out.printf(" Voce percorreu %.3f km \n A uma velocidade de %.3f KM/h \n e consumiu %.3f litros\n",distancia,velocidademedia, litros);
    }
}
