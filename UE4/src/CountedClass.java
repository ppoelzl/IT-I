public class CountedClass {
    private static int numberOfInstances = 0;

    public CountedClass() {
        numberOfInstances++;
    }

    static int getNumberofInstances() {
        return numberOfInstances;
    }
}
