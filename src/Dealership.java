import java.util.Scanner;

public class Dealership {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the java Dealership");
        System.out.println("- select option 'a' to buy a car.");
        System.out.println("- select option 'b' to sell a car");

        String option = scan.nextLine();

        switch (option){
            case "a" : System.out.println("You chose the option " + option); break;
            case "b" : System.out.println("You chose the option " + option); break;
            default:    System.out.println("Please enter a valid option");
        }
    }
}
