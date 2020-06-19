import java.util.Scanner;
public class URI1134 {
    public static void main(String[] args) {
	
        Scanner entrada = new Scanner(System.in);
        
        int tipo,alcool=0, gas=0, diesel=0;

        do {
             tipo = entrada.nextInt();
             switch (tipo){
                 case 1:
                    alcool++;
                    break;
                 case 2:
                    gas++;
                    break;
                 case 3:
                    diesel++;
                    break;
                }
            }while (tipo != 4);

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: "+alcool);
            System.out.println("Gasolina: "+gas);
            System.out.println("Diesel: "+diesel);
        


    }
}
