package mx.think.flowerbed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerbedTest {

    @Test
    void canPlaceFlowers() {
        Flowerbed flowerbed = new Flowerbed();
        int[] flowerbed1 = {1,0,0,0,1};
        int _newFlowers = 1;

        boolean result = flowerbed.canPlaceFlowers(flowerbed1, _newFlowers);
        assertTrue(result);
    }

    @Test
    void canPlaceFlowers2() {
        Flowerbed flowerbed = new Flowerbed();
        int[] flowerbed1 = {1,0,0,0,1};
        int _newFlowers = 2;

        boolean result = flowerbed.canPlaceFlowers(flowerbed1, _newFlowers);
        assertFalse(result);
    }

    @Test
    void canPlaceFlowers3() {
        Flowerbed flowerbed = new Flowerbed();
        int[] flowerbed1 = {1,0,0,0,0,1};
        int _newFlowers = 2;

        boolean result = flowerbed.canPlaceFlowers(flowerbed1, _newFlowers);
        assertFalse(result);
    }
}