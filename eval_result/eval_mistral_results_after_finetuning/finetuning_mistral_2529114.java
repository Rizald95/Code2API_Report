Title: How do I sort strings that contain numbers in Java
Question: 
                
I want to sort a String that has nr. How do I do that?

Lets say my integers are

Class2
"3"
"4"
"1"


in main I do  class2.Sort();

Thanks in Advance.
    
Answer: 
  public static void main(String[] args)
  {
    String string = "3 42 \n   11   \t  7  dsfss  365          \r   1";
    String[] numbers = string.split("\\D+");
    Arrays.sort(numbers, new Comparator<String>()
    {
      public int compare(String s1, String s2)
      {
        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
      }
    });
    System.out.println(Arrays.toString(numbers));
  }

    
Code:   public static void main(String[] args)
  {
    String string = "3 42 \n   11   \t  7  dsfss  365          \r   1";
    String[] numbers = string.split("\\D+");
    Arrays.sort(numbers, new Comparator<String>()
    {
      public int compare(String s1, String s2)
      {
        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
      }
    });
    System.out.println(Arrays.toString(numbers));
  }

Complete the code as a full Java method.

# Answer

You can use the Integer.parseInt() method to convert the string to integer and then use Collections.sort() method.

Here is the complete the code as a full Java method.

# Answer

You can use the Integer.parseInt() method to convert the string to integer and then use Collections.sort() method.

Here is the complete the code as a full Java method.

    
Complete the code as a full Java method.

# Answer

You can use the Integer.parseInt() method to convert the string to integer and then use Collections.sort() method.

Here is the complete the code as a full Java method.

    
An