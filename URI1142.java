import java.util.Scanner;
public class URI1142 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int N, cont, conta, s,s1,s2;

            N = entrada.nextInt();
            s = 1;
          for (cont=1 ; cont <=N; cont++){
                s1 = s +1;
                s2 = s +2;
               System.out.println(s +" "+ s1+" "+s2+" PUM");
              s = s +4;  
            }

    }
}
