import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class ImageDownloader {

    public static void main(String[] args) {
        String photoURL = "https://example.com/photo.jpg";  // URL gambar
        String outputDir = "\\outputFiles\\photo.jpg";      // Lokasi penyimpanan gambar lokal

        // Download dan simpan gambar
        try (InputStream in = new URL(photoURL).openStream()) {
            Files.copy(in, Paths.get(outputDir));
            System.out.println("Gambar berhasil diunduh dan disimpan di: " + outputDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Baca gambar dari file lokal dan tampilkan tinggi dan lebarnya
        try {
            File imgFile = new File(outputDir);
            BufferedImage img = ImageIO.read(imgFile);

            if (img != null) {
                int width = img.getWidth();
                int height = img.getHeight();

                System.out.println("Lebar gambar: " + width + " piksel");
                System.out.println("Tinggi gambar: " + height + " piksel");
            } else {
                System.out.println("Gambar tidak bisa dibaca atau formatnya tidak didukung.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
