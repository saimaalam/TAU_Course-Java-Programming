package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love ice cream");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMe.YourDear");
        var s= "avacado".split("a");
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println(s.length);
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

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    private static void reverseString(String text) {
        for (int i =text.length()-1; i>=0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i <modifiedText.length() ; i++) {
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(" ");
        System.out.println(modifiedText);
    }
}
