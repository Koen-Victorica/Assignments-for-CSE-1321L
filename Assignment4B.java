/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment4
*/
import java.util.Scanner;
public class Assignment4B
{
    public static void main (String[] args)
    {
        int w, h;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the checkerboard’s width: ");
        w = Integer.parseInt(scan.nextLine());
        while (w <= 0) {
            System.out.println("Please enter a valid width!\nEnter the checkerboard’s width: ");
            w = Integer.parseInt(scan.nextLine());
        }
        System.out.println ("Enter the checkerboard’s height: ");
        h = Integer.parseInt(scan.nextLine());
        while (h <= 0) {
            System.out.println("Please enter a valid height!\nEnter the checkerboard’s height: ");
            h = Integer.parseInt(scan.nextLine());
        }
        for (int i = 1; i <= h; i++){
            if (i % 2 == 0){
                System.out.print("■");
                for (int c = 2; c <= w; c++){
                    if (c % 2 == 0){
                        System.out.print("□");
                    }
                    else {
                        System.out.print("■");
                    }
                }
                System.out.print("\n");
            }
            else {
                System.out.print("□");
                for (int z = 2; z <= w; z++){
                    if (z % 2 == 0){
                        System.out.print("■");
                    }
                    else {
                        System.out.print("□");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}