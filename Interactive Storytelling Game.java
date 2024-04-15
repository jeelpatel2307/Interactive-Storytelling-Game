import java.util.Scanner;

public class InteractiveStorytellingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Interactive Storytelling Game!");
        System.out.println("You wake up in a mysterious forest...");
        System.out.println("What do you do?");
        System.out.println("1. Explore the forest");
        System.out.println("2. Stay put and wait for help");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                exploreForest();
                break;
            case 2:
                stayPut();
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
        }
    }

    public static void exploreForest() {
        System.out.println("You decide to explore the forest...");
        System.out.println("You encounter a fork in the road. Which path do you take?");
        System.out.println("1. Left path");
        System.out.println("2. Right path");
        Scanner scanner = new Scanner(System.in);
        int pathChoice = scanner.nextInt();

        switch (pathChoice) {
            case 1:
                System.out.println("You chose the left path and discover a hidden treasure!");
                break;
            case 2:
                System.out.println("You chose the right path and encounter a ferocious bear!");
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
        }
    }

    public static void stayPut() {
        System.out.println("You decide to stay put and wait for help...");
        System.out.println("After some time, you hear rustling in the bushes. What do you do?");
        System.out.println("1. Investigate the noise");
        System.out.println("2. Stay hidden");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You investigate the noise and find a friendly woodland creature!");
                break;
            case 2:
                System.out.println("You stay hidden and avoid a group of bandits passing by.");
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
        }
    }
}
