/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment5
*/
import java.util.Scanner;
public class Assignment5B
{
    public static void main (String[] args)
    {
        String[][] maze = {{"O","X","_","X","X"},{"_","X","_","X","W"},{"_","_","_","X","_"},{"X","X","_","_","_"},{"_","_","_","X","X"}};
        String input;
        int playerR = 0, playerC = 0;
        boolean gameover = false, invalid = false;
        Scanner scan = new Scanner (System.in);
        System.out.println ("[Maze Game]");
        for(int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + ".");
            }
            System.out.print("\n");
        }
        while (gameover == false) {
            System.out.println("Which direction do you want to move? ");
            input = scan.nextLine().toLowerCase();
            switch (input) {
                case "up":
                    playerR -= 1;
                    break;
                case "down":
                    playerR += 1;
                    break;
                case "left":
                    playerC -= 1;
                    break;
                case "right":
                    playerC += 1;
                    break;
                default:
                    invalid = true;
                    System.out.println("That’s not a valid direction!");
                    break;
            }
            if (playerC < 0) {
                System.out.println("You can’t move there – it’s out of bounds!");
                playerC += 1;
                invalid = true;
            }
            if (playerC > 4) {
                System.out.println("You can’t move there – it’s out of bounds!");
                playerC -= 1;
                invalid = true;
            }
            if (playerR > 4) {
                System.out.println("You can’t move there – it’s out of bounds!");
                playerR -= 1;
                invalid = true;
            }
            if (playerR < 0) {
                System.out.println("You can’t move there – it’s out of bounds!");
                playerR += 1;
                invalid = true;
            }
            if (playerR == 0 && playerC == 1 || playerR == 1 && playerC == 1 || playerR == 3 && playerC == 1 || playerR == 0 && playerC == 3 || playerR == 3 && playerC == 0 || playerR == 1 && playerC == 3 || playerR == 2 && playerC == 3 || playerR == 4 && playerC == 3 || playerR == 0 && playerC == 4 || playerR == 4 && playerC == 4) {
                System.out.println("You hit a wall – Game Over!");
                gameover = true;
                break;
            }
            if (playerR == 1 && playerC == 4) {
                System.out.println("\nYou win!");
                gameover = true;
                break;
            }
            if (invalid == false) {
                switch (input) {
                    case "up":
                        maze[playerR][playerC] = "O";
                        maze[playerR + 1][playerC] = "_";
                        break;
                    case "down":
                        maze[playerR][playerC] = "O";
                        maze[playerR - 1][playerC] = "_";
                        break;
                    case "left":
                        maze[playerR][playerC] = "O";
                        maze[playerR][playerC + 1] = "_";
                        break;
                    case "right":
                        maze[playerR][playerC] = "O";
                        maze[playerR][playerC - 1] = "_";
                        break;
                }
                System.out.print("\n");
                for (int i = 0; i < maze.length; i++) {
                    for (int j = 0; j < maze[i].length; j++) {
                        System.out.print(maze[i][j] + ".");
                    }
                    System.out.print("\n");
                }
            }
            invalid = false;
        }
    }
}