import java.util.*;

public class Hangman {

    private final int attempts = 5;
    private final Set<String> words = new HashSet<>();

    public void run() {
        do{
            String word = randomWordPicker(words);
            display(word);
        } while (true);
    }

    private String randomWordPicker(Set<String> setOfWords) {
        Random random = new Random();
        int randomPicker = random.nextInt(setOfWords.size());
        String chosenWord = null;

        int i = 0;
        for (String element: setOfWords) {
            if(randomPicker == i){
                chosenWord = element;
                break;
            }
            i++;
        }

        return chosenWord;
    }

    private void display(String chosenWord){

        for (Character: chosenWord) {

        }

    }


}
