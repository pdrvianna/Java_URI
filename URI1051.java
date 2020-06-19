import java.util.Scanner;

public class URI1051{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
       
       float sal, imposto;

       sal = entrada.nextFloat();

        if (sal <= 2000) {
            System.out.println("Isento");
        }
        else{
            if (sal > 2000 && sal <=3000){
                imposto = (sal-2000) * 0.08f;
                System.out.printf("R$ %.2f\n",imposto);
            }
            else {
                if (sal > 3000 && sal <= 4500){
                    imposto = 80 + ((sal-3000) * 0.18f);
                    System.out.printf("R$ %.2f\n",imposto);
                }
                else {
                    if (sal > 4500){
                        imposto = 80f + 270f + (sal-4500f) * 0.28f;
                        System.out.printf("R$ %.2f\n",imposto);
                    }
                }
            }
        }

      
    }
}