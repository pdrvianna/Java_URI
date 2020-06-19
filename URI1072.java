import java.util.Scanner;
public class URI1072 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int N, x, in=0, out=0, X=0;

          N = entrada.nextInt();

          for (x=1; x<=N ; x++){
            X = entrada.nextInt();
                if (X >=10 && X <= 20){
                    in++;
                }
                else {
                    out++;
                }
          }
          System.out.println(in+" in");
          System.out.println(out+" out");


    }
}
