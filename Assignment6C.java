/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment6
*/
import java.util.Scanner;
public class Assignment6C
{
    public static void main (String[] args)
    {
        int[] a1 = new int[8];
        char[] a2 = new char[8];
        float[] a3 = new float[8];
        String type;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Overloaded Sort]\nWhat data type do you want to enter? ");
        type = scan.nextLine().toLowerCase();
        if(type.equals("int")){
            for (int i = 0; i < 8; i++){
                System.out.println("Value " + (i + 1) + ": ");
                a1[i] = Integer.parseInt(scan.nextLine());
            }
            System.out.println("Calling sortArray()...\nThe sorted values are: ");
            sortArray(a1);
        }
        if(type.equals("char")){
            for (int i = 0; i < 8; i++){
                System.out.println("Value " + (i + 1) + ": ");
                a2[i] = scan.nextLine().charAt(0);
            }
            System.out.println("Calling sortArray()...\nThe sorted values are: ");
            sortArray(a2);
        }
        if(type.equals("float")){
            for (int i = 0; i < 8; i++){
                System.out.println("Value " + (i + 1) + ": ");
                a3[i] = Float.parseFloat(scan.nextLine());
            }
            System.out.println("Calling sortArray()...\nThe sorted values are: ");
            sortArray(a3);
        }
    }
    public static void sortArray (int[] a1){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < (7 - i); j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 8; i++){
            System.out.print(a1[i] + ", ");
        }
    }
    public static void sortArray (char[] a2){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < (7 - i); j++) {
                if (a2[j] > a2[j + 1]) {
                    int temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = (char) temp;
                }
            }
        }
        for (int i = 0; i < 8; i++){
            System.out.print(a2[i] + ", ");
        }
    }
    public static void sortArray (float[] a3){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < (7 - i); j++) {
                if (a3[j] > a3[j + 1]) {
                    float temp = a3[j];
                    a3[j] = a3[j + 1];
                    a3[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 8; i++){
            System.out.print(a3[i] + ", ");
        }
    }
}