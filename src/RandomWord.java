import java.util.*;

public class RandomWord {

    private List<String> setOfWords = Arrays.asList("Java","Python","War thunder");
    private String chosenWord;
    private Random random = new Random();
    private char[] characters;

    public RandomWord() {
        chosenWord = setOfWords.get(random.nextInt(setOfWords.size() - 1));
        characters = new char[chosenWord.length()];
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (char c: characters) {
            result.append(c == '\u0000' ? '_' : c);
            result.append(' ');
        }

        return result.toString();
    }

    public boolean isComplete(){

        for (char c: characters) {
            if(c == '\u0000'){
                return false;
            }
        }
        return true;
    }

    public boolean addGuess(char sign){
        for (int i = 0; i < chosenWord.length(); i++) {
            if(sign == chosenWord.charAt(i)){
                characters[i] = sign;
                return true;
            }
        }
        return false;
    }
}
