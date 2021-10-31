import java.util.*;

public class RandomWord {

    private final List<String> setOfWords = Arrays.asList("Java", "Python", "Stream", "Lambda");
    private final String chosenWord;
    private final Random random = new Random();
    private final char[] characters;

    public RandomWord() {
        chosenWord = setOfWords.get(random.nextInt(setOfWords.size()));
        characters = new char[chosenWord.length()];
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            result.append(c == '\u0000' ? '_' : c);
            result.append(' ');
        }

        return result.toString();
    }

    public boolean isComplete() {

        for (char c : characters) {
            if (c == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public boolean addGuess(char sign) {
        for (int i = 0; i < chosenWord.length(); i++) {
            if (sign == chosenWord.charAt(i)) {
                characters[i] = sign;
                return true;
            }
            if (Character.toUpperCase(sign) == chosenWord.charAt(i)) {
                characters[i] = Character.toUpperCase(sign);
                return true;
            }
            if (Character.toLowerCase(sign) == chosenWord.charAt(i)) {
                characters[i] = Character.toLowerCase(sign);
                return true;
            }
        }
        return false;
    }
}
