Title: How to search a particular character from string and find how many times it occured [closed]
Question: 
                    
            
        
            
                    
                        
                    
                
                    
                            
                                It's difficult to tell what is being asked here. This question is ambiguous, vague, incomplete, overly broad, or rhetorical and  cannot be reasonably answered in its current form. For help clarifying this question so that it can be reopened,  visit the help center.
                                
                            
                    
                
            
                Closed 10 years ago.
        


    

Store the following sentence in String

“JAVA IS TOUGH LANGUAGE" 


I would like to ask a user to provide a character as an input and then print the total number of occurrence of that character in the above sentence. Moreover if a user wants to search a particular phrase or character in string he/she should able to search it.

Please tell me the simple way of beginners.
    
Answer: 
  String s ="JAVA IS TOUGH LANGUAGE";
       char c ='A'; //character c is static...can be modified to accept user input
    int cnt =0;
    for(int i=0;i<s.length();i++)
        if(s.charAt(i)==c)
            cnt++;
    System.out.println("No of Occurences of character "+c+"is"+cnt);

    
Code:   String s ="JAVA IS TOUGH LANGUAGE";
       char c ='A'; //character c is static...can be modified to accept user input
    int cnt =0;
    for(int i=0;i<s.length();i++)
        if(s.charAt(i)==c)
            cnt++;
    System.out.println("No of Occurences of character "+c+"is"+cnt);

Complete the code as a full Java method.

    public static void main(String[] args) {
        String s ="JAVA IS TOUGH LANGUAGE";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to search");
        char c = sc.next().charAt(0);
        int cnt =0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==c)
                cnt++;
        System.out.println("No of Occurences of character "+c+"is"+cnt);
    }

This code will take user input and