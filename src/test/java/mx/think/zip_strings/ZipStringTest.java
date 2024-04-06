package mx.think.zip_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipStringTest {

    @Test
    void mergeAlternately() {
        ZipString zipString = new ZipString();
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        String actual = zipString.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeAlternatelyUnevenSizes() {
        ZipString zipString = new ZipString();
        String word1 = "abcd";
        String word2 = "pqr";
        String expected = "apbqcrd";
        String actual = zipString.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }
    @Test
    void mergeAlternatelyUnevenSizes2() {
        ZipString zipString = new ZipString();
        String word1 = "abcd";
        String word2 = "pqrst";
        String expected = "apbqcrdst";
        String actual = zipString.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeAlternatelyUnevenSizes3() {
        ZipString zipString = new ZipString();
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        String actual = zipString.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }
}