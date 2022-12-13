/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment2
*/
import java.util.Scanner;
public class Assignment2A
{
    public static void main (String[] args)
    {
        float FN, SN, M;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a number you want to find a multiple of: ");
        FN = scan.nextFloat();
        System.out.println ("Enter a second number: ");
        SN = scan.nextFloat();
        System.out.println("Calculating...");
        M = SN - (SN % FN);
        System.out.println("The nearest multiple of " + FN + " from " + SN + " is " + M + "!");
    }
}