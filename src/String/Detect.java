package String;
//https://leetcode.com/problems/detect-capital/

public class Detect {
    public static void main(String[] args) {
        String word = "USA";
        boolean first = detectCapital(word);
       if(first)
           System.out.println("true");
       else
           System.out.println("false");
    }
    static  boolean detectCapital(String word) {
        int c = 0;
        boolean first = false;
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
            first = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                c++;
            if ((c == 1 && first) || c == word.length() || c == 0)
                return true;
            else return false;
        }
        return false;

    }
}
