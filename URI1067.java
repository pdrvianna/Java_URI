import java.util.Scanner;

public class URI1067{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

       
       int x=0 , pares=0, impares=0, cont;
       x = entrada.nextInt();

       for (cont=1 ; cont <= x ; cont++){
            if (cont % 2 != 0){
                System.out.println(cont);
            }

       }
 
    }
}
