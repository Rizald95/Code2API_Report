import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // Membuat TreeMap dan menambahkan beberapa entri
        TreeMap<String, String> myMap = new TreeMap<>();
        myMap.put("1", "one");
        myMap.put("3", "three");
        myMap.put("2", "two");

        // Mendapatkan entri pertama (berdasarkan urutan kunci yang diurutkan secara alami)
        Map.Entry<String, String> firstEntry = myMap.firstEntry();
        if (firstEntry != null) {
            System.out.println("First Entry: Key = " + firstEntry.getKey() + ", Value = " + firstEntry.getValue());
        }

        // Alternatif lain untuk mendapatkan nilai dengan menggunakan kunci pertama
        String firstValue = myMap.get(myMap.firstKey());
        System.out.println("First Value (using firstKey): " + firstValue);
    }
}
