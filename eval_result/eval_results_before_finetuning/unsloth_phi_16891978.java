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


public class PDFReaderWriter {

    public static void main(String[] args) {
        try {
            // Read the PDF file
            File pdfFile = new File("C:\\file.pdf");
            FileInputStream fis = new FileInputStream(pdfFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            // Create an output stream to write the data to
            FileOutputStream fos = new FileOutputStream("C:\\output.pdf");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            // Copy the data from the input stream to the output stream
            int byteCount;
            byte[] buffer = new byte[1