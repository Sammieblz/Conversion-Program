/*
* NAME: Samuel Ndubuisi
*
* DATE: 2/26/2023
*
* DESCRIPTION: The program asks the user to enter a distance in meters and displays a menu of selections for the user to
* choose from. Depending on the user's choice, the program converts the distance to kilometers, inches, or feet using
* the appropriate conversion formula. The program continues to display the menu until the user chooses to quit the program.
* */



import java.util.Scanner;

public class Ch5Ex8SamuelNdubuisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInMeters;
        int choice = 0; // Initialize the choice variable with a default value

        do {
            System.out.print("Enter a distance in meters: ");
            distanceInMeters = input.nextDouble();

            // Check if the distance entered is a positive value
            if (distanceInMeters < 0) {
                System.out.println("Distance cannot be negative. Please enter a positive value.");
                continue;
            }

            // Display the menu of selections
            menu();
            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();

            // Perform the selected conversion based on the user's input
            switch (choice) {
                case 1:
                    showKilometers(distanceInMeters);
                    break;
                case 2:
                    showInches(distanceInMeters);
                    break;
                case 3:
                    showFeet(distanceInMeters);
                    break;
                case 4:
                    System.out.println("Good-bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please make another choice.");
            }
        } while (choice != 4); // Continue displaying the menu until the user quits
    }

    // Method to display the menu of selections
    public static void menu() {
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. Convert to Feet");
        System.out.println("4. Quit the Program");
    }

    // Method to convert distance from meters to kilometers
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.2f meters is equal to %.2f Kilometers.\n", meters, kilometers);
    }

    // Method to convert distance from meters to inches
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.2f meters is equal to %.2f Inches.\n", meters, inches);
    }

    // Method to convert distance from meters to feet
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.2f meters is equal to %.2f Feet.\n", meters, feet);
    }
}
