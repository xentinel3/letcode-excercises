package mx.think.flowerbed;

public class Flowerbed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int availableFlowerSlots = 0;
        for (int currentIndex = 0; currentIndex < flowerbed.length; currentIndex++) {

            if (flowerbed[currentIndex] == 0) {
                int prevSlot = currentIndex == 0 ? 0 : flowerbed[currentIndex - 1];
                int nextSlot = currentIndex == flowerbed.length - 1 ? 0 : flowerbed[currentIndex + 1];
                if (prevSlot == 0 && nextSlot == 0) {
                    flowerbed[currentIndex] = 1;
                    availableFlowerSlots++;
                }
            }

            if (availableFlowerSlots >= n) {
                return true;
            }
        }
        return false;
    }
}
