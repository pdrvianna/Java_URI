import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

       
       int cont , positivos=0, pares=0, impares=0, negativos=0;
       int num=0;
 
       for (cont = 0; cont <= 4 ; cont++){
            num = entrada.nextInt();
            if (num > 0) {
                positivos++;
            }
            else if (num < 0) {
                negativos++;
                }

            if (num % 2 == 0){
                pares++;
            }
            else {
                impares++;
            }
        }   
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}
