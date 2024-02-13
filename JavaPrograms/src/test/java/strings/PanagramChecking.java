package strings;

import java.util.HashSet;
import java.util.Set;

public class PanagramChecking {


    public static boolean isPanagram(String str) {
        // Check if given string is panagram

        if (str.length() < 26) {
            return false;
        }

        Set<Character> set = new HashSet<>();

       String s = str.toLowerCase();

        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch)) {

                set.add(ch);

            }

        }

        return set.size() == 26;


    }
}
