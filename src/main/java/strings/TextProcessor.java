package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("i love java");

    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numOfWords = words.length;

        String message = String.format("Your text contains %d words", numOfWords);
        System.out.println(message);

        for(String word:words){
            System.out.println(word);
        }
    }
}
