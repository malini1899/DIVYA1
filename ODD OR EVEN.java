import java.util.*;
import java.lang.*;
import java.io.*;
class OddOrEven
{
   public static void main(String args[])
   {
      int x;
     
      Scanner in= new Scanner(System.in);
      x = in.nextInt();
     
      if (x %2== 0)
        { 
         System.out.println("Even");
         
        }
        else if(x%2<0)
        {
        	System.out.println("invalid");
        }
      else
         {
         	System.out.println("Odd");
         }
   }
}
