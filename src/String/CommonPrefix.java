package String;

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index = 1; index < strs.length; index++){
            while(strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()  - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        CommonPrefix s = new CommonPrefix();
        System.out.println(s.longestCommonPrefix(str));
    }
}
