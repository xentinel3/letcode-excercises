package mx.think.reversevowels;

import java.util.Stack;

public class ReverseVowels {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        boolean[] isVowelArray = new boolean[chars.length];


        scanForVowelsAndItsPositions(chars, isVowelArray, stack);

        reverseVowels(chars, isVowelArray, stack);

        return String.valueOf(chars);
    }

    private void scanForVowelsAndItsPositions(char[] chars, boolean[] isVowelArray, Stack<Character> stack) {
        for (int i = 0; i < chars.length; i++) {

            if (!isVowel(chars[i])) {
                isVowelArray[i] = false;
                continue;
            }
            stack.push(chars[i]);
            isVowelArray[i] = true;
        }
    }

    private static void reverseVowels(char[] chars, boolean[] isVowelArray, Stack<Character> stack) {
        for (int i = 0; i < chars.length; i++) {
            if (isVowelArray[i]) {
                chars[i] = stack.pop();
            }
        }
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
