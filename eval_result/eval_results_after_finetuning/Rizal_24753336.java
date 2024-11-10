Title: How to split a double number by dot into two decimal numbers in Java?
Question: 
                
Trying to split a double number into two decimal parts by dot. Like  this: 1.9 into 1 and 9; 0.16 into  0 and 16;

Here's what I do, but seems a little redundant, what's the best way to do this?

The origin number will always be like Just 0.x or 1.x or 0.xx or 1.xx and xx > 10 

    double d = 1.9;
    int a, b;
    String dString = Double.toString(d);
    String aString = dString.substring(0, 1);

    String bString = dString.substring(2);
    a = Integer.parseInt(aString);
    b = Integer.parseInt(bString);


My way of doing this seems using to much String conversion,which I don't think is very efficient. 
    
Answer: 
You can try this way too

    double val=1.9;
    String[] arr=String.valueOf(val).split("\\.");
    int[] intArr=new int[2];
    intArr[0]=Integer.parseInt(arr[0]); // 1
    intArr[1]=Integer.parseInt(arr[1]); // 9

    
Code:     double val=1.9;
    String[] arr=String.valueOf(val).split("\\.");
    int[] intArr=new int[2];
    intArr[0]=Integer.parseInt(arr[0]); // 1
    intArr[1]=Integer.parseInt(arr[1]); // 9

Complete the code as a full Java method.

# Answer
You can try this way too.

    public class Test{
        public static void main(String args[]){
            double val=1.9;
            String[] arr=String.valueOf(val).split("\\.");
            int[] intArr=new int[2];
            intArr[0]=Integer.parseInt(arr[0]); // 1
            intArr[1]=Integer.parseInt(arr[1]); // 9
            System.out.println(intArr[0]+" "+intArr[1]);
        }
    }


Complete the code as a full Java method.


# Answer
Complete the code