Title: How to remove leading zeros from alphanumeric text?
Question: 
                
I've seen questions on how to prefix zeros here in SO. But not the other way!

Can you guys suggest me how to remove the leading zeros in alphanumeric text? Are there any built-in APIs or do I need to write a method to trim the leading zeros?

Example:

01234 converts to 1234
0001234a converts to 1234a
001234-a converts to 1234-a
101234 remains as 101234
2509398 remains as 2509398
123z remains as 123z
000002829839 converts to 2829839

    
Answer: 
Regex is the best tool for the job; what it should be depends on the problem specification. The following removes leading zeroes, but leaves one if necessary (i.e. it wouldn't just turn "0" to a blank string).

s.replaceFirst("^0+(?!$)", "")


The ^ anchor will make sure that the 0+ being matched is at the beginning of the input. The (?!$) negative lookahead ensures that not the entire string will be matched.

Test harness:

String[] in = {
    "01234",         // "[1234]"
    "0001234a",      // "[1234a]"
    "101234",        // "[101234]"
    "000002829839",  // "[2829839]"
    "0",             // "[0]"
    "0000000",       // "[0]"
    "0000009",       // "[9]"
    "000000z",       // "[z]"
    "000000.z",      // "[.z]"
    "000000-z",      // "[-z]"
    "000000Z",       // "[Z]"
    "000000Zz",      // "[Zz]"
    "000000ZzZ",     // "[ZzZ]"
    "000000ZzZz",    // "[ZzZz]"
    "000000ZzZzz",   // "[ZzZzz]"
    "000000ZzZzzz",  // "[ZzZzzz]"
