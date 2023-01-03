package String;
// https://leetcode.com/problems/delete-columns-to-make-sorted/
public class DeleteColumns {
    public static void main(String[] args) {
        String[] s = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(s));
    }
    static int minDeletionSize(String[] s) {
        int c = 0;
        for (int i = 0; i < s[0].length() ; i++) {
            char prev = '0';
            for(String str : s){
                char curr = str.charAt(i);
                if(prev > curr){
                    c++;
                    break;

                }
                prev = curr;
            }

        }
        return c;
    }
}
