Title: How to initialise BigInteger after creating instantces (constructor can't be called)
Question: 
                
Imagine an instance of BigInteger, then how to initialize it after creating instance?

For example:

BigInteger t = new BigInteger();


How to put a value in t?

If the constructor cannot be called, then what can be done, to put the value in the object?
    
Answer: 
I'm not 100% sure of what specifically is confusing you as you'd initialize the items in the BigInteger array as you would any other object array. e.g.,

  BigInteger t2 [] = new BigInteger[2];

  t2[0] = new BigInteger("2");
  t2[1] = BigInteger.ZERO; // ZERO, ONE, and TEN are defined by constants

  // or

  BigInteger[] t3 = {new BigInteger("2"), BigInteger.ZERO};


Edit 1:
Ah, now I understand your problem: you want to create a BigInteger instance and then later set its value.  The answer is the same as for Strings: you can't, and that it is because BigIntegers like Strings are immutable and can't be changed once created. For this reason the class has no "setter" methods. The way to change the value of a BigInteger variable is to set it to a new BigInteger instance.
    
Code:   BigInteger t2 [] = new BigInteger[2];

  t2[0] = new BigInteger("2");
  t2[1] = BigInteger.ZERO; // ZERO, ONE, and TEN are defined by constants

  // or

  BigInteger[] t3 = {new BigInteger("2"), BigInteger.ZERO};

Complete the code as a full Java method.

    public static void main(String[] args) {
        BigInteger t2 [] = new BigInteger[2];
        t2[0] = new BigInteger("2");
        t2[1] = BigInteger.ZERO; // ZERO, ONE, and TEN are defined by constants

        // or

        BigInteger[] t3 = {new BigInteger("2"), BigInteger.ZERO};
    }


Edit 2:

I've added a bit more detail to my answer.

Edit 3:

I've added a code example.