public class StringSplitExample {
    public static void main(String[] args) {
        String s = "123dance456";
        String[] split = s.split("dance");
        String firstSubString = split[0];
        String secondSubString = split[1];

        System.out.println("First substring: " + firstSubString);
        System.out.println("Second substring: " + secondSubString);
    }
}