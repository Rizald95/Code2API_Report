import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public void registerCustomFont(String fontFilePath) {
    try {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontFilePath)));
    } catch (IOException | FontFormatException e) {
        //Handle exception
    }
}