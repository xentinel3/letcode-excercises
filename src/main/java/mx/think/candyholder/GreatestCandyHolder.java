package mx.think.candyholder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandyHolder {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        if (candies.length == 0)
            return new ArrayList<>();

        List<Boolean> kidsWithCandies = new ArrayList<>();
        int maxCandie = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            if (candy + extraCandies < maxCandie) {
                kidsWithCandies.add(false);
                continue;
            }
            kidsWithCandies.add(true);
        }

        return kidsWithCandies;

    }
}
