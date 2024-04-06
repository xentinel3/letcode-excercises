package mx.think.boxes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxMovementTest {

    @Test
    void boxMovementCount() {
        BoxMovement boxMovement = new BoxMovement();

        int [] result = boxMovement.boxMovementCount("110");
        assertArrayEquals(new int[] {1, 1, 3}, result);
    }
    @Test
    void boxMovementCount2() {
        BoxMovement boxMovement = new BoxMovement();

        int [] result = boxMovement.boxMovementCount("001011");
        assertArrayEquals(new int[] {11,8,5,4,3,4}, result);
    }
}