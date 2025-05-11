//Factorial of a number 

import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        int factorial = 1;
        
        if(number>0)
        {
            for(int i=1; i<=number; i++)
            {
                factorial *= i;
            }
            System.out.println("Factorial of the number is: " + factorial);
        }
        else
        {
            System.out.println("You eneterd a negative number.");
        }
        
        input.close();
    }
}
