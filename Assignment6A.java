/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment6
*/
import java.util.Scanner;
import java.util.Random;
public class Assignment6A
{
    public static void main (String[] args)
    {
        int[] onemil = new int[1000000];
        int number = 0, random, lin = 0, bin = 0, low = 0, mid = 0, high = onemil.length - 1;;
        String faster = null;
        Random rand = new Random();
        Scanner scan = new Scanner (System.in);
        for (int i = 999999; i > 0; i--){
            onemil[number] = i;
            number++;
    }
        random = rand.nextInt(1000000);
        for (int i = onemil.length-1; i > 0; i--)
        {
            lin = i;
            if (onemil[i] == random)
            {
                break;
            }
        }
        while (high >= low)
        {
            bin++;
            mid = (low + high) / 2;
            if (random < onemil[mid]) {
                high = mid - 1;
            }
            else if (random == onemil[mid]) {
                break;
            }
            else{
                low = mid + 1;
            }
        }
        if (lin < bin){
            faster = "Linear Search is faster this time!";
        }
        else{
            faster = "Binary Search is faster this time!";
        }
        System.out.println("[Linear Vs. Binary Search]\nThe target value is " + random + "\nLinear Search: " + lin + " loop(s)\nBinary Search: " + bin + " guess(es)\n" + faster);
    }
}