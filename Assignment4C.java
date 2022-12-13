/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment4
*/
import java.util.Scanner;
import java.util.Random;
public class Assignment4C
{
    public static void main (String[] args)
    {
        int d, a, random, random2, n = 1, e = 1;
        boolean w=false;
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        System.out.println ("[Mathletes Game]\nChoose a game mode (0=Easy, 1=Hard): ");
        d = Integer.parseInt(scan.nextLine());
        if (d == 0){
            System.out.println("Playing on easy mode, huh? Okay!");
            do{
                random = rand.nextInt(-256,256);
                random2 = rand.nextInt(-256,256);
                System.out.println("Q" + n + ". " + random + " * " + random2 + " = ?");
                a = Integer.parseInt(scan.nextLine());
                if (a != random * random2){
                    System.out.println("Incorrect! Try again.");
                    a = Integer.parseInt(scan.nextLine());
                    if (a != random * random2){
                        System.out.println("Incorrect!\nGame over...");
                        w=true;
                    }
                }
                if (a == random * random2) {
                    System.out.println("Correct!");
                    n++;
                    e++;
                }
                if (e > 5) {
                    w = true;
                    System.out.println("You win!");
                }
            } while (w == false);
        }
        else if (d == 1){
            System.out.println("So, you want a challenge? Okay!");
            do{
                random = rand.nextInt(-256,256);
                random2 = rand.nextInt(-256,256);
                System.out.println("Q" + n + ". " + random + " * " + random2 + " = ?");
                a = Integer.parseInt(scan.nextLine());
                if (a != random * random2){
                        System.out.println("Incorrect!\nGame over...");
                        w=true;
                    }
                if (a == random * random2) {
                    System.out.println("Correct!");
                    n++;
                    e++;
                }
                if (e > 10){
                    w=true;
                    System.out.println("You win!");
                }
            } while (w == false);
        }
    }
}