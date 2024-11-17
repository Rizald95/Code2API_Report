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

public String generateUUID() {
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    return randomUUIDString;
}

You can use this method to generate a GUID in your Java EE application.