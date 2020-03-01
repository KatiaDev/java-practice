public class DoWhileAdd{
   
       public static void main(String[] args){

/* În metoda main de scris cod care permite calcularea sumei primelor n numere întregi, 
   unde n este o variabilă declarată și inițializată în metoda main.
   De utilizat Do while */


   int N = 25;
   int i = 0, S = 0;

   do{
   
   i++;
   System.out.println(" i = " + i);
   S += i;

   } while(i < N);

   System.out.println(" Suma primelor 25 numere naturale = " + S);
   
  }
}