package mx.think.candyholder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCandyHolderTest {

        @Test
        void kidsWithCandies() {
            GreatestCandyHolder greatestCandyHolder = new GreatestCandyHolder();
            int[] candies = {2,3,5,1,3};
            int extraCandie = 3;
            List<Boolean> expected = Arrays.asList(true, true, true, false, true);
            assertEquals(expected, greatestCandyHolder.kidsWithCandies(candies, extraCandie));
        }

        @Test
        void kidsWithCandies2() {
            GreatestCandyHolder greatestCandyHolder = new GreatestCandyHolder();
            int[] candies = {4,2,1,1,2};
            int extraCandie = 1;
            List<Boolean> expected = Arrays.asList(true, false, false, false, false);
            assertEquals(expected, greatestCandyHolder.kidsWithCandies(candies, extraCandie));
        }
}