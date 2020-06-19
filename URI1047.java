import java.util.Scanner;
public class URI1047 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int horaini, horafinal, minini, minfinal, duracaoini=0, duracaofinal=0,duracao=0;
          int rest,tempoh=0,tempmim=0;

          horaini = entrada.nextInt();
          minini = entrada.nextInt();
          horafinal = entrada.nextInt();
          minfinal = entrada.nextInt();

          duracaoini=horaini*60+minini;  
          duracaofinal = horafinal*60+minfinal; 
  
          if (duracaoini < duracaofinal){
            duracao = duracaofinal - duracaoini;
            tempoh = duracao / 60;
            tempmim = duracao % 60;  
            }
            else if (duracaoini > duracaofinal) {
                duracao = (1440 - duracaoini) + duracaofinal;
                tempoh = duracao / 60;
                tempmim = duracao % 60;  
            }
            else if (duracaoini == duracaofinal){
                duracao = 1440;
                tempoh = duracao / 60;
                tempmim = duracao % 60;
            }

            System.out.println("O JOGO DUROU "+tempoh+" HORA(S) E "+tempmim+" MINUTO(S)");
    }
}
