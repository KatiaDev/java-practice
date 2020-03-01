public class UsingTernaryOp{
   
       public static void main(String[] args){

/* În metoda main de declarat o variabilă numerică zecimală (num). 
   De declarat o variabilă message, de tip String. Conținutul message va depinde de valoarea 
   variabilei num:
   'Small' dacă num <= 0
   'Large' dacă num >= 1000000
*/

   double num = 20000;
   String message; 
 
   message = num >= 1000000 ? "Large": "Small";
   
   System.out.println(message);


  }
}