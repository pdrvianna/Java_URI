import java.util.Scanner;
public class URI1114 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int senha, leitura;
          senha = 2002;
          
          do{
              leitura = entrada.nextInt();
              if ( senha == leitura){
                  System.out.println("Acesso Permitido");
              }
              else {
                  System.out.println("Senha Invalida");
              }
            }while (leitura != senha);
    }
}     
