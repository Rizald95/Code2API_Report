Title: How to create variables dynamically in Java? [closed]
Question: 
                    
            
        
            
                
                    
                            
                                Closed. This question does not meet Stack Overflow guidelines. It is not currently accepting answers.
                                
                            
                    
                
            
        
            
        
            
                
                        
                            
                        
                     Questions asking for code must demonstrate a minimal understanding of the problem being solved. Include attempted solutions, why they didn't work, and the expected results. See also: Stack Overflow question checklist
                
                    
                        Closed 9 years ago.
                    
                

                
            
        
            
                    
                        Improve this question
                    
            


    

I need to create new variables Strings such that

String person1 = "female";
String person2 = "female";
........
........
String person60 = "male";
........
String person100 = "male";


This is what I tried

for (int i = 1; i <101; i++) {
  if (i<60) {
    String person+i = "female";
  }
  else {
    String person+i = "male";   
  }
}


Can anybody help me correct this code?
    
Answer: 
A Map allows you to relate any key with any value. In this case, the key is the name of the variable, and the value is the value

Map<String, String> details = new HashMap<>();
for (int i = 1; i <101; i++) {
    if (i<60) {
        details.put("person" + i, "female");
    }
    else {
        details.put("person" + i, "male");
    }
}

    
Code: Map<String, String> details = new HashMap<>();
for (int i = 1; i <101; i++) {
    if (i<60) {
        details.put("person" + i, "female");
    }
    else {
        details.put("person" + i, "male");
    }
}


A: You can't create variables dynamically in Java.
You can use a Map to store the values.
Map<String, String> details = new HashMap<>();
for (int i = 1; i <101; i++) {
    if (i<60) {
        details.put("person" + i, "female");
    }
    else {
        details