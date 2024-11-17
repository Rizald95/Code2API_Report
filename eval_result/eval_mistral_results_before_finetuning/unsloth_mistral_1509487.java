import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> myMap = new TreeMap<String, String>();
        myMap.put("one", "one");
        myMap.put("two", "two");
        myMap.put("three", "three");

        String first = myMap.firstEntry().getValue();
        String firstOther = myMap.get(myMap.firstKey());

        System.out.println(first);
        System.out.println(firstOther);
    }
}