public class TimeMeasurement {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Your code here

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Time taken: " + duration + " nanoseconds");
    }
}