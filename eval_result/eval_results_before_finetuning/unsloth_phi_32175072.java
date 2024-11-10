Title: how to convert Base64 to String in java (For pdf)
Question: 
                
I want to convert pdf to base64,thene again convert base64 to pdf.
For this I converted  my pdf to base64. And I am trying to convert Base64 to string usin java.But it gives wrong output.

My source code 

 byte[] decodedBytes = Base64.decodeBase64(encodedstr);
 OutputStream file = new FileOutputStream(f);
 Document document = new Document();
 PdfWriter.getInstance(document, file);
 document.open();
 document.add(new Paragraph(new String(decodedBytes)));
 document.close();
 file.close();


Where encodedstr is 

 JVBERi0xLjUKMSAwIG9iago8PC9UeXBlIC9QYWdlcwovS2lkcyBbMyAwIFJdCi9Db3Vu dCAxPj4KZW5kb2JqCjMgMCBvYmoKPDwvVHlwZSAvUGFnZQovUGFyZW50IDEgMCBSCi9N ZWRpYUJveCBbMCAwIDU5NS4yOCA4NDEuODldCi9SZXNvdXJjZXMgMiAwIFIKL1JvdGF0 ZSAwCi9Db250ZW50cyA0IDAgUj4+CmVuZG9iago0IDAgb2JqCjw8L0xlbmd0aCA1Nzkx Pj4Kc3RyZWFtCkJUIC9GMSA5LjAwIFRmIEVUCjAgVHIKL0dTMCBncwowIFR3IDAgVGMg MTAwIFR6IDAgVEwgCkJUIC9GMSAxNC4wMCBUZiBFVApxIDAgMCAwIHJnIEJUIDMxLjE5 IDc5My43NSBUZCAoRWNvbm9teSBUZiBkZSBUZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiBkZiB