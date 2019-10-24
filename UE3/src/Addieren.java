public class Addieren {
    static void addiere(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array2.length; j++)
                System.out.println(String.format("%d+%d=%d", array1[i], array2[i], array1[i] + array2[i]));
    }

    static void addiere2(int[] array1, int[] array2) {
        int i = 1;
        while (i <= array1.length) {
            int j = 1;
            while (j <= array2.length) {
                System.out.println(String.format("%d+%d=%d", array1[i], array2[i], array1[i] + array2[i]));
                j++;
            }
            i++;
        }
    }

    static void addiere3(int[] array1, int[] array2) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(String.format("%d+%d=%d", array1[i], array2[i], array1[i] + array2[i]));

                j++;
            } while (j <= array2.length);
            i++;
        } while (i <= array1.length);
    }
}
