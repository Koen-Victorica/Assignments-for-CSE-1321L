/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment2
*/
import java.util.Scanner;
public class Assignment2B
{
    public static void main (String[] args)
    {
        float POS, PP, PA, HOS, HP, HA;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Pentagon Calculator]\nEnter the length of one side: ");
        POS = scan.nextFloat();
        PP = 5 * POS;
        PA = (float)(Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * POS * POS) / 4;
        System.out.println("Pentagon Perimeter = " + PP + "\nPentagon Area = " + PA + "\n\n[Hexagon Calculator]\nEnter the length of one side: ");
        HOS = scan.nextFloat();
        HP = 6 * HOS;
        HA = 6 * (float)(Math.sqrt(3) / 4) * (HOS * HOS);
        System.out.println("Hexagon Perimeter = " + HP + "\nHexagon Area = " + HA);
    }
}