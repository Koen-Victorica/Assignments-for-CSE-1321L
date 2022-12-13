/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment1
*/
import java.util.Scanner;
public class Assignment1B
{
    public static void main (String[] args)
    {
        float total, tax, delivery, totaltax, subtotal, tenpercenttip, twentypercenttip, totaltenpercenttip, totaltwentypercenttip;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Tip Calculator]\nEnter the total price of the meal: ");
        total = scan.nextFloat();
        System.out.println ("Enter the local tax rate: ");
        tax = scan.nextFloat();
        System.out.println ("Enter the delivery fee: ");
        delivery = scan.nextFloat();
        totaltax = total * tax;
        subtotal = total + delivery;
        tenpercenttip = subtotal / 10;
        twentypercenttip = subtotal / 5;
        totaltenpercenttip = tenpercenttip + subtotal + totaltax;
        totaltwentypercenttip = twentypercenttip + subtotal + totaltax;
        System.out.println ("\nA 10% tip would be " + tenpercenttip + "\nThe total would be " + totaltenpercenttip + "\n\nA 20% tip would be " + twentypercenttip + "\nThe total would be " + totaltwentypercenttip);
    }
}