package String;
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

public class MaxNumberofVowels {
    public static void main(String[] args) {
        String s  =  "accdeeiokla";
        int  k = 4 ;
        System.out.println(maxVowel(s, k));

    }
    static int maxVowel(String s, int k) {
        int i =0, j=0, max  =Integer.MIN_VALUE, total  =0;
        while( j < s.length()) {
            if(isVowel(s.charAt(j)))
                total++;
            while(j - i + 1 == k){
                max = Math.max(max, total);

                if( i < s.length() && isVowel(s.charAt(i))) {
                    total--;
                }
                i++;
            }
            j++;
        }
        return max;

    }
    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
