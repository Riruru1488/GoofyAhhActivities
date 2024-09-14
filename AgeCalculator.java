import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner ageDesu = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        System.out.print("Enter your birth year (example >1991<): ");
        int birthYear = ageDesu.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int birthDay = ageDesu.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = ageDesu.nextInt();
        int age = currentYear - birthYear;      
        LocalDate birthdayThisYear = LocalDate.of(currentYear, birthMonth, birthDay);
        if (currentDate.isBefore(birthdayThisYear)) {
            age--;
        }
        System.out.println("You are " + age + " years old.");
        ageDesu.close();
    }
}