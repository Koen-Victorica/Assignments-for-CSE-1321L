/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment3
*/
import java.util.Scanner;
public class Assignment3C
{
    public static void main (String[] args)
    {
        String device, response;
        int version;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[App Checklist]\nWhat mobile device do you have? ");
        device = scan.nextLine();
        device = device.toLowerCase();
        if (device.equals("apple") || device.equals("android")) {
            System.out.println("What version do you have? ");
            version = Integer.parseInt(scan.nextLine());
            if ((device.equals("apple") && version >= 14) || device.equals("android") && version >= 10)
                System.out.println("Congratulations, you can run the app!");
            else if (device.equals("apple") && version < 14){
                System.out.println("Does your device support NFC? ");
                response = scan.nextLine();
                response = response.toLowerCase();
                if(response.equals("yes"))
                    System.out.println("Congratulations, you can run the app!");
                else System.out.println("I’m sorry, our app does not support your device.");
            }
            else if (device.equals("android") && version < 10){
                System.out.println("Does your device support Bluetooth connections? ");
                response = scan.nextLine();
                response = response.toLowerCase();
                if(response.equals("yes"))
                    System.out.println("Congratulations, you can run the app!");
                else System.out.println("I’m sorry, our app does not support your device.");
            }
        }
        else
            System.out.println("I’m sorry.");
    }
}