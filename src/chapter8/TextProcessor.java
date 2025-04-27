package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love ice cream");
    }

    /**
     * Splits a String into an array
     * Counts words and prints them
     * @param text string to be split
     */
    public  static void countWords(String text){
        var word= text.split(" ");
        int totalWords= word.length;
        String message= String.format("Your text contains %d words : ",totalWords);
        System.out.println(message);
        for (int i = 0; i < totalWords; i++) {
            System.out.println(word[i]);
        }
    }
}
