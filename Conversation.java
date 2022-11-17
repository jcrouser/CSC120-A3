import java.util.Scanner;
import javax.lang.model.type.ArrayType;
/**
 * Holds the conversation between the user and the computer.
 */
class Conversation {
  String [] mirrorWords = {"you", "me", "my", "your", "yours", "mine", "am", "i"};

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
      System.out.println(userDialog);

      //detecting if userDialog has mirror words
      String[] userWords = userDialog.split(" ");//splits the user's response into an array of words
      if (hasMirrorWords(userWords)> 0) {//checks if the user's response has mirror words
        //TODO: create duplicate compter response array and replace elements for each mirror word
      }


      String response = cannedResponses[(int)(Math.random()*5)];//generates a random response
      System.out.println(response);
      transcript[i*2+2] = "Oh yeah?"; //stores the computer's response
    }

    //printing out the transcript
    System.out.println("Transcript:");
    for (int i = 0; i < transcript.length; i++) {
      System.out.println(transcript[i]);
    }

    input.close();
  }
}
