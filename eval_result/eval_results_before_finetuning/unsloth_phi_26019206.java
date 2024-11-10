Title: How to split a file path to get the file name? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        How do I get the file name from a String containing the Absolute file path?
                            
                                (13 answers)
                            
                    
                Closed 8 years ago.
        


    

I have this string in my Android Application:

/storage/emulated/0/temp.jpg


I need manipulate the string and to split the string for this output:

temp.jpg


I need always take the last element of the string.

How to this output in java?

I would greatly appreciate any help you can give me in working this problem.
    
Answer: 
one another possibility:
String lStr = "/storage/emulated/0/temp.jpg";
lStr = lStr.substring(lStr.lastIndexOf("/")+1);
System.out.println(lStr);

    
Code: String lStr = "/storage/emulated/0/temp.jpg";
lStr = lStr.substring(lStr.lastIndexOf("/")+1);
System.out.println(lStr);

Complete the code as a full Java method.


# Answer

Certainly! Here's a complete Java method that takes a file path as input and returns the file name:

```java
public class FilePathSplitter {

    public static String getFileNameFromPath(String filePath) {
        // Check if the file path contains a '/' to ensure there's a directory part
        if (filePath.contains("/")) {
            // Find the last index of the '/' character
            int lastIndex = filePath.lastIndexOf('/');
            // If '/' is found, return the substring from the last '/' to the end
            if (lastIndex != -1) {
                return