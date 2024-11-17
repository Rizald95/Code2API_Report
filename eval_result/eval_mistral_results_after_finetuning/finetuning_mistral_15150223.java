Title: How to check that a string contains characters other than those specified. (in Java) [closed]
Question: 
                    
            
        
            
                    
                        
                    
                
                    
                            
                                It's difficult to tell what is being asked here. This question is ambiguous, vague, incomplete, overly broad, or rhetorical and  cannot be reasonably answered in its current form. For help clarifying this question so that it can be reopened,  visit the help center.
                                
                            
                    
                
            
                Closed 10 years ago.
        


    

I have a program that asks the user to input a three character string. The string can only be a combination of a, b, or c. 

How do I check if the string contains any other characters than those specified without doing a million conditional statements.

Pseudo example:

String s = "abq"

if (s.containsOtherCharacterThan(a,b,c))
    System.exit(-1)

    
Answer: 
To look for characters that are NOT a, b, or c, use something like the following:

if(!s.matches("[abc]+"))
{
    System.out.println("The string you entered has some incorrect characters");
}

    
Code: if(!s.matches("[abc]+"))
{
    System.out.println("The string you entered has some incorrect characters");
}

Complete the code as a full Java method.

# Answer

You can use the POSIX character classes (see here):

if(!s.matches("[abc]*$"))
{
    System.out.println("The string you entered has some incorrect characters");
}

    
Code: if(!s.matches("[abc]*$"))
{
    System.out.println("The string you enter has some incorrect characters");
}

Complete the code as a full Java method.

# Answer

You can use POSIX character classes (see here):

String alphaExp = "abc";
String userString = "abcd";

boolean alphaCheck = userString.matches("^" +