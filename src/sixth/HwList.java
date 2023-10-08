package sixth;

import java.util.ArrayList;
import java.util.Random;

public class HwList {
    public ArrayList<Integer> getRandomInteger(int size, int min, int max) {
        ArrayList<Integer> temp = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            temp.add(random.nextInt(min, max));
        }
        return temp;
    }
}
