public class IfElse{
     
       public static void main (String[] args){

/* Avand variabilele int intNumber; byte byteNumber; short shortNumber;
1.Dati-le o anumita valoare
2.Pentru fiecare variabila prin intermediul if-else, afisati la ecran: 
 -daca variabila este pozitiva sau negativa
 -daca este para sau impara
 -daca este un multiplu de-a lui 7 */

       int intNumber = 184;
       byte byteNumber = -23;
       short shortNumber = 49;

       if (intNumber >= 0) {System.out.println("Variabila " + intNumber + " este Pozitiva.");}
       else {System.out.println("Variabila " + intNumber + " este Negativa.");}
       if (intNumber %2 == 0) {System.out.println("Variabila " + intNumber + " este Para.");}
       else {System.out.println("Variabila " + intNumber + " este Impara.");}
       if (intNumber %7 == 0) {System.out.println("Variabila " + intNumber + " este Multiplu al lui 7.");}
       else {System.out.println("Variabila " + intNumber + " Nu este Multiplu al lui 7.");}
   
       if (byteNumber >= 0) {System.out.println("Variabila " + byteNumber + " este Pozitiva.");}
       else {System.out.println("Variabila " + byteNumber + " este Negativa.");}
       if (byteNumber %2 == 0) {System.out.println("Variabila " + byteNumber + " este Para.");}
       else {System.out.println("Variabila " + byteNumber + " este Impara.");}
       if (byteNumber %7 == 0) {System.out.println("Variabila " + byteNumber + " este Multiplu al lui 7.");}
       else {System.out.println("Variabila " + byteNumber + " Nu este Multiplu al lui 7.");}

       if (shortNumber >= 0) {System.out.println("Variabila " + shortNumber + " este Pozitiva.");}
       else {System.out.println("Variabila " + shortNumber + " este Negativa.");}
       if (shortNumber %2 == 0) {System.out.println("Variabila " + shortNumber + " este Para.");}
       else {System.out.println("Variabila " + shortNumber + " este Impara.");}
       if (shortNumber %7 == 0) {System.out.println("Variabila " + shortNumber + " este Multiplu al lui 7.");}
       else {System.out.println("Variabila " + shortNumber + " Nu este Multiplu al lui 7.");}
      }

}