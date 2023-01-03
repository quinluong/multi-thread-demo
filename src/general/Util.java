package general;

import java.util.Random;

public class Util {

    private static final Random random = new Random();

    public static int getRandomNumber(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
