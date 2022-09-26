import java.util.Scanner;

import javax.lang.model.type.ArrayType;

class Conversation {

  public static void main(String[] arguments) {
    System.out.println("How many rounds of conversation?");
    Scanner input = new Scanner(System.in);
    int rounds = input.nextInt();
    System.out.println("Hi! How are you today?");
    //String arrayString [];
    String[] cannedResponses = {"Oh yeah?","Mhmm...","Uh huh?","Really?"};
    //userResponses

    for (int i = 0; i < rounds; i++) {
      String userDialog = input.next();
      //System.out.println(userDialog);
      System.out.println("Oh yeah?");
    }

    input.close();
  }
}
