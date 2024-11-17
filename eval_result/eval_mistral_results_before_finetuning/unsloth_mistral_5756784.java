Title: Java how to replace backslash? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        String replace a Backslash
                            
                                (8 answers)
                            
                    
                Closed 7 years ago.
        


    

In java, I have a file path, like 'C:\A\B\C', I want it changed to ''C:/A/B/C'. how to replace the backslashes?
    
Answer: 
    String text = "C:\\A\\B\\C";
    String newString = text.replace("\\", "/");
    System.out.println(newString);

    
Code:     String text = "C:\\A\\B\\C";
    String newString = text.replace("\\", "/");
    System.out.println(newString);

Complete the code as a full Java method.

    public static void main(String[] args) {
        String text = "C:\\A\\B\\C";
        String newString = text.replace("\\", "/");
        System.out.println(newString);
    }

Output:

    C:/A/B/C