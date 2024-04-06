package mx.think.boxes;


import java.util.ArrayList;
import java.util.List;

public class BoxMovement {

    public int[] boxMovementCount(String boxes) {
        char[] boxArray = boxes.toCharArray();
        List<Coordiate> coordinates = getCoordinates(boxArray);
        int[] movementsCount = new int[boxArray.length];

        for (int currentPosition = 0; currentPosition < movementsCount.length; currentPosition++) {

            movementsCount[currentPosition] = 0;
            for (Coordiate coordinate : coordinates) {
                if (coordinate.isHasBall()) {

                    int distanceToCurrentIndex = getMovementCount(coordinate.getPosition(), currentPosition);
                    movementsCount[currentPosition] += distanceToCurrentIndex;
                }
            }

        }

        return movementsCount;
    }

    private int getMovementCount(int position, int currentPosition) {
        return Math.abs(position - currentPosition);
    }

    private List<Coordiate> getCoordinates(char[] boxArray) {
        int index = 0;
        List<Coordiate> coordinates = new ArrayList<>();
        for (char box : boxArray) {
            coordinates.add(new Coordiate(Character.getNumericValue(box), index));
            index++;
        }
        return coordinates;
    }

    private class Coordiate {
        private int number;
        private int position;
        private boolean hasBall;

        @Override
        public String toString() {
            return "Coordiate{" +
                    "number=" + number +
                    ", position=" + position +
                    ", hasBall=" + hasBall +
                    '}';
        }

        public Coordiate(int number, int position) {
            this.number = number;
            this.position = position;
            if(number == 1)
                this.hasBall = true;
        }

        public int getPosition() {
            return position;
        }

        public boolean isHasBall() {
            return hasBall;
        }
    }
}
