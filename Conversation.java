// To be able to get user input
import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in); // Scanner object

    // Ask for the number of conversation rounds
    System.out.println("How many rounds?");
    int rounds = input.nextInt(); // Read user input
    System.out.print(rounds);
    
    // Array of canned responses
    String[] canned = {"Interesting, tell me more.",
    "Why do you think that?",
    "Mmm-hm.",
    "I see.",
    "Can you elaborate?"};

    System.out.println("Hi there!  What's on your mind?");
    // Storing transcript
    String[] transcript = {}; 
    transcript[0] = "Hi there! What's on your mind?";

    // Mirrored Words
    String[] mirroredWords = {"I","you", "me", "am", "my", "your"};
    String[] mirroredWith = {"you","I","are","are","your","my"};

    // Conversation loop
    for (int i = 0; i < rounds; i++) {
      // Get user input
      String userInput = input.nextLine();
      transcript[??] = userInput;
  }

    // Goodbye message
    String goodbye = "See ya!";
    System.out.println(goodbye);
    transcript[???] = goodbye;
}