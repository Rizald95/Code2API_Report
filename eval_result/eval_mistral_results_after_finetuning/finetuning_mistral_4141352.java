Title: How to convert byte array into Human readable format?
Question: 
                
I am using "Blowfish" algorithm to encrypt and decrypt the contents of the text. I am embedding the encrypted contents in the image but while extracting I am getting the byte array which I am passing it to method update of class Cipher.   

But the method returns me byte array which I want to convert back into Human readable form.
When I use write method of FileOutputStream it is working fine when a filename is provided.
But now I want to print it on the console in the human readable format.  How to get through this? I have tried for ByteArrayOutputStream too. But didn't work well.  

Thank you.
    
Answer: 
byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};

String value = new String(byteArray);

    
Code: byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};

String value = new String(byteArray);

Complete the code as a full Java method.

# Answer

You can convert byte array to hexadecimal string and then print that on console.

    
Code: byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};

String byteArrayInHex = ByteToHexConverter.byteArrayToHex(byteArray);

System.out.println(byteArrayInHex);

Complete the code as a full Java method.

You can use the following code as a full Java method.

    
Code: byte[] byteArray = new byte[] {87, 79, 87, 46