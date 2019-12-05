public class main {
    public static void main(String[] args) {
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        WordGenerator.generateWordsOfLengthN(set1, k);

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        WordGenerator.generateWordsOfLengthN(set2, k);
    }
}
