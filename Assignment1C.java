/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment1
*/
import java.util.Scanner;
public class Assignment1C
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String lastname;
        short wholenumber;
        System.out.println ("[KSU NetID Generator]\nEnter the first letter of your first name: ");
        char firstletter = scan.next().charAt(0);
        String burn = scan.nextLine();
        System.out.println ("Enter your last name: ");
        lastname = scan.nextLine();
        System.out.println ("Enter a valid whole number: ");
        wholenumber = scan.nextShort();
        String netid = firstletter + lastname + wholenumber;
        System.out.println ("Your KSU NetID is " + netid + ". You can log into KSU computers with this NetID as your username and your email password as the password.\nYour email address is " + netid + "@student.kennesaw.edu.");
    }
}