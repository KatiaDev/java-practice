public class SelectiveIteration{
   
       public static void main(String[] args){

/* În metoda main de declarat o variabilă (num) de tip număr întreg > 1000 și < 2000.
   De parcurs și de afișat numerele de la 0 la num, în afară de:
   numere divizibile la 3
   numere care adunate cu 5 sunt divizibile la 7
   numere, ce se termină cu 0 */


   int num = 1024;
   
   for(int i = 0; i < num; i++){

      if ((i %3 == 0) || ((i + 5)%7 == 0) || (i %10 == 0)){
            continue;
           }
      System.out.println(i);
        } 

    }

}