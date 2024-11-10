Title: How can i get in desending order? please suggest
Question: 
                
I am trying to write a program where user provide the input, and  output should be in descending order leaving the string in same position . eg: if input is 3,p,11,.,4,# output should be 11,p,4,.,3,#. I have tried this.

String input = JOptionPane.showInputDialog("Enter a string:");
String[] abc = input.split(",");
ArrayList<Integer> num = new ArrayList<Integer>();
for (int i = 0; i < abc.length; i++) {
 num.add(Integer.parseInt(abc[i]));
 for ( int z = 0; z < num.size() - 1; z ++ ) {
 int numI;
  try { numI = Integer.parseInt( num.get(z)); 
  }
 catch (NumberFormatException nfe) { continue; }
 for (int j = z + 1; j < num.size(); j ++ ){
 int numJ;
 try { numJ = Integer.parseInt(num.get(z));
 } 
 catch (NumberFormatException nfe) { continue; }
 if (numI < numJ) {
 Integer temp = num.get(z);//swapping
 num.put(z, num.get(j));
 num.put(j, temp);   
 }

 }


What is wrong? please suggest
    
Answer: 
Here is a simple solution based on bubble sort:

public static void main(final String[] args) {

        final String input = args[0];

        final String[] tokens = input.split(",");

        for (int i = 0 ; i < tokens.length ; i++) {
            for (int j = i + 1 ; j < tokens.length ; j++) {
                String left = tokens[i];
                String right = tokens[j];
                if (isNumber(left) && isNumber(right)) {
                    int lNum = Integer.valueOf(left);
                    int rNum = Integer.valueOf(right);
                    if (lNum < rNum) {
                        swap(tokens, i, j);
                    }
                }
            }
        }

        System.out.println(Arrays.toString(tokens));
    }

    private static boolean isNumber(final String s) {
        try {
            Integer.valueOf(s);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static void swap(final String[] array, final int i , final int j) {
        final String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
   