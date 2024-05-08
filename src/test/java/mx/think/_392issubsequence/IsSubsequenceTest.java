package mx.think._392issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {

        IsSubsequence isSubsequence = new IsSubsequence();
        assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
        assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));
        assertTrue(isSubsequence.isSubsequence("b", "abc"));
    }
}