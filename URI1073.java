import java.util.Scanner;
public class URI1073 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int N, cont, x=0;

            N = entrada.nextInt();
          for (cont=0 ; cont <N; cont++){
            x = entrada.nextInt();
              if (x==0){
                    System.out.println("NULL");
               } 
               if (x>0 && x%2==0){
                   System.out.println("EVEN POSITIVE");
               }
               else if (x<0 && x%2==0) {
                  System.out.println("EVEN NEGATIVE");
               } 
               else if (x>0 && x%2!=0) {
                System.out.println("ODD POSITIVE");
               }
               else if (x<0 && x%2!=0){
                System.out.println("ODD NEGATIVE");
               }
            }

    }
}
