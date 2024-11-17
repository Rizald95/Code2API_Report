Title: How to round 0.745 to 0.75 using BigDecimal.ROUND_HALF_UP?
Question: 
                
I tried the following,

   double doubleVal = 1.745;
   double doubleVal1 = 0.745;
   BigDecimal bdTest = new BigDecimal(  doubleVal);
   BigDecimal bdTest1 = new BigDecimal(  doubleVal1 );
   bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
   bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
   System.out.println("bdTest:"+bdTest); //1.75
   System.out.println("bdTest1:"+bdTest1);//0.74    problemmmm ????????????  


but got weird results. Why?
    
Answer: 
Never construct BigDecimals from floats or doubles. Construct them from ints or strings. floats and doubles loose precision.

This code works as expected (I just changed the type from double to String):

public static void main(String[] args) {
  String doubleVal = "1.745";
  String doubleVal1 = "0.745";
  BigDecimal bdTest = new BigDecimal(  doubleVal);
  BigDecimal bdTest1 = new BigDecimal(  doubleVal1 );
  bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
  bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
  System.out.println("bdTest:"+bdTest); //1.75
  System.out.println("bdTest1:"+bdTest1);//0.75, no problem
}

    
Code: public static void main(String[] args) {
  String doubleVal = "1.745";
  String doubleVal1 = "0.745";
  BigDecimal bdTest = new BigDecimal(  doubleVal);
  BigDecimal bdTest1 = new BigDecimal(  doubleVal1 );
  bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
  bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
  System.out.println("bdTest:"+bdTest); //1.75
  System.out.println("bdTest1:"+bdTest1);//0.75, no problem
}

Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your answer.

