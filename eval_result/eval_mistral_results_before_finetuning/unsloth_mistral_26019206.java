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

```
public String getFileName(String filePath) {
    return filePath.substring(filePath.lastIndexOf("/") + 1);
}
```

This method takes a string as an argument, finds the last occurrence of the "/" character, and returns the substring starting from the position after the last "/" character.

You can call this method with your example string like this:

```
String filePath = "/storage/emulated/0/temp.jpg";
String fileName = getFileName(filePath);
System.out.println(fileName);
```

This will output "temp.jpg".