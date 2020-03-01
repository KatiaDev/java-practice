public class MultiplicativeTable{
   
       public static void main(String[] args){

/* În metoda main de scris cod care afișează tabelul multiplicării unui număr întreg n, 
   unde n este o variabilă declarată și inițializată în metoda main.
   Exemplu: int n = 5
            5 x 0 = 0;
            5 x 1 = 5;
            pană la 'x 10' */


   int n = 9, M = 0;
 
   for(int i = 0; i <= 10; i++){
   
       M = n * i;
       System.out.println(n + "*" + i + "=" + M);
     
     }


  }
}