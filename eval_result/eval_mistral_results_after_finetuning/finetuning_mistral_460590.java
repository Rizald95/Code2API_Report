Title: How to mix java webstart with RMI?
Question: 
                
I want to distribute a webstart application which uses RMI.

I want to avoid to ask the user the address of the RMI server, because the website that distributes the application is also the RMI server.

Furthermore, I don't know the address of the server at build time, therefore the address must be added with ad hoc configuration to the JNLP, or the address must be provided at execution time. This is the preferred way: is it possible to do so?
    
Answer: 
I haven't used Java RMI exactly (I've only used Java Web Start with Hessian binary protocol for doing something like RMI), but at least the part of passing the server address to the Web Start client app should be easy. When you generate the JNLP file in your application, add the address as a property: 

<jnlp>
  [...]
  <resources>
    [...]
    <property name="serverAddress" value="..." />
  </resources>
</jnlp>


Then, in client code read that property:

String serverAddress = System.getProperty("serverAddress");


I assume here the website that distributes the application knows its own address :)

Edit (with the additional limitation of not knowing address at build time): Hmm, Is the website distributing the app a dynamic or static one? 


dynamic: either generate whole JNLP dynamically (with a JSP page or dom4j or whatever), or read the "template" JNLP XML file and replace the real server address in place 
static: I guess the person who deploys the site has to manually configure the right address in the JNLP file?

    
Code: <jnlp>
  [...]
  <resources>
    [...]
    <property name="serverAddress" value="..." />
  </resources>
</jnlp>

Complete the code as a full Java method.

# Answer

String serverAddress = System.getProperty("serverAddress");


Return the full Java method as a complete code answer.

# Answer

String serverAddress = System.getProperty("serverAddress");


Complete the code as a full Java method.

    
Answer: String serverAddress = System.getProperty("serverAddress");

Complete the code as a full Java method.

# Answer

String serverAddress = System.getProperty("serverAddress");


Complete the code as a full Java method.

    
Code String serverAddress = System.getProperty("serverAddress");

Complete the code as a full Java method.

# Answer
