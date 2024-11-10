
@Controller
public class ExportTlocrt {

@Autowired
private PhoneBookService phoneBookSer;

private void setResponseHeaderTlocrtPDF(HttpServletResponse response) {
    response.setContentType("application/pdf");
    response.setHeader("content-disposition", "attachment; filename=Tlocrt.pdf" );
} 

@RequestMapping(value = "/exportTlocrt.html", method = RequestMethod.POST)
public void exportTlocrt(Model model, HttpServletResponse response, HttpServletRequest request){

    setResponseHeaderTlocrtPDF(response);
    File f = new File("C:\\Tlocrt.pdf");

    try {
        OutputStream os = response.getOutputStream();
        byte[] buf = new byte[8192];
        InputStream is = new FileInputStream(f);
        int c = 0;
        while ((c = is.read(buf, 0, buf.length)) > 0) {
            os.write(buf, 0, c);
            os.flush();
        }
        os.close();
        is.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}


...........................................................................................
    
Answer: 
import java.io.*;


public class Test {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\file.pdf");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        String s1 = dis.readUTF();
        System.out.println(s1);
    }
}


Provide a full java code.

# Answer
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io