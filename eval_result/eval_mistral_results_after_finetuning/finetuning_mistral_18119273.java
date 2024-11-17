Title: How to check if user input is not an int value
Question: 
                
I need to check if a user input value is not an int value. I've tried different combinations of what I know but I either get nothing or random errors

For example:

If the user inputs "adfadf 1324" it'll raise a warning message.



What I have:

       // Initialize a Scanner to read input from the command line
       Scanner sc = new Scanner(System.in);
       int integer, smallest = 0, input;
       boolean error = false;

       System.out.print("Enter an integer between 1-100: ");
       range = sc.nextInt();

       if(!sc.hasNextInt()) {

          error = true;
          System.out.println("Invalid input!");
          System.out.print("How many integers shall we compare? (Enter an integer between 1-100: ");
          sc.next();
    }

       while(error) {
          for(int ii = 1; ii <= integer; ii++) {

              ...

          } // end for loop
      }
      System.out.println("The smallest number entered was: " + smallest);

      }
  }

    
Answer: 
Simply throw Exception if input is invalid

Scanner sc=new Scanner(System.in);
try
{
  System.out.println("Please input an integer");
  //nextInt will throw InputMismatchException
  //if the next token does not match the Integer
  //regular expression, or is out of range
  int usrInput=sc.nextInt();
}
catch(InputMismatchException exception)
{
  //Print "This is not an integer"
  //when user put other than integer
  System.out.println("This is not an integer");
}

    
Code: Scanner sc=new Scanner(System.in);
try
{
  System.out.println("Please input an integer");
  //nextInt will throw InputMismatchException
  //if the next token does not match the Integer
  //regular expression, or is out of range
  int usrInput=sc.nextInt();
}
catch(InputMismatchException exception)
{
  //Print "This is not an integer"
  //when user put other than integer
  System.out.println("This is not an integer");
}

Complete the code as a full Java method.

# Answer

You can use Scanner's nextLine() and nextInt() methods in a loop and check if nextLine returns a value after nextInt. If it does, it means the nextInt could not be completed as an integer.

    
Code: Scanner scan = new Scanner(System.