/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment1
*/
import java.util.Scanner;
public class Assignment1A
{
    public static void main (String[] args)
    {
        float firstterm, secondterm, thirdterm, fourthterm;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Math Mad Libs]\n\nx + (y/z) * w = ?\nEnter the first term: \n");
        firstterm = scan.nextFloat();
        System.out.println (firstterm + " + (y/z) * w = ?\nEnter the second term: \n");
        secondterm = scan.nextFloat();
        System.out.println (firstterm + " + (" + secondterm + "/z) * w = ?\nEnter the third term: \n");
        thirdterm = scan.nextFloat();
        System.out.println (firstterm + " + (" + secondterm + "/" + thirdterm + ") * w = ?\nEnter the fourth term: \n");
        fourthterm = scan.nextFloat();
        float sum = firstterm + (secondterm / thirdterm) * fourthterm;
        System.out.println (firstterm + " + (" + secondterm + "/" + thirdterm + ") * " + fourthterm + " = " + sum);
    }
}