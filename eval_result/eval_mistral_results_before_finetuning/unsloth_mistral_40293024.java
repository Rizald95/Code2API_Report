Title: How to export queried data from Google Cloud Datastore to csv using Java?
Question: 
                
I have a use case where I need to perform the querying operation on the data stored in Google Cloud Datastore and display the results and provide a download link to the csv file of the same data.

I had gone through different documentations, but it dealt mostly with python whereas my implementation is in Java.

Please guide.
    
Answer: 
Here is one possible way: you build your csv file in memory in a Cloud Endpoint by querying the Cloud datastore and print to a ByteArrayOutputStream, as shown hereafter:

ByteArrayOutputStream csvOS = new ByteArrayOutputStream();
PrintStream printer = new PrintStream(csvOS);
printer.println("L1C1;L1C2;L1C3");
printer.println("L2C1;L2C2;L2C3");
printer.close();


Then you save the csv file to Cloud Storage and return the URL for downloading it, as I explained in the following answer:

https://stackoverflow.com/a/37603225/3371862  

An other possibility would be to stream the result through a Google App Engine servlet (i.e. you don't go through Cloud Endpoints). Have a look at how to write csv file in google app by using java
    
Code: ByteArrayOutputStream csvOS = new ByteArrayOutputStream();
PrintStream printer = new PrintStream(csvOS);
printer.println("L1C1;L1C2;L1C3");
printer.println("L2C1;L2C2;L2C3");
printer.close();

Complete the code as a full Java method.

```java
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.appengine.api.blobstore.BlobInfoFactory;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api