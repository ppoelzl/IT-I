public class WordGenerator {
    static void generateWordsOfLengthN(char[] alphabet, int n) {
        printAllPermutations(alphabet, "", n);
    }

    static void printAllPermutations(char[] alphabet, String prefix, int n)
    {
        if (n == 0)
        {
            System.out.println(prefix);
            return;
        }
        for (char c : alphabet) {
            String newPrefix = prefix + c;
            printAllPermutations(alphabet, newPrefix, n - 1);
        }
    }
}
