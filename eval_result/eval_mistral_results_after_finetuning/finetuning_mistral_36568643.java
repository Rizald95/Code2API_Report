Title: How to create a sequence of numbers in java
Question: 
                
I want to create a sequence of numbers in Java like this :
1234957203969304597600234960702349100903450234847456282934857697900389262454869346

I want to create 1000 numbers in the sequence.
How can I do it?
I tried to do like this :
String seq = null;
for (int i = 0; i < 1000; i++) {
    seq = String.format("%d",i);
}
System.out.println(seq);

It does not work, it prints out:

999

    
Answer: 
StringBuilder sb = new StringBuilder();
for (int i=0; i<1000; i++) {
  sb.append(i);
}
System.out.println(sb.toString());


As a general note, while str = str + someString; will work, inside a loop it can quickly get out of hand. Try it with 10000 iterations and you'll see (large amounts of RAM & CPU consumed).

StringBuilder is better, if one really needs to build a string in this way, and it's always better performace-wise when one is appending to a character sequence more than a couple of times.
    
Code: StringBuilder sb = new StringBuilder();
for (int i=0; i<1000; i++) {
  sb.append(i);
}
System.out.println(sb.toString());

Complete the code as a full Java method.

# Answer

StringBuilder sb = new StringBuilder();
for (int i=0; i<1000; i++) {
  sb.append(i);
  sb.append(' ');
}
System.out.println(sb.toString().trim());

    
Code the answer as a full Java method.

# Answer

StringBuilder sb = new StringBuilder();
for (int i=0; i<1000; i++) {
  sb.append(i);
  sb.append(' ');
}
System.out.println(sb.toString().trim());

Complete the code as a full Java method.

