Title: How to run Windows commands in JAVA and return the result text as a string [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                Closed 11 years ago.
        


    


  Possible Duplicate:
  Get output from a process
  Executing DOS commands from Java  




I am trying to run a cmd command from within a JAVA console program e.g.:

ver


and then return the output of the command into a string in JAVA e.g. output:

string result = "Windows NT 5.1"

    
Answer: 
You can use the following code for this    

import java.io.*; 

    public class doscmd 
    { 
        public static void main(String args[]) 
        { 
            try 
            { 
                Process p=Runtime.getRuntime().exec("cmd /c dir"); 
                p.waitFor(); 
                BufferedReader reader=new BufferedReader(
                    new InputStreamReader(p.getInputStream())
                ); 
                String line; 
                while((line = reader.readLine()) != null) 
                { 
                    System.out.println(line);
                } 

            }
            catch(IOException e1) {e1.printStackTrace();} 
            catch(InterruptedException e2) {e2.printStackTrace();} 

            System.out.println("Done"); 
        } 
    }

    
Code: import java.io.*; 

    public class doscmd 
    { 
        public static void main(String args[]) 
        { 
            try 
            { 
                Process p=Runtime.getRuntime().exec("cmd /c dir"); 
                p.waitFor(); 
                BufferedReader reader=new BufferedReader(
                    new InputStreamReader(p.getInputStream())
                ); 
                String line; 
                while((line = reader.readLine()) != null) 
                { 
                    System.out.println(line);
                } 

            }
            catch(IOException e1) {e1.printStackTrace();} 
            catch(InterruptedException e2) {e2.printStackTrace();} 

            System.out.println("Done"); 
        } 
    }

































































