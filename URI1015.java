public static void main(String[] args) {
	
    Scanner entrada = new Scanner(System.in);
    
     int x=0,y=0,cont;
     
     x = entrada.nextInt();
     y = entrada.nextInt();

     do {
         if (x > 0 && Y >0){
             System.out.println("primero");
         } else if (x<0 && y >0){
            System.out.println("segundo");   
         } else if (x<0 && y<0){
            System.out.println("terceiro");
         }else if (x>0 && y<0) {
            System.out.println("quarto");
         }
     } while (x==0 || y==0);