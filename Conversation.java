import java.util.Scanner;
//import javax.lang.model.type.ArrayType;
/**
 * Holds the conversation between the user and the computer.
 */
class Conversation {
  static String [] mirrorWords = {"you", "me", "my", "your", "yours", "mine", "am", "i", "I"};
  static String [] oppositeWords = {"I", "you", "your", "my", "mine", "yours", "are", "you", "You"};

  /**
   * Detects if a string array contains mirror words and how many
   * @param sentence the string array to be checked
   * @return the number of mirror words in the string array
   */
  public static int hasMirrorWords(String [] sentence) {
    int count = 0;
    for (int i = 0; i < sentence.length; i++) {
      for (int j = 0; j < mirrorWords.length; j++) {
        if (sentence[i].equals(mirrorWords[j])) {
          count++;
        }
      }
    }
    return count;
  }

  /**
   * Switches the mirror words in a string array to their opposite words
   * @param sentence the string array to be switched
   * @return a string array with the mirror words switched to their opposite words
   */
  public static String [] switchMirrorWords(String [] sentence) {
    for (int i = 0; i < sentence.length; i++) {
      for (int j = 0; j < mirrorWords.length; j++) {
        if (sentence[i].equals(mirrorWords[j])) {
          sentence[i] = oppositeWords[j];
        }
      }
    }
    return sentence;
  }

  /** Main Method */
  public static void main(String[] arguments) {


    System.out.println("How many rounds of conversation?");//asks the user how many rounds of conversation they want

    Scanner input = new Scanner(System.in);//creates a scanner object to take in input
    int rounds = input.nextInt();//stores the number of rounds
    input.nextLine();//skips enter key
    String[] transcript = new String[rounds*2+1];//creates an array to store the transcript of the conversation
    String[] cannedResponses = {"Oh yeah?","Mhmm...","Uh huh?","Really?","Oh Wow"}; //creates an array of canned responses

    System.out.println("Hi! How are you today?");//starts the conversation
    transcript[0] = "Hi! How are you today?";//stores the first line of the conversation

    for (int i = 0; i < rounds; i++) {//loops through the number of rounds

      String userDialog = input.nextLine();
      transcript[i*2+1] = userDialog;//stores the user's response
      //System.out.println(userDialog);

      //switching words if userDialog has mirror words
      String[] userWords = userDialog.split(" ");//splits the user's response into an array of words
      if (hasMirrorWords(userWords)> 0) {//checks if the user's response has mirror words
        String[] computerResponse = userWords;//creates a copy of the user's response
        computerResponse = switchMirrorWords(computerResponse);//replaces the mirror words with their opposites
        //combines the words into a string
        String response = "";
        for (int j = 0; j < computerResponse.length; j++) {
          response += computerResponse[j] + " ";
        }
        if ((userDialog.endsWith("."))||(userDialog.endsWith("!"))) {
          response = response.substring(0, response.length()-2);//returns the string without ending punctuation
          response += "?";
        }
        else if (userDialog.endsWith("?")) {
          response = response.substring(0, response.length()-2);//returns the string without ending question mark
          response += ".";
        }
        else {
          response += "?";
        }
        System.out.println(response);
        transcript[i*2+2] = response;//stores the computer's response
      }
      else {
        String response = cannedResponses[(int)(Math.random()*cannedResponses.length)];//chooses a random canned response
        System.out.println(response);
        transcript[i*2+2] = response;//stores the computer's response
      }
    }

    //printing out the transcript
    System.out.println("Transcript:");
    for (int i = 0; i < transcript.length; i++) {
      System.out.println(transcript[i]);
    }

    input.close();
  }
}
