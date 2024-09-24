// To be able to get user input
import java.util.Scanner;

class Conversation {
    /**
     * This program simulates a conversation with the user,
     * allowing for a specified number of interaction rounds.
     * It responds to user inputs by replacing certain words
     * with their mirrored counterparts or using canned responses
     * if no mirrored words are detected.
     *
     * @param arguments command line arguments not used
     */
    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Ask for the number of conversation rounds
        System.out.println("How many rounds?");
        int rounds = input.nextInt(); // Read user input
        input.nextLine(); // Without this my bot was responding 
                          // before I was able to answer the first question

        // Array of canned responses
        String[] canned = {
            "Interesting, tell me more",
            "Why do you think that",
            "Mmm-hm",
            "Can you elaborate",
            "I see"
        };

        System.out.println("Hi there! What's on your mind?");
        
        // Initialize transcript array to hold both user inputs and bot responses
        String[] transcript = new String[2 * rounds + 2]; // 2 slots for each round + 2 for greeting and goodbye

        // Store initial bot greeting in the transcript
        transcript[0] = "Hi there! What's on your mind?";

        // Mirrored Words
        String[] mirroredWords = {"I", "you", "me", "am", "my", "your", "are"};
        String[] mirroredWith = {"you", "I", "you", "are", "your", "my", "am"};

        // Conversation loop
        for (int i = 0; i < rounds; i++) {
            // Get user input
            String userInput = input.nextLine();
            
            // Store user input in transcript
            // i * 2 + 1 ensures that I'm storing the user's input at the odd indices of the array.
            transcript[i * 2 + 1] = userInput;

           // Split the user input into words
           // Split into words by splitting by spaces
           String[] words = userInput.split(" ");
           // Use the string builder class, which lets me not 
           // have to create a new String object each time I need to make a modification
           StringBuilder userResponse = new StringBuilder(); // To build the response
           boolean hasMirroredWord = false;

           // Loop through each word in the user's input
           for (String word : words) {
               boolean replaced = false;
               // Check if the word is a mirrored word
               for (int j = 0; j < mirroredWords.length; j++) {
                   if (word.equals(mirroredWords[j])) {
                       // Replace the mirrored word
                       word = mirroredWith[j];
                       hasMirroredWord = true;
                       replaced = true;
                       break; // Exit inner loop once replacement is made
                   }
               }
               // Add the word (whether changed or not) to the response
               userResponse.append(word).append(" ");
           }

           // If no mirrored word found, choose a canned response
           // Math.random to randomly choose which canned response to select
           if (!hasMirroredWord) {
               userResponse = new StringBuilder(canned[(int) (Math.random() * canned.length)]);
           }

           
            // Convert response to String in order to be able to store in transcript
            String botResponse = userResponse.toString();

            // Store bot response in transcript
            transcript[i * 2 + 2] = botResponse;

            // Output bot's response with question mark
            System.out.println(botResponse+"?");
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
        // Close scanner object
        input.close();
    }
}
