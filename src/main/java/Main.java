package CortechAI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        AiKlasse ai = new AiKlasse();
        Scanner scanner = new Scanner(System.in);

        System.out.println("AI-chat gestart. Typ 'stop' om te stoppen.");

        while (true) {
            System.out.print("\nJij: ");
            String vraag = scanner.nextLine();

            if (vraag.equalsIgnoreCase("stop")) {
                System.out.println("Chat beëindigd.");
                break;
            }

            String antwoord = ai.sendMessage(vraag);
            System.out.println("AI: " + antwoord);
        }

        scanner.close();
    }
}
