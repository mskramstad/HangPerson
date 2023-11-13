
import java.util.Scanner;

public class HangPerson {

	// use the following global variables for the program
    String word;
    String wordStatus;

    //string to keep track of all letters guessed
    String guessedLetters="";

    int incorrect = 0;
    int correct = 0;

    Scanner user_input;

    public void start() {
        System.out.println("Welcome to Hangperson");
        System.out.println();
        System.out.println("The rules are simple.. You know the drill. Guess the word before time runs out.");
        System.out.println();
        System.out.println("Choosing word....");

        setup();

        run();

    }


    public void setup() {
    // the following method should call the setupRandomWord method and set up any variables.
    word = getRandomWord();

    // used to create a copy of the word to track how many letters are found.
    // for alphabet the word status would be a___ab_t

    setupWordStatus();

    }

    public void run() {
    // the main program should include the following: 
    // 1) a while loop that keeps the user guessed letters until all
    // letters of the word are guessed. or the user makes too many incorrect guesses.
    // If a letter is found, all instances of the letter are shown in the word.  
    // if an incorrect guess is made, the new hangman is shown.  Give feedback after every guess.
    // A final output when games ends.
    

        //output result based on whether all letters guessed or five misses

    }

    private void setupWordStatus() {
      String ws = "";
      for (int i=0; i < word.length(); i ++) {
          ws += "_";
      }
      wordStatus = ws;
    }

    private String displayCurrentStatus() {

      String newStr ="";

      for (int i =0; i < wordStatus.length(); i ++) {
        newStr += wordStatus.charAt(i);
        newStr += " ";
      }
      return newStr;
    }

    private static boolean checkGuessedLetter(char c) {
    // the following method checks to see if the letter has been guessed yet and returns true if yes and false if not.
        
    return false;
    }

    public void showStatus() {
    	// the following method displays the following to the user: 
        //
        // There are 7 letters in the word.
        // You have guessed these letters: aclm
        // Current status: a _ p _ a _ b _ _
    	// 
        // 1) how many letters in the word 
        // 2) what letters the user has already guessed, and
    	// 3) the current status of the word 


    }

    public String getRandomWord() {
    	// the following method randomizes the choice of a word for the game.. use 10 possible words

        return "alphabet";
    }


    private void showHangman(int inc) {
    	// displays the current hangman. Five wrong guesses and man is hanged and game ends.

        switch (inc) {
            case 0:
                break;

            case 1:
                System.out.println("We've got the scaffold ready...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 2:
                System.out.println("Second wrong.. he's hanging...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 3:
                System.out.println("He's raising his hands for help.. Help him!...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 4:
                System.out.println("No time left.. one false step...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 5:
                System.out.println("Times up!");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |      / \\");
                System.out.println("    |");
                System.out.println("   _|___");

                break;

        }
    }

}
