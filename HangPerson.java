
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
        run();

    }
	
    public void run() {
    System.out.println("working!");
    setupVariables();
    // the main program should include the following: 
    // 1) a while loop that keeps the user guessed letters until all
    // letters of the word are guessed. or the user makes too many incorrect guesses.
    // If a letter is found, all instances of the letter are shown in the word.  
    // if an incorrect guess is made, the new hangman is shown.  Give feedback after every guess.
    // A final output when games ends.
    //output result based on whether all letters guessed or five misses

    }
	
    public void setupVariables() {
    // the following method should call the setupRandomWord method and set up any variables.

    // create a copy of the word to track how many letters are found.
    // for the word alphabet status would be a___ab_t

    }
	
    private void setupWordStatus() {
    // this method initializes a variable wordStatus to keeps track of letters correctly guessed in the word a___a___
   
    }
	
    public void displayDirections() {
    // this method displays the rules of the game to the user

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
	
    private String displayWordStatus() {
    String newStr = "";
	    // this method returns a string of the letters correctly guessed by displaying wordStatus with spaces between each letter
    return newStr;
    }
	
    private int countCorrect(char c) {
    int count = 0;
    // this returns how many times letter guess exists in the word
    return count;
    }

    private boolean checkGuessedLetter(char c) {
    // the following method checks to see if the letter has been guessed yet and returns true if yes and false if not.
    return false;
    }

    public String getRandomWord() {
    	// the following method randomizes the choice of a word for the game.. use 10 possible words

        return "alphabet";
    }

    public String replaceCharInWord(String word, char c, int index) { 
    String newStr = "";
    // this method replaces a specific character in a string with a different letter (for replacing the correctly guessed letters)

    return newStr;
    }

    public String getLetter() {
    String ch = "";
    // this method asks the user to guess a letter and returns the letter guessed
    return ch;
    }

    public boolean guessWord(String w) {
    String word = "";
    // this method asks the user to guess the word and compares it to the word and returns true or false
    return word;
    }

    private void showHangPerson(int inc) {
    	// displays the current hangPerson. Five wrong guesses and person is hanged and game ends.

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
