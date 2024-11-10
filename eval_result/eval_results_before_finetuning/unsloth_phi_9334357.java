Title: How can I list the available Cipher algorithms?
Question: 
                
I am getting a Cipher implementation with Cipher.getInstance(String algorithm).  I am under the impression that the available algorithm names that I may pass differ based on what libraries which are present in my classpath.

I would like to write a simple program that I can run with different classpaths that will list the available Cipher algorithm names.  What method would I need to call to get this list?
    
Answer: 
Once I have a list of providers, as described in JB Nizet's post, I still don't have a list of algorithms.  I found that each Provider functions as a Properties object, and the Properties encode the algorithm names.  I'm not entirely clear on if this is the correct way to look for them or not, and what exactly all the other properties mean, but I just wrote a routine that spewed all properties to System.out and grepped for various strings describing what I was looking for until I found it.

import java.security.*;

for (Provider provider: Security.getProviders()) {
  System.out.println(provider.getName());
  for (String key: provider.stringPropertyNames())
    System.out.println("\t" + key + "\t" + provider.getProperty(key));
}

    
Code: import java.security.*;

for (Provider provider: Security.getProviders()) {
  System.out.println(provider.getName());
  for (String key: provider.stringPropertyNames())
    System.out.println("\t" + key + "\t" + provider.getProperty(key));
}

Complete the code as a full Java method.

import java.security.*;

public class CipherAlgorithms {

    public static void listAvailableCipherAlgorithms() {
        for (Provider provider: Security.getProviders()) {
            System.out.println(provider.getName());
            for (String key: provider.stringPropertyNames()) {
                System.out.println("\t" + key + "\t" + provider.getProperty(key));
            }
        }
    }

    public static void main(String[] args) {
        listAvailableCipherAlgorithms();
    }
}


