/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment4
*/
import java.util.Scanner;
public class Assignment4A
{
    public static void main (String[] args)
    {
        int n, l;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Times Table Generator]");
        System.out.println ("Enter your start number: ");
        n = Integer.parseInt(scan.nextLine());
        while (n <= 0) {
            System.out.println("Input must be positive! Try again.\nEnter your start number: ");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.println ("Enter the limit you want to multiply to: ");
        l = Integer.parseInt(scan.nextLine());
        while (l <= 0) {
            System.out.println("Input must be positive! Try again.\nEnter the limit you want to multiply to: ");
            l = Integer.parseInt(scan.nextLine());
        }
        for (int i = 1; i <= l; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}