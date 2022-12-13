/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment7
*/
import java.util.Random;
import java.util.Scanner;
class NPC {
    private String Name, BC;
    private int Attack, ClassID;
    private float Defense, HP;
    NPC(String Nam, int ID){
        Name = Nam;
        ClassID = ID;
        switch (ClassID){
            case 1:
                BC = "Sword Fighter";
                HP = 120;
                Attack = 40;
                Defense = 0.20f;
                break;
            case 2:
                BC = "Unicorn Sorcerer";
                HP = 80;
                Attack = 35;
                Defense = 0.60f;
            break;
            case 3:
                BC = "Dance Battler";
                HP = 100;
                Attack = 20;
                Defense = 0.42f;
                break;
        }
    }
    void setHP (int damgae){
        HP -= damgae;
    }
    void setHPt0 (){
        HP = 0;
    }
    float getHP(){
        return HP;
    }
    String getName(){
        return Name;
    }
    String getBC(){
        return BC;
    }
    int getAttack(){
        return Attack;
    }
    int getClassID(){
        return ClassID;
    }
    float getDefense(){
        return Defense;
    }
    float calculateAttack (float def){
        return (Attack * (1 - def));
    }
    void calculateDefense (float att){
        HP -= 6 + (att * (1 - Defense));
    }
    boolean isStillAlive (){
        if (HP > 0){
            return true;
        }
        else return false;
    }
}
public class Assignment7B
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        String name, BC, Name=null;
        int random, PLAYERID = 0, NPCID, Attack = 0, round;
        float Defense = 0, HP = 0;
        boolean PLAYERALIVE = true;
        char aod;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Generic RPG Battle System]\nEnter your name: ");
        name = scan.nextLine();
        System.out.println ("Enter your battle class: ");
        BC = scan.nextLine().toLowerCase();
        if (BC.equals("sword fighter")){
            PLAYERID = 1;
        }
        if (BC.equals("unicorn sorcerer")){
            PLAYERID = 2;
        }
        if (BC.equals("dance battler")){
            PLAYERID = 3;
        }
        switch (PLAYERID){
            case 1:
                HP = 120;
                Attack = 40;
                Defense = 0.20f;
                break;
            case 2:
                HP = 80;
                Attack = 35;
                Defense = 0.60f;
                break;
            case 3:
                HP = 100;
                Attack = 20;
                Defense = 0.42f;
                break;
        }
        random = rand.nextInt(1,4);
        NPCID = rand.nextInt(1,4);
        switch (random){
            case 1:
                Name = "Brad";
                break;
            case 2:
                Name = "Max";
                break;
            case 3:
                Name = "Sam";
                break;
        }
        NPC NPC = new NPC(Name, NPCID);
        System.out.println ("\n" + name + " the " + BC + ", your opponent is " + NPC.getName() + " the " + NPC.getBC() + "!\n");
        round = 1;
        do{
            System.out.println ("-Round " + round + "-\nDo you (a)ttack or (d)efend? ");
            round++;
            aod = scan.nextLine().toLowerCase().charAt(0);
            random = rand.nextInt(1,3);
            if (random == 1 && aod == 'a'){
                System.out.println (name + " the " + BC + " attacked " + NPC.getName() + " the " + NPC.getBC() + "!");
                System.out.println (NPC.getName() + " the " + NPC.getBC() + " attacked " + name + " the " + BC + "!");
                HP -= NPC.getAttack();
                if (HP < 0){
                    HP = 0;
                }
                NPC.setHP(Attack);
                if (NPC.getHP() < 0){
                    NPC.setHPt0();
                }
                System.out.println (NPC.getName() + " now has " + NPC.getHP() + " HP.");
                System.out.println (name + " now has " + HP + " HP.");
            }
            if (random == 2 && aod == 'a'){
                System.out.println (name + " the " + BC + " attacked " + NPC.getName() + " the " + NPC.getBC() + "!");
                NPC.calculateDefense(Attack);
                if (NPC.getHP() < 0){
                    NPC.setHPt0();
                }
                System.out.println (NPC.getName() + " now has " + NPC.getHP() + " HP.");
                System.out.println (NPC.getName() + " the " + NPC.getBC() + " is on guard.");
            }
            if (random == 1 && aod == 'd'){
                System.out.println (name + " the " + BC + " is on guard.");
                System.out.println (NPC.getName() + " the " + NPC.getBC() + " attacked " + name + " the " + BC + "!");
                HP -= NPC.calculateAttack(Defense);
                if (HP < 0){
                    HP = 0;
                }
                System.out.println (name + " now has " + HP + " HP.");
            }
            if (NPC.getHP() <= 0 || HP <= 0){
                PLAYERALIVE = false;
                if (HP >= 0 && NPC.getHP() <= 0){
                    System.out.println (NPC.getName() + " the " + NPC.getBC() + " was defeated...\n" + name + " the " + BC + " wins!");
                }
                if (HP <= 0 && NPC.getHP() >= 0){
                    System.out.println (name + " the " + BC + " was defeated...\n" + NPC.getName() + " the " + NPC.getBC() + " wins!");
                }
                if (HP <= 0 && NPC.getHP() <= 0){
                    System.out.println (name + " the " + BC + " and " + NPC.getName() + " the " + NPC.getBC() + " were both defeated.");
                }
                break;
            }
            if (random == 2 && aod == 'd'){
                System.out.println (name + " the " + BC + " is on guard.");
                System.out.println (NPC.getName() + " the " + NPC.getBC() + " is on guard.");
            }
        } while (NPC.isStillAlive() == true && PLAYERALIVE == true);
    }
}