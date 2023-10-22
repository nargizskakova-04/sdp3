import java.util.Scanner;

public class JoJoAdapterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate Stands
        Stand starPlatinum = new StarPlatinum();
        Stand theWorld = new TheWorld();

        StandMessenger messengerS = new StandMessageAdapter(starPlatinum);
        StandMessenger messengerW = new StandMessageAdapter(theWorld);

        System.out.println("Choose your Stand:");
        System.out.println("1. Star Platinum");
        System.out.println("2. The World");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        StandMessenger selectedMessenger;
        String standName;
        if (choice == 1) {
            selectedMessenger = messengerS;
            standName = "Star Platinum";
        } else {
            selectedMessenger = messengerW;
            standName = "The World";
        }

        System.out.println("Enter the message to be sent through " + standName + ":");
        String userMessage = scanner.nextLine();

        selectedMessenger.sendMessage(userMessage);
        System.out.println("Received message: " + selectedMessenger.receiveMessage());

        scanner.close();
    }
}
