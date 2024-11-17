Title: How to read pdf file and write it to outputStream [closed]
Question: 
                    
            
        
            
                    
                        
                    
                
                    
                            
                                It's difficult to tell what is being asked here. This question is ambiguous, vague, incomplete, overly broad, or rhetorical and  cannot be reasonably answered in its current form. For help clarifying this question so that it can be reopened,  visit the help center.
                                
                            
                    
                
            
                Closed 10 years ago.
        


    

I need to read a pdf file with filepath "C:\file.pdf" and write it to outputStream. What is the easiest way to do that?

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfReader;

@RestController
public class ExportTlocrt {

 @Autowired
 private PhoneBookService phoneBookSer;

 @RequestMapping(value = "/exportTlocrt.html", method = RequestMethod.POST)
 public