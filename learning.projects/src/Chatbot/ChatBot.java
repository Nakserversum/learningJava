import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ChatBot {
    private Map<String, String> responses;

    public ChatBot() {
        responses = new HashMap<>();
        responses.put("hey", "wallah billah elhambruh");
        responses.put("wie gehts", "YASALAME");
        responses.put("tschüss", "Auf Wiedersehen!");
        // Weitere Schlüsselwörter und Antworten hinzufügen
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen bei Swollen Kachbul! (Tippe 'exit' zum Beenden)");

        while (true) {
            System.out.print("Du: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bot: Bis bald!");
                break;
            }

            String response = responses.get(input);
            if (response != null) {
                System.out.println("Bot: " + response);
            } else {
                System.out.println("Bot: Das verstehe ich nicht.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        bot.startChat();
    }
}

