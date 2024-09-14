import java.util.Scanner;
import java.util.Random;

public class FFXIVClassPicker {
    public static void main(String[] args) {  
        Scanner myScanner = new Scanner(System.in);
        String[] classes = {
            "Paladin", "Warrior", "Dark Knight", "Gunbreaker",
            "White Mage", "Scholar", "Astrologian", "Sage",
            "Monk", "Dragoon", "Ninja", "Samurai",
            "Reaper", "Bard", "Machinist", "Dancer",
            "Black Mage", "Summoner", "Red Mage", "Blue Mage"
        };   
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();         
        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();       
        Random random = new Random();
        int randomIndex = random.nextInt(classes.length);        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Your class is: " + classes[randomIndex]);

        
        myScanner.close();
    }
}