

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

You can use the instanceOf operator (Object o1 instanceof Object o2) in Java.

Complete the code as a full Java method.

import java.util.ArrayList;

public class TypeTest {
    public static void main(String args[]) {
        ArrayList<String> ar1=new ArrayList<String>();
        ArrayList<Character> obj = new ArrayList<Character>();
        if(obj instanceof ArrayList)
            System.out.println("My problem Solved");
    }
}


You can refer following link for more details: http://www.javapractices.com/index.php?pg=instanceof


