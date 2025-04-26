package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
    }

    /**
     * Splits a String into an array
     * Counts words and prints them
     * @param text string to be split
     */
    public  static void countWords(String text){
        var word= text.split(" ");
        int totalWords= word.length;
    }
}
