package String;

public class Length {
    public int lengthOfLastWord(String s){
        String st = s.trim();
        return st.length() - (st.lastIndexOf(" " ) + 1);
    }

    public static void main(String[] args) {
        String s;
        Length str = new Length();
        System.out.println(str.lengthOfLastWord("Hello World"));
    }
}
