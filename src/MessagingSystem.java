import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MessagingSystem {

    private Queue<String> messageQueue;

    public MessagingSystem() {
        messageQueue = new LinkedList<>();
    }

    // Method to send a message (enqueue)
    public void sendMessage(String message) {
        messageQueue.add(message);
        System.out.println("Message sent: " + message);
    }

    // Method to receive a message (dequeue)
    public String receiveMessage() {
        if (messageQueue.isEmpty()) {
            System.out.println("No messages to receive.");
            return null;
        }
        String message = messageQueue.poll();
        System.out.println("Message received: " + message);
        return message;
    }

    // Method to display the current messages in the queue
    public void displayMessages() {
        if (messageQueue.isEmpty()) {
            System.out.println("No messages in the queue.");
        } else {
            System.out.println("Messages in queue: " + messageQueue);
        }
    }

    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMessaging System Menu:");
            System.out.println("1. Send Message");
            System.out.println("2. Receive Message");
            System.out.println("3. Display Messages");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter message to send: ");
                    String message = scanner.nextLine();
                    messagingSystem.sendMessage(message);
                    break;
                case 2:
                    messagingSystem.receiveMessage();
                    break;
                case 3:
                    messagingSystem.displayMessages();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
