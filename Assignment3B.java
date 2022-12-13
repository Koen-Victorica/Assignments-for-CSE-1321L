/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment3
*/
import java.util.Scanner;
public class Assignment3B
{
    public static void main (String[] args)
    {
        char day, time;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Instructor Scheduler]\nWhat day of the week is it? ");
        day = scan.nextLine().charAt(0);
        System.out.println ("What time of day? ");
        time = scan.nextLine().charAt(0);
        switch (day + "|" + time){
            case "M|a":
                System.out.println("On Monday Morning, you’ll be teaching C++, section E04!");
                break;
            case "M|p":
                System.out.println("On Monday Afternoon, you’ll be teaching Java, section J02!");
                break;
            case "T|a":
                System.out.println("On Tuesday Morning, you’ll be holding office hours!");
                break;
            case "T|p":
                System.out.println("On Tuesday Afternoon, you’ll be teaching C#, section W#1!");
                break;
            case "W|a":
                System.out.println("On Wednesday Morning, you’ll be teaching C#, section #02!");
                break;
            case "W|p":
                System.out.println("On Wednesday Afternoon, you’ll have some free time!");
                break;
            case "R|a":
                System.out.println("On Thursday Morning, you’ll be holding office hours!");
                break;
            case "R|p":
                System.out.println("On Thursday Afternoon, you’ll be teaching C++, section WE3!");
                break;
            case "F|a":
                System.out.println("On Friday Morning, you’ll be teaching Java, section WJ3!");
                break;
            case "F|p":
                System.out.println("On Friday Afternoon, you’ll have some free time!");
                break;
            default:
                System.out.println("That’s not a valid day or time!!");
                break;
        }
    }
}