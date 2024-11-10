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


Answer:
Here is a complete Java method that queries Google Cloud Datastore, writes the results to a CSV file in memory, and then returns a URL to download the CSV file. This method assumes you have set up your Google Cloud Datastore client and have the necessary permissions to access your Datastore entities.

```java
import com.google.api.core.http.HttpContent;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.Entity;
import