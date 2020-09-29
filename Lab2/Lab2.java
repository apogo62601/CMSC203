package Lab2;

import java.util.Scanner;
public class Lab2 {
    
    public static void main(String []args)
    {
        
        Scanner stdin = new Scanner (System.in);
        
        final double NUMBER = 2.0;
        final int BOILING_IN_F = 212;
        double tempInFar, fToC, average;
        //double fToC;
        //double average;
        String output;
 
        int score1, score2;
        System.out.println ("Enter the first score: ");
        score1 = stdin.nextInt();
        
        System.out.println ("Enter the second score: ");
        score2= stdin.nextInt();
        
        average = (score1 + score2) / NUMBER;
        output = score1 + " and " + score2 + " have an average of " + average;
        System.out.println (output);
        
        fToC = (5.0 / 9) * (BOILING_IN_F - 32);
        output = BOILING_IN_F + " in farenheit is " + fToC + " in Celsius.";
        System.out.println(output);
        
        System.out.println("Enter a temperature in farenheit to convert into Celsius score: ");
        tempInFar = stdin.nextInt();
        
        stdin.close();
        
        fToC = (5.0 / 9) * (tempInFar - 32);
        System.out.println("Your temerature is " + fToC + " in Celsius.");
        System.out.println("Goodbye :)");
        
    }
}

