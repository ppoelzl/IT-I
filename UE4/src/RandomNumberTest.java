import java.util.Random;

public class RandomNumberTest {
    private static Random random = new Random();

    int[] getRandomNumbers(int min, int max, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    int getDice() {
        return random.nextInt(6) + 1;
    }

    String getAnswer() {
        String[] s = new String[] {"ja", "nein", "vielleicht"};
        return s[random.nextInt(3)];
    }
}
