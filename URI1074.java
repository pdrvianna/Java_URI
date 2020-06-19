import java.util.Scanner;
public class URI1074 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int N, cont, qdo;

          N = entrada.nextInt();
          for (cont=1; cont <= N; cont++){
              if (cont % 2 == 0){
                  qdo = cont * cont;
                  System.out.println(cont+"^2 = "+qdo);
              }
          }
    }
}