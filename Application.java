/**
 * Created by Kobe J. Gary on 7/3/2017.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Application
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    int number = 0; // Take var number and enter it into Armstrong Code on line 37 and set it equal to n
    boolean theNumber;

    do
    {   // Have user enter a whole number
        System.out.println("Enter a whole number: ");
        if(input.hasNextInt())
        {
            number = input.nextInt();
            theNumber = true;
        }
        else
        {   // Tell user they have entered the wrong value
            System.out.println("This is not a whole number!");
            theNumber = false;
            input.next();
        }

    }
      while(!(theNumber));
        System.out.println(number);
       // end of validation code

        // Beginning of Armstrong code
       int c = 0,a,temp;
       int n = number;
       temp = n;

       while(n>0)
       {
           a = n% 10;
           n = n/10;
           c=c+(a*a*a);
       }
       if(temp==c)
           System.out.println("True, armstrong number");
       else
           System.out.println("False, Not armstrong number");

    }



}