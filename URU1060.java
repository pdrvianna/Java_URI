import java.util.Scanner;

public class URU1060{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

       
       int cont , positivos;
       float num;
       positivos = 0;

       for (cont = 0; cont <= 5 ; cont++){
            num = entrada.nextFloat();
            if (num > 0) {
                positivos = positivos + 1;
            }
       }
       System.out.println(positivos + " valores positivos");
    }
}

        