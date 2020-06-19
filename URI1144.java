import java.util.Scanner;
public class URI1144 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int N, cont, s, s1,s2;
          N = entrada.nextInt();

          for (cont=1;cont<=N;cont++){
              s = cont;
              s1 = cont*cont;
              s2 = cont*s1;
              System.out.println(s+" "+s1+" "+s2);
              System.out.println(s+" "+(s1+1)+" "+(s2+1));

          }
    }
}