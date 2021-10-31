import java.util.Scanner;

public class Hangman {

    private int attempts = 3;
    private boolean isNotComplete = true;
    private RandomWord word = new RandomWord();
    private Scanner scanner = new Scanner(System.in);
    private char lastGuess;

    public void run() {
        do{
            displayWord();
            getUserInput();
            checkUserInput();
        } while (isNotComplete);
    }

    void checkUserInput(){
        boolean isCorrect = word.addGuess(lastGuess);

        if(isCorrect){
            if(word.isComplete()){
                System.out.println("You have won!");
                System.out.println(word);
                isNotComplete = false;
            }
        } else {
            attempts--;

            if(attempts == 0){
                System.out.println("You have lost");
                isNotComplete = false;
            }
        }
    }

    void getUserInput(){
        System.out.print("Enter your guess: ");
        lastGuess = scanner.next().charAt(0);
    }

    void displayWord(){
        System.out.println("Tries remaining: " + attempts);
        System.out.println(word);
    }

    void close(){
        scanner.close();
    }
}
