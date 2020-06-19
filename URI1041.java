import java.util.Scanner;

public class URI1041{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

       
       float X, Y;

        X = entrada.nextFloat();
        Y = entrada.nextFloat();

         if (X > 0f && Y > 0f ){ 
            System.out.println("Q1");
         }
         else {
             if ( X > 0f && Y < 0f){
                System.out.println("Q4");
             }
             else{
                 if (X < 0f && Y < 0f) {
                    System.out.println("Q3");
                 }
                 else 
                 if (X < 0f && Y > 0f){
                    System.out.println("Q2");
                 }
                 else {
                     if (X == 0f && Y != 0f){
                        System.out.println("Eixo Y");
                     }
                     else {
                         if (Y == 0f && X != 0f){
                            System.out.println("Eixo X");
                         }
                         else {
                             if (Y == 0f && X == 0f){
                                System.out.println("Origem");
                             }
                         }
                     }
                 }
             }
         }


    }
}
