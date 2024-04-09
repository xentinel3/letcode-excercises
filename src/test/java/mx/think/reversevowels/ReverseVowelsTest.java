package mx.think.reversevowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    @Test
    void reverseVowels() {
        ReverseVowels reverseVowels = new ReverseVowels();
        String result = reverseVowels.reverseVowels("hello");
        System.out.printf("result: %s", result);
        assertEquals("holle", result);
    }

    @Test
    void reverseVowels2() {
        ReverseVowels reverseVowels = new ReverseVowels();
        String result = reverseVowels.reverseVowels("leetcode");
        System.out.printf("result: %s", result);
        assertEquals("leotcede", result);
    }
}