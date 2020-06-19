import java.util.Scanner;

public class URI1059{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

       
       int cont, pares;
       pares = 0;
        
        for ( cont = 1; cont <=100; cont++){

            if (cont %2 ==0){
                pares = pares +1;
                System.out.println(cont);
            }

        }

    }
}
