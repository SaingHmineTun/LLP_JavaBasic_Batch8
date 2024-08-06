package it.saimao.L40_MethodParameter;

public class StringEqual {
    // One / One
    boolean isEquals(String one, String two) {
        if (one.length() == two.length()) {
            for (int i = 0; i < one.length(); i ++) {
                char oneChar = one.charAt(i);
                char twoChar = two.charAt(i);
                if (oneChar != twoChar) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
