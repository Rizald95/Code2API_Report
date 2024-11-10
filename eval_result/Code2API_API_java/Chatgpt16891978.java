package com.chatgpt.api;
import java.io.*;

public class Chatgpt16891978 {
    public static void readPdfAndWriteToOutputStream(String filePath, OutputStream outputStream) throws IOException {
        File f = new File(filePath);
        byte[] buf = new byte[8192];
        InputStream is = new FileInputStream(f);
        int c = 0;
        while ((c = is.read(buf, 0, buf.length)) > 0) {
            outputStream.write(buf, 0, c);
            outputStream.flush();
        }
        outputStream.close();
        is.close();
    }
}
