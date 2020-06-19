import java.util.Scanner;

public class URI1038{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

       int cod, qtd;
       float valor;

       cod = entrada.nextInt();
       qtd = entrada.nextInt();

       if (cod == 1){
        valor = qtd * 4f;
        System.out.printf("Total: R$ %.2f\n",valor);
       }
       else{
           if (cod==2){
            valor = qtd * 4.5f;
            System.out.printf("Total: R$ %.2f\n",valor);
           }
           else{
               if (cod == 3){
                valor = qtd * 5f;
                System.out.printf("Total: R$ %.2f\n",valor);
               }
               else{
                   if (cod == 4){
                    valor = qtd * 2f;
                    System.out.printf("Total: R$ %.2f\n",valor);
                   }
                   else{
                       if (cod == 5){
                        valor = qtd * 1.5f;
                        System.out.printf("Total: R$ %.2f\n",valor);
                       }
                   }
               }
           }
       }
    }
}