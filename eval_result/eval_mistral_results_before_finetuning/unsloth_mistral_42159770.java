Title: how can I get height and width of a photo that I downloaded from internet in Java? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        How to get image height and width using java?
                            
                                (14 answers)
                            
                    
                Closed 6 years ago.
        


    

I'm downloading a photo from url address with the following code:

try(InputStream in = new URL(photoURL).openStream()){
    Files.copy(in, Paths.get("\\outputFiles\\photo.jpg"));
    System.out.println(outputDir+newPhotoURL);
}


But how can I additionaly display width and height of that image?
    
Answer: 
You can use BufferedImage it has methods getHeight() & getWidth() in Java 7.

BufferedImage

Code for the same :

BufferedImage imo;
        try {
            imo = ImageIO.read(new File("location_of_file"));
            System.out.println(imo.getHeight());
            System.out.println(imo.getWidth());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    
Code: BufferedImage imo;
        try {
            imo = ImageIO.read(new File("location_of_file"));
            System.out.println(imo.getHeight());
            System.out.println(imo.getWidth());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

Complete the code as a full Java method.

```
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageSize {

    public static void main(String[] args) {
        String filePath = "path_to_your_image_file";
        int height = getImageHeight(filePath);
        int width = getImageWidth(filePath);
        System.out.println("Image Height : " + height);
        System.out.println("Image Width : " + width);
    }

    public static int getImageHeight(String file