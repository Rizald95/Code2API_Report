import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList 2D
        List<List<String>> ls2d = new ArrayList<>();

        // Membuat list internal dan menambahkannya ke ls2d
        List<String> x = new ArrayList<>();
        x.add("Hello");
        x.add("world!");
        ls2d.add(x);

        // Menambah list internal lainnya
        List<String> y = new ArrayList<>();
        y.add("Java");
        y.add("Programming");
        ls2d.add(y);

        // Mencetak ArrayList 2D
        System.out.println("2D ArrayList: " + Arrays.deepToString(ls2d.toArray()));

        // Konversi list internal menjadi array
        String[] xArray = x.toArray(new String[0]);
        System.out.println("Internal list as array: " + Arrays.toString(xArray));
    }
}
