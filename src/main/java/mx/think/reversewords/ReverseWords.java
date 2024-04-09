package mx.think.reversewords;

import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String s) {

        String[] wordsArray = cleanAndSplitString(s);
        Stack<String> wordStack = fillWordsStack(wordsArray);

        return reverseWordsOrder(wordStack);
    }

    private String reverseWordsOrder(Stack<String> wordStack) {
        StringBuilder invertedWordsString = new StringBuilder();

        while (!wordStack.isEmpty()) {
            invertedWordsString.append(wordStack.pop());
            invertedWordsString.append(" ");
        }

        return invertedWordsString.toString().trim();
    }

    private Stack<String> fillWordsStack(String[] wordsArray) {
        Stack<String> wordStack = new Stack<>();

        for (String word : wordsArray) {
            if (!word.isEmpty() && !word.isBlank()) {
                wordStack.push(word);
            }
        }

        return wordStack;
    }

    private static String[] cleanAndSplitString(String s) {
        String words = s.trim().replaceAll(" ","|");
        return words.split("\\|");
    }
}
