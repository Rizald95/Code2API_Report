import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Membuat ArrayList dengan elemen yang berulang
        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("A");  // Elemen berulang
        myList.add("C");
        myList.add("B");  // Elemen berulang

        // Menampilkan ArrayList sebelum penghapusan duplikat
        System.out.println("Before removing duplicates: " + myList);

        // Memanggil metode untuk menghapus elemen duplikat
        removeDuplicates(myList);

        // Menampilkan ArrayList setelah penghapusan duplikat
        System.out.println("After removing duplicates: " + myList);
    }

    // Metode untuk menghapus elemen yang berulang dari ArrayList
    public static void removeDuplicates(ArrayList<String> list) {
        // Menggunakan Set untuk menghilangkan duplikat
        Set<String> set = new HashSet<>(list);
        
        // Mengosongkan ArrayList
        list.clear();
        
        // Menambahkan elemen-elemen unik dari Set kembali ke ArrayList
        list.addAll(set);
    }
}
