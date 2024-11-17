Title: How to wrap a string
Question: 
                
I have a very long string like "The event for mobile" they can be any length strings ,i want to show .... after say certain length ,how to do this ?
    
Answer: 
You can do something like this - 

    String str = "The event for mobile is here";
    String temp = "";
    if(str !=null && str.length() > 10) {
        temp = str.substring(0, 10) + "...."; // here 0 is start index and 10 is last index
    } else {
        temp = str;
    }
    System.out.println(temp);


output would be - The event ....
    
Code:     String str = "The event for mobile is here";
    String temp = "";
    if(str !=null && str.length() > 10) {
        temp = str.substring(0, 10) + "...."; // here 0 is start index and 10 is last index
    } else {
        temp = str;
    }
    System.out.println(temp);

Complete the code as a full Java method.

    public String wrapString(String str, int length) {
        String temp = "";
        if(str !=null && str.length() > length) {
            temp = str.substring(0, length) + "...."; // here 0 is start index and length is last index
        } else {
            temp = str;
        }
        return temp;
    }

Now you can call the method like this -

    String str = "The event for mobile is here";
    String temp = wrapString(str, 10);
    System.out.println(temp);

This will give you the same output as before.