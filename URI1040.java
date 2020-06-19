import java.util.Scanner;

public class URI1040{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

       
       float N1, N2, N3, N4, media, notaexame;

       N1 = entrada.nextFloat();
       N2 = entrada.nextFloat();
       N3 = entrada.nextFloat();
       N4 = entrada.nextFloat();

       media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;

       if (media >= 7.0f){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
       } 
       else {
           if (media < 5f){
                System.out.printf("Media: %.1f\n",media);
                System.out.println("Aluno reprovado.");
           }
           else{
               if (media >= 5.0f && media < 7.0f){
                    System.out.printf("Media: %.1f\n",media);
                    System.out.println("Aluno em exame.");
                    notaexame = entrada.nextFloat();
                    media = (notaexame + media)/2;
                    System.out.printf("Nota do exame: %.1f\n",notaexame);
                    if (media >= 5.0f){
                       
                        System.out.println("Aluno aprovado.");
                        System.out.printf("Media final: %.1f\n", media);
                    }
                    else{
                        
                        System.out.println("Aluno reprovado.");
                        System.out.printf("Media final: .1f\n", media);
                    }
               }
           }
       }



    }
}
