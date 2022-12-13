/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment2
*/
import java.util.Scanner;
public class Assignment2C
{
    public static void main (String[] args)
    {
        float M;
        final double C = 0.0000848327;
        final double R = 0.00105745;
        long MC, MR;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a number of miles: ");
        M = scan.nextFloat();
        MR = (long) (M / R);
        MC = (long) (M / C);
        System.out.println("You: I walked " + M + " miles today #fitnessgoals\nUseless Conversion Bot: Wow, " + M + " miles is " + MR + " refrigerators long!\nUseless Conversion Bot: " + M + " miles is also " + MC + " candy bars long!\nnUseless Conversion Bot: That’s a lot.");
    }
}