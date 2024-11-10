public class Main {

    public static void myMethod(int something) {
        // Deklarasi array di luar switch
        int[] array;
        
        // Switch untuk inisialisasi array
        switch (something) {
            case 0:
                array = new int[] {1, 2, 3};
                break;
            default:
                array = new int[] {3, 2, 1};
                break;
        }

        // Menampilkan elemen array
        System.out.println("Array elements: " + java.util.Arrays.toString(array));
    }

    public static void main(String[] args) {
        // Uji myMethod dengan input berbeda
        myMethod(0); // Output: [1, 2, 3]
        myMethod(1); // Output: [3, 2, 1]
    }
}
