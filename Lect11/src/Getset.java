import java.util.Scanner;

class Youtube {
    private int subscribers;
    private String channelName;

    public Youtube(String channelName) {
        this.channelName = channelName;
        this.subscribers = 0;
    }

    public void addSubscribers(int count) {
        this.subscribers += count;
    }

    public void removeSubscribers(int count) {
        if (count > 0 && count <= subscribers) {
            this.subscribers -= count;
        } else {
            System.out.println("Invalid subscriber count to remove!");
        }
    }

    public void showDetails() {
        System.out.println("Channel Name: " + channelName);
        System.out.println("Subscribers: " + subscribers);
    }
}

public class Getset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Password check
        System.out.print("Enter password: ");
        int password = sc.nextInt();

        if (password == 1234) {
            sc.nextLine(); // consume leftover newline

            System.out.print("Enter Channel Name: ");
            String name = sc.nextLine();

            Youtube yt = new Youtube(name);

            // Add subscribers
            System.out.print("Enter number of subscribers to add: ");
            int subs = sc.nextInt();
            yt.addSubscribers(subs);

            // Remove subscribers
            System.out.print("Enter number of subscribers to remove: ");
            int unsub = sc.nextInt();
            yt.removeSubscribers(unsub);

            // Show final details
            yt.showDetails();
        } else {
            System.out.println("Access Denied! Wrong password.");
        }

        sc.close();
    }
}