import java.util.Scanner;
public class URI1145 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int x,y,cont,contador=0;
       

          x = entrada.nextInt();
          y = entrada.nextInt();

        
          for (cont=1;cont<=y;cont++){
              if (contador<x){
                System.out.print(cont+" ");
                contador++;
              }
              else{
                   System.out.println();
                   System.out.print(cont+" ");
                  contador = 1;
              }
           }
           
    }
}
