import java.util.Scanner;

public class URI1064{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

       
       int cont , positivos=0;
       float num=0, soma=0;
     
       
       

       for (cont = 0; cont <= 5 ; cont++){
            num = entrada.nextFloat();
            if (num > 0) {
                positivos = positivos + 1;
                soma = soma + num;
                ;
            }
       }
       soma = soma / positivos;
       System.out.println(positivos + " valores positivos");
       System.out.printf("%.1f\n",soma);
    }
}
