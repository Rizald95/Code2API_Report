Title: In Java, how do I convert a hex string to a byte[]? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Convert a string representation of a hex dump to a byte array using Java?
                            
                                (25 answers)
                            
                    
                Closed 5 years ago.
        


    

I am using the below function in Java to convert an encrypted String into hex format:

public static String toHex(byte [] buf) {
    StringBuffer strbuf = new StringBuffer(buf.length * 2);
    int i;
    for (i = 0; i < buf.length; i++) {
        if (((int) buf[i] & 0xff) < 0x10) {
            strbuf.append("0");
        }
        strbuf.append(Long.toString((int) buf[i] & 0xff, 16));
    }
    return strbuf.toString();
}


Now I want to convert that hex string back into a byte array. How can I do that?

For example,

(1) Plain Text = 123
(2) Encrypted Text = «h>kq*«¬Mí“~èåZ  \}?
(3) Encrypted Text in Hex = f263575e7b00a977a8e9a37e08b9c215feb9bfb2f992b2b8f11e


I can go from (2) to (3), but how do I go from (3) back to (2)?
    
Answer: 
 String s="f263575e7b00a977a8e9a37e08b9c215feb9bfb2f992b2b8f11e";
 byte[] bytes = new BigInteger(s, 16).toByteArray();

A:

You can use BigInteger to parse the hex string into a byte array:
String s = "f263575e7b00a977a8e9a37e08b9c215feb9bfb2f992b2b8f11e";
byte[] bytes = new BigInteger(s, 16).toByteArray();

A:

You can use BigInteger to parse the hex string into a byte array:
String s = "f263575e7b0