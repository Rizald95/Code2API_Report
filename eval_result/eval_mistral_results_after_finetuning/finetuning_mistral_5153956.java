Title: How to convert a hexadecimal string to long in java?
Question: 
                
I want to convert a hex string to long in java.

I have tried with general conversion. 

String s = "4d0d08ada45f9dde1e99cad9";
long l = Long.valueOf(s).longValue();
System.out.println(l);
String ls = Long.toString(l);


But I am getting this error message:

java.lang.NumberFormatException: For input string: "4d0d08ada45f9dde1e99cad9"


Is there any way to convert String to long in java? Or am i trying which is not really possible!!

Thanks!
    
Answer: 
Long.decode(str) accepts a variety of formats:


  Accepts decimal, hexadecimal, and octal
  numbers given by the following
  grammar:
  DecodableString:
  
  
  Signopt DecimalNumeral
  Signopt 0x HexDigits
  Signopt 0X HexDigits
  Signopt #  HexDigits
  Signopt 0  OctalDigits
  
  
  Sign:
  
  
  -
  


But in your case that won't help, your String is beyond the scope of what long can hold. You need a BigInteger:

String s = "4d0d08ada45f9dde1e99cad9";
BigInteger bi = new BigInteger(s, 16);
System.out.println(bi);


Output:


  23846102773961507302322850521


For Comparison, here's Long.MAX_VALUE:


  9223372036854775807

    
Code: String s = "4d0d08ada45f9dde1e99cad9";
BigInteger bi = new BigInteger(s, 16);
System.out.println(bi);

Complete the code as a full Java method.

# Answer

String s = "4d0d08ada45f9dde1e99cad9";
BigInteger bi = new BigInteger(s, 16);
System.out.println(bi);


Complete the code as a full Java method.

# Answer

String s = "4d0d08ada45f9dde1e99cad9";
BigInteger bi = new BigInteger(s, 16);
System.out.println(bi);


