package strings;

public class CountWordsInString {


    public static int countWords(String str) {
        // find and return the number of words
        // present in the string


        String[] size = str.split(" ");


        return size.length;
    }
}
