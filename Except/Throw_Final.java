import java.io.*;
import java.util.*;

class Throw_Final
{

	public static void main(String[] args)
	{
	   AcceptInput accept = new AcceptInput();
      accept.getInput();     

	}
   
}
   
class AcceptInput
{
     Scanner stdin = new Scanner(System.in);
     int input;
     OddNumberException obj =  new OddNumberException();
     
    public void getInput()
    {
     
     try
     {
     System.out.println("Please enter an even integer number : ");
     
     input =  stdin.nextInt();
     
     obj.noOdd(input);
     
     System.out.println(input);
     }
     catch(OddNumberException e)
     {
       System.out.println("No Odd Numbers");
     }
     catch(InputMismatchException ex)
     {
       System.out.println("Inalid Input");
     }
     
     }
     
}

class OddNumberException extends Exception
{
    public void noOdd(int num) throws OddNumberException
    { 
      if(num % 2 != 0)
      {
         OddNumberException on = new OddNumberException();
         throw on;
      }
    }
}
   

