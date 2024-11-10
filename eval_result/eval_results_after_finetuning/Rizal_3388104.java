Title: how to create GUID in java EE
Question: 
                
i want to know how to create GUID number in java ee , i am using jboss 4.2.3
    
Answer: 
import java.util.UUID;

UUID uuid = UUID.randomUUID();

String randomUUIDString = uuid.toString();

    
Code: import java.util.UUID;

UUID uuid = UUID.randomUUID();

String randomUUIDString = uuid.toString();

Complete the code as a full Java method.

# Answer

You can create a full Java method as follows:

    import java.util.UUID;

    public class Main {
     
     public static String createUUID() {
      UUID uuid = UUID.randomUUID();
      String randomUUIDString = uuid.toString();
      return randomUUIDString;
     }
    
     public static void main(String args[]) {
      System.out.println(createUUID());
    
     }
    }

You can run the above code as a Java method in a Java class.

Cheekk it out.

Hope it helps.
