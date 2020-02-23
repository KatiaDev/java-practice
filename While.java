public class While{
   
       public static void main(String[] args){

/* 1.Afisati la ecran primele 100 de numere
   2.Afisati la ecran primele 50 de numere pare
   3.Afisati la ecran primele 50 de numere impare */

       int intNumber = 1;
       System.out.println("Primele 100 de numere:");
       while(intNumber <= 100){
             System.out.println(intNumber);
             intNumber++;
            }
        
        short shortNumber = 1;
        System.out.println("Primele 50 de numere Pare:");
        while(shortNumber <= 50){  
             if (shortNumber %2 == 0) System.out.println(shortNumber);
             shortNumber++;
            }

        byte byteNumber = 1;
        System.out.println("Primele 50 de numere Impare:");
        while(byteNumber <= 50){
             if (byteNumber %2 != 0) System.out.println(byteNumber);
             byteNumber++;
              
            }

      }

}