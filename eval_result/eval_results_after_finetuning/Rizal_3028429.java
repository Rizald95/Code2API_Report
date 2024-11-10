Title: How to convert BigInteger to String in java
Question: 
                
I converted a String to BigInteger as follows:

Scanner sc=new Scanner(System.in);
System.out.println("enter the message");
String msg=sc.next();
byte[] bytemsg=msg.getBytes();
BigInteger m=new BigInteger(bytemsg); 


Now I want my string back. I'm using m.toString() but that's giving me the desired result.

Why? Where is the bug and what can I do about it?
    
Answer: 
You want to use BigInteger.toByteArray()

String msg = "Hello there!";
BigInteger bi = new BigInteger(msg.getBytes());
System.out.println(new String(bi.toByteArray())); // prints "Hello there!"


The way I understand it is that you're doing the following transformations:

  String  -----------------> byte[] ------------------> BigInteger
          String.getBytes()         BigInteger(byte[])


And you want the reverse:

  BigInteger ------------------------> byte[] ------------------> String
             BigInteger.toByteArray()          String(byte[])


Note that you probably want to use overloads of String.getBytes() and String(byte[]) that specifies an explicit encoding, otherwise you may run into encoding issues.
    
Code: String msg = "Hello there!";
BigInteger bi = new BigInteger(msg.getBytes());
System.out.println(new String(bi.toByteArray())); // prints "Hello there!"

Complete the code as a full Java method.

# Answer
You can convert BigInteger to String as follows:

String myBigInteger = "12345678901234567890";
BigInteger number = new BigInteger(myBigInteger);

char[] digits = new char[number.toString().length()];

for (int i = 0; i < digits.length; i++) {
    digits[i] = number.toString().charAt(i);
}

String myNumber = new String(digits);

System.out.println(myNumber);



You can have a full Java method as follows:

public