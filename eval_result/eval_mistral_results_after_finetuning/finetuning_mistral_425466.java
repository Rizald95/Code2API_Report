Title: How to check if array element is null to avoid NullPointerException in Java
Question: 
                
I have a partially nfilled array of objects, and when I iterate through them I tried to check to see whether the selected object is null before I do other stuff with it. However, even the act of checking if it is null seem to through a NullPointerException. array.length will include all null elements as well. How do you go about checking for null elements in an array? For example in the following code will throw an NPE for me.

Object[][] someArray = new Object[5][];
for (int i=0; i<=someArray.length-1; i++) {
    if (someArray[i]!=null) { //do something
    } 
}

    
Answer: 
You have more going on than you said.  I ran the following expanded test from your example:

public class test {

    public static void main(String[] args) {
        Object[][] someArray = new Object[5][];
        someArray[0] = new Object[10];
        someArray[1] = null;
        someArray[2] = new Object[1];
        someArray[3] = null;
        someArray[4] = new Object[5];

        for (int i=0; i<=someArray.length-1; i++) {
            if (someArray[i] != null) {
                System.out.println("not null");
            } else {
                System.out.println("null");
            }
        }
    }
}


and got the expected output:

$ /cygdrive/c/Program\ Files/Java/jdk1.6.0_03/bin/java -cp . test
not null
null
not null
null
not null


Are you possibly trying to check the lengths of someArray[index]?
    
Code: public class test {

    public static void main(String[] args) {
        Object[][] someArray = new Object[5][];
        someArray[0] = new Object[10];
        someArray[1] = null;
        someArray[2] = new Object[1];
        someArray[3] = null;
        someArray[4] = new Object[5];

        for (int i=0; i<=someArray.length-1; i++) {
            if (someArray[i] != null) {
                System.out.println("not null");
            } else {
                System.out.println("null");
            }
        }
    }
}

Complete the code as a full Java method.

# Answer

You can check the length of the array at each index.

Object[][] someArray = new Object[5][];
some