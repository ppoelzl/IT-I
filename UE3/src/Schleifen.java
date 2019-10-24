public class Schleifen {
    private static void schleifen() {
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                System.out.println(i + j);
    }

    private static void schleifen2() {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println(i + j);
                j++;
            }
            i++;
        }
    }

    private static void schleifen3() {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(i + j);
                j++;
            } while (j <= 3);
            i++;
        } while (i <= 3);
    }
}
