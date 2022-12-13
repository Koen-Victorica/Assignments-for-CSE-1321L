/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment5
*/
import java.util.Scanner;
public class Assignment5A
{
    public static void main (String[] args)
    {
        int num;
        int[] seq;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Fibonacci Sequence Generator]");
        do {
            System.out.println ("How long should the Fibonacci Sequence be?: ");
            num = Integer.parseInt(scan.nextLine());
            if (num <= 0) {
                System.out.println ("Sequences must be larger than 0!");
            }
        } while (num <= 0);
        seq = new int[num];
        seq[0] = 0;
        if (num > 1) seq[1] = 1;
        System.out.println ("Okay, here’s your sequence:");
        if (num > 1){
            for (int i = 2; i < num; i++){
                seq[i] = seq[i - 1] + seq[i - 2];
            }
        }
        for (int i = 0; i < num; i++){
            if (i > 0){
                System.out.print (", " + seq[i]);
            }
            else {
                System.out.print(seq[i]);
            }
        }
    }
}