import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

class MyObject {
    private String name;

    public MyObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Cache<K, V> {
    private Map<K, SoftReference<V>> cacheMap = new HashMap<>();

    public void put(K key, V value) {
        // Membungkus objek dengan SoftReference
        cacheMap.put(key, new SoftReference<>(value));
    }

    public V get(K key) {
        SoftReference<V> ref = cacheMap.get(key);
        if (ref != null) {
            return ref.get(); // Mengembalikan objek jika masih ada
        }
        return null; // Objek sudah dibersihkan oleh GC
    }

    public void clear() {
        cacheMap.clear();
    }

    public int size() {
        return cacheMap.size();
    }
}

public class Main {

    public static void main(String[] args) {
        Cache<String, MyObject> cache = new Cache<>();

        // Memasukkan banyak objek ke dalam cache
        for (int i = 0; i < 100000; i++) {
            String key = Integer.toString(i);
            cache.put(key, new MyObject(key));
        }

        // Mengambil objek dari cache
        MyObject myObject = cache.get("0");
        if (myObject != null) {
            System.out.println("Object '0' found: " + myObject);
        } else {
            System.out.println("Object '0' has been garbage collected.");
        }

        // Memaksa pengumpulan sampah
        System.gc();

        // Coba ambil objek setelah pemanggilan GC
        myObject = cache.get("0");
        if (myObject != null) {
            System.out.println("Object '0' found after GC: " + myObject);
        } else {
            System.out.println("Object '0' has been garbage collected after GC.");
        }
    }
}
