package mx.think.reversewords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void reverseWords() {
        ReverseWords reverseWords = new ReverseWords();
        assertEquals("blue is sky the", reverseWords.reverseWords("the sky is blue"));
        assertEquals("world! hello", reverseWords.reverseWords("  hello world!  "));
        assertEquals("example good a", reverseWords.reverseWords("a good   example"));
    }
}