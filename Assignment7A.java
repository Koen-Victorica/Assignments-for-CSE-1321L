/*
Class: CSE 1321L
Section: J04
Term: Spring 2022
Instructor: Meghana Bandaru
Name: Koen Victorica
Lab#: Assignment7
*/
import java.util.Locale;
import java.util.Scanner;
class AudioCD{
    private String cdTitle;
    private String[] artists;
    private int releaseYear;
    private String genre;
    private float condition;
    AudioCD (){
        cdTitle = "";
        artists = new String[] {"", "", "", ""};
        releaseYear = 1980;
        genre = "";
        condition = 0;
    }
    AudioCD (String title, String[] artist, int year, String type, float con){
        cdTitle = title;
        artists = new String[] {"", "", "", ""};
            for (int i = 0; i < artist.length; i++) {
                artists[i] = artist[i];
            }
        if (year < 1980){
            releaseYear = 1980;
        }
        else {
            releaseYear = year;
        }
        genre = type;
        if (con < 0 || con > 5){
            condition = 0;
        }
        else {
            condition = con;
        }
    }
    String getCdTitle (){
        return cdTitle;
    }
    String[] getArtists (){
        return this.artists;
    }
    int getReleaseYear (){
        return releaseYear;
    }
    String getGenre (){
        return genre;
    }
    float getCondition (){
        return condition;
    }
}
public class Assignment7A {
    public static void main(String[] args) {
        int cd_ammount, releaseYear, choice, album_info = 0, cd_count = 0, loop_count = 0;
        AudioCD[] AudioCDs;
        String cdTitle, artist, genre, name;
        String[] artists = new String[4];
        float condition;
        boolean done = false, notfound = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("[Rate Audio CD Collection]\nHow many CDs do you have lying around your car? ");
        cd_ammount = Integer.parseInt(scan.nextLine());
        AudioCDs = new AudioCD[cd_ammount + 1];
        for (int i = 1; i <= cd_ammount; i++) {
            System.out.println("CD #" + i + ":");
            System.out.println("*Enter Title: ");
            cdTitle = scan.nextLine();
            System.out.println("*Enter Artists (type -1 when finished):");
            for (int j = 0; j < 4; j++) {
                artist = scan.nextLine();
                if (artist.equals("-1")) {
                    break;
                } else {
                    artists[j] = artist;
                    loop_count++;
                }
            }
            if (loop_count == 4){
               artist = scan.nextLine();
                if (!artist.equals("-1")) {
                    System.out.println("Too many artists entered. Only the first 4 will be used.");
                }
            }
            loop_count = 0;
            System.out.println("*Enter Genre: ");
            genre = scan.nextLine();
            System.out.println("*Enter Release Year: ");
            releaseYear = Integer.parseInt(scan.nextLine());
            System.out.println("*Enter Condition: ");
            condition = Float.parseFloat(scan.nextLine());
            System.out.println("");
            AudioCDs[i] = new AudioCD(cdTitle, artists, releaseYear, genre, condition);
            artists = new String[] {null, null, null, null};
        }
        do {
            System.out.println("[Main Menu]\n1) Album Info\n2) Find a CD\n3) Find an artist\n4) Log off\nChoice: ");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\nWhich CD do you want? ");
                    album_info = Integer.parseInt(scan.nextLine());
                    if (album_info < 1 || album_info > AudioCDs.length) {
                        System.out.println("Sorry, there’s no CD that matches the criteria.");
                        break;
                    } else {
                        System.out.println(album_info + ". " + AudioCDs[album_info].getCdTitle() + ", " + AudioCDs[album_info].getReleaseYear());
                        for (int i = 0; i < AudioCDs[album_info].getArtists().length; i++) {
                            if (AudioCDs[album_info].getArtists()[i] == null) {
                                break;
                            } else {
                                System.out.print("Artist (#" + (i + 1) + "): " + AudioCDs[album_info].getArtists()[i] + "\n");
                            }
                        }
                        System.out.println("Genre: " + AudioCDs[album_info].getGenre() + "\nCondition: " + AudioCDs[album_info].getCondition() + "\n");
                    }
                    break;
                case 2:
                    System.out.println("\nWhat is the CD’s name? ");
                    name = scan.nextLine().toLowerCase();
                    for (int i = 1; i < AudioCDs.length; i++) {
                        if (AudioCDs[i].getCdTitle().toLowerCase().equals(name)) {
                            album_info = i;
                            notfound = false;
                            break;
                        } else {
                            notfound = true;
                        }
                    }
                    if (notfound == true) {
                        System.out.println("Sorry, there’s no CD that matches the criteria.");
                        notfound = false;
                        break;
                    } else {
                        System.out.println(album_info + ". " + AudioCDs[album_info].getCdTitle() + ", " + AudioCDs[album_info].getReleaseYear());
                        for (int i = 0; i < AudioCDs[album_info].getArtists().length; i++) {
                            if (AudioCDs[album_info].getArtists()[i] == null) {
                                break;
                            } else {
                                System.out.print("Artist (#" + (i + 1) + "): " + AudioCDs[album_info].getArtists()[i] + "\n");
                            }
                        }
                        System.out.println("Genre: " + AudioCDs[album_info].getGenre() + "\nCondition: " + AudioCDs[album_info].getCondition() + "\n");
                    }
                    break;
                case 3:
                    System.out.println("\nWhat artist are you looking for?");
                    name = scan.nextLine();
                    for (int i = 1; i < AudioCDs.length; i++) {
                        for (int j = 0; j < AudioCDs[i].getArtists().length; j++) {
                            if (AudioCDs[i].getArtists()[j] == null) {
                                break;
                            }
                            if (AudioCDs[i].getArtists()[j].toLowerCase().equals(name.toLowerCase())) {
                                cd_count++;
                                notfound = false;
                                break;
                            }
                        }
                    }
                    if (notfound == true) {
                        System.out.println("Sorry, there’s no CD that matches the criteria.");
                        notfound = false;
                        break;
                    } else {
                        System.out.println(cd_count + " CD(s) found!\n");
                        for (int i = 1; i < AudioCDs.length; i++) {
                            for (int j = 0; j < AudioCDs[i].getArtists().length; j++) {

                                if (AudioCDs[i].getArtists()[j].toLowerCase().equals(name.toLowerCase())) {
                                    System.out.println("CD: " + AudioCDs[i].getCdTitle());
                                    break;
                                }
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    done = true;
                    System.out.print("\nGoodbye !");
                    break;
                default:
                    System.out.println("This is an invalid input.\n");
                    break;
            }
        } while (done == false);
    }
}