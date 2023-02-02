package String;
// https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class GCDofStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfString(str1,str2));
    }
    static String gcdOfString(String str1, String str2){
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }
    static  int gcd(int a , int b){
        return ( b == 0) ? a : gcd(b, a % b);
    }
}
