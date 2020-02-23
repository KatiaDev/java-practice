public class App{
     
       public static void main (String[] args){

// Convertirea si afisarea Variabilelor: short -> byte; int -> short; long -> int; double -> long;

       short mbInKb = 1024;
       int facebookFriends = 150000;
       long starsInUniverse = 15555555555555555L;
       double normalTemp = 36.6;

       byte byteFromShort = (byte)mbInKb;
       short shortFromInt = (short)facebookFriends;
       int intFromLong = (int)starsInUniverse;
       long longFromDouble = (long)normalTemp;

       System.out.println(byteFromShort);
       System.out.println(shortFromInt);
       System.out.println(intFromLong);
       System.out.println(longFromDouble);
        
      }

}