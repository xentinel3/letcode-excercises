package mx.think._443stringcompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompresorTest {

    @Test
    void compressOneChar() {
        StringCompresor stringCompresor = new StringCompresor();
        char[] stringToCompress = {'a'};
        int resultingLength = stringCompresor.compress(stringToCompress);
        assertEquals(1, resultingLength);
    }

    @Test
    void compressMultipleChars() {
        StringCompresor stringCompresor = new StringCompresor();
        // a2b11
        char[] stringToCompress =  {'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int resultingLength = stringCompresor.compress(stringToCompress);
        assertEquals(5, resultingLength);
    }
    @Test
    void compressMultipleChars2() {
        StringCompresor stringCompresor = new StringCompresor();
        // a2b11
        char[] stringToCompress =  {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int resultingLength = stringCompresor.compress(stringToCompress);
        assertEquals(4, resultingLength);
    }
}