package mx.think._392issubsequence;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }
        int cursor = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(cursor)) {
                cursor++;
            }
            if (cursor >= s.length()) {
                break;
            }
        }
        return cursor == s.length();
    }
}
