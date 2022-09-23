/* 
Title: MadLibsProject
Authors: Micah Grimaud, Dylan Ward
Date: 9/23/22
Course: APCSA, Tri 1, Woldseth
Description: This program plays a game of Mad Libs with the User. The program prompts
the User for specific parts of speech and inserts them into a story story stored in the
"incomp" variable. It prints the completed story at the end.
*/

import java.util.Scanner;

public class MadLibsProject {
  public static void main(String[] args) {

    // These variables store the different stories you can use.
    // String incomp = "Once, you happened to <verb> and it impacted the <noun> very <adverb>.";
    String incomp = "You know, I am actually a <noun> and it just so happens that <verb>ing me is very <adjective>!";
    // String incomp = "Gaba gee gaba goo, I <verb>ed a <noun>, and so will <noun>!";

    // Creates a new scan object of type Scanner to parse UserInput
    // Initializes count variable
    Scanner scan = new Scanner(System.in);
    int count = 0;

    // this for loop iterates through the whole string (one character at a time)
    // and checks to see if that character is equal to "<" which signifies the
    // start of a part of speech needing to be replaced
    for (int j = 0; j < incomp.length(); j++) {
      if (incomp.substring(j, j + 1).equals("<")) {
        // only increments the number of times equal to number of Mad Libs
        count++;
      }
    }

    // runs as many times as there are Mad Libs
    for (int i = 0; i < count; i++) {
      // finds the indices of both carrots so the program knows
      // where the Mad Libs start and end
      int tempOne = incomp.indexOf("<");
      int tempTwo = incomp.indexOf(">");
      // System.out.println(tempOne + " " + tempTwo + " " + (tempTwo-tempOne));

      // prompts the user with the part of speech in between the carrots and records input
      System.out.println("Enter " + incomp.substring((tempOne + 1), tempTwo) + ": ");
      String input = scan.nextLine();

      // replaces the carrots and part of speech with the input from the User
      incomp = incomp.replaceFirst(incomp.substring(tempOne, tempTwo + 1), input);
    }

    // closes the scan object and prints the final result
    scan.close();
    System.out.println(incomp);
  }
}
