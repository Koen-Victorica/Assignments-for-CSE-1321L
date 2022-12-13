/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment3
*/
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args) {
        float events;
        int percent;
        Scanner scan = new Scanner(System.in);
        System.out.println("[Scrappy’s Bucket List Rewards]\nHow many events have you attended? ");
        events = Float.parseFloat(scan.nextLine());
        percent = (int) (events / 63 * 100);
        if (events == 0)
            System.out.println("Check out events at https://studentaffairs.kennesaw.edu/scrappysbucketlist/!");
        else if (events > 0) {
            System.out.println("You’ve been to " + percent + "% of all SBL events!");
            if (percent >= 10)
                System.out.println("You’ve earned a Drawstring Bag!");
            if (percent >= 25)
                System.out.println("You’ve earned a Hat!");
            if (percent >= 50)
                System.out.println("You’ve earned a T-Shirt!");
            if (percent >= 75)
                System.out.println("You’ve earned a Glass Water Bottle!");
            if (percent == 100) {
                System.out.println("You’ve earned a Hoodie!\nAre you graduating? ");
                String graduating = scan.nextLine();
                String graduatinglower = graduating.toLowerCase();
                if (graduatinglower.equals("yes"))
                    System.out.println("You’ve also earned a Challenge Coin and special Graduation Cords!");
                else System.out.println("There’s a special reward when you graduate!");
            }
        }
    }
}