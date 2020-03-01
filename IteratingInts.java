public class IteratingInts{
   
       public static void main(String[] args){

/* În metoda main de declarat o variabilă numerică întreagă (num). 
   De parcurs toate valorile de la 0 până la num și de afișat fiecare valoare de numărul de ori, 
   reprezentate de ea însăși. Exemplu: dacă int num = 5, programul afișează 
   1
   22
   333
   4444
   55555 */


   double num = 10;
   
   for(int i = 0; i < num; i++){

      for(int j = 0; j < i; j++){

      System.out.print(i);

           }
      System.out.println();
        } 

    }

}