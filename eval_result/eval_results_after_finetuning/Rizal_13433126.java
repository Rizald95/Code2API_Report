import java.util.Scanner;

public class CharOccurrenceCounter {
    public static void main(String[] args) {
        // Kalimat yang akan dianalisis
        String sentence = "JAVA IS TOUGH LANGUAGE";

        // Mengambil input karakter dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character to search: ");
        char c = scanner.next().charAt(0); // Mengambil karakter pertama dari input pengguna

        // Memanggil metode untuk menghitung kemunculan karakter
        countOccurrences(sentence, c);
    }

    // Metode untuk menghitung kemunculan karakter dalam string
    public static void countOccurrences(String s, char c) {
        int cnt = 0;

        // Loop melalui setiap karakter dalam string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
        }

        // Menampilkan jumlah kemunculan karakter
        System.out.println("Number of occurrences of character '" + c + "' is: " + cnt);
    }
}
