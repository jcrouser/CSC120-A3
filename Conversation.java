// To be able to get user input
import java.util.Scanner;

class Conversation {

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Ask for the number of conversation rounds
        System.out.println("How many rounds?");
        int rounds = input.nextInt(); // Read user input

        // Array of canned responses
        String[] canned = {
            "Interesting, tell me more",
            "Why do you think that",
            "Mmm-hm",
            "I see",
            "Can you elaborate"
        };

        System.out.println("Hi there! What's on your mind?");
        
        // Initialize transcript array to hold both user inputs and bot responses
        String[] transcript = new String[2 * rounds + 2]; // 2 slots for each round + 2 for start and end

        // Store initial bot greeting in the transcript
        transcript[0] = "Hi there! What's on your mind?";

        // Mirrored Words
        String[] mirroredWords = {"I", "you", "me", "am", "my", "your"};
        String[] mirroredWith = {"you", "I", "you", "are", "your", "my"};

        // Conversation loop
        for (int i = 0; i < rounds; i++) {
            // Get user input
            String userInput = input.nextLine();
            
            // Store user input in transcript
            transcript[i * 2 + 1] = userInput;

            // Check if user input contains mirror words
            boolean hasMirroredWord = false;
            String botResponse = userInput;

            // Search for and replace mirrored words
            for (int j = 0; j < mirroredWords.length; j++) {
                if (botResponse.contains(mirroredWords[j])) {
                    // Replace word in the response
                    botResponse = botResponse.replace(mirroredWords[j], mirroredWith[j]);
                    hasMirroredWord = true;
                }
            }

            // If no mirrored word found, choose a canned response
            if (!hasMirroredWord) {
                botResponse = canned[(int) (Math.random() * canned.length)];
            }

            // Store bot response in transcript
            transcript[i * 2 + 2] = botResponse;

            // Output bot's response
            System.out.println(botResponse + "?");
        }

        // Goodbye message
        String goodbye = "See ya!";
        System.out.println(goodbye);

        // Store goodbye message in transcript
        transcript[2 * rounds + 1] = goodbye;

        // Print transcript
        System.out.println("\nTRANSCRIPT:");
        for (String line : transcript) {
            System.out.println(line);
        }
    }
}
