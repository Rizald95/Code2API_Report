Title: How can check if we can cast an object to another?
Question: 
                
How can check if we can cast an object to another?
I have an object that it is an Arraylist of instances of an class that can be dynamically in 2 other class. How can I check that I can cast my object to each of them Arraylist class?
For example:

My classes are class1, class2 and class3.
My object is obj.

I want check it:
ArrayList<class1> ar1=new Arraylist<class1>();
ar1=(ArrayList<class1>)obj;

How can I check if it can be true or false?
    
Answer: 
Something like this :-

import java.util.ArrayList;

public class qu
{
    public static void main(String args[])
    {
        ArrayList<String> ar1=new ArrayList<String>();
        ArrayList<Character> obj = new ArrayList<Character>();
        if(obj instanceof java.util.ArrayList)
            System.out.println("My problem Solved");
    }
}

    
Code: import java.util.ArrayList;

public class qu
{
    public static void main(String args[])
    {
        ArrayList<String> ar1=new ArrayList<String>();
        ArrayList<Character> obj = new ArrayList<Character>();
        if(obj instanceof java.util.ArrayList)
            System.out.println("My problem Solved");
    }
}

Complete the code as a full Java method.

# Answer

You can use the instanceof operator.

    
Code: ArrayList<String> ar1=new ArrayList<String>();
ArrayList<Character> obj = new ArrayList<Character>();
if(obj instanceof java.util.ArrayList)
    System.out.println("My problem Solved");

# Answer

You can use the instanceof operator.

    
Code: ArrayList<String> ar1=new ArrayList<String>();
ArrayList<Character> obj = new ArrayList<Character>();
if(obj instanceof java.util.ArrayList)
    System.out.println("My problem Solved");

Complete the code as a full Java method.

# Answer
