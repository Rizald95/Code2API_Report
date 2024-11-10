Title: How to split the strings in a file and read them?
Question: 
                
I have a file with information in it. It looks like:

    Michael 19 180 Miami
    George 25 176 Washington
    William 43 188 Seattle


I want to split the lines and strings and read them. I want it to look like:

    Michael
    19
    180
    Miami
    George
    ...


i used a code like this:

    BufferedReader in = null;
    String read;
    int linenum;
    try{
        in = new BufferedReader(new FileReader("fileeditor.txt")); 
    }
    catch (FileNotFoundException e) {System.out.println("There was a problem: " + e);}
    try{
        for (linenum = 0; linenum<100; linenum++){
            read = in.readLine();
            if(read == null){} 
            else{
                String[] splited = read.split("\\s+");
                System.out.println(splited[linenum]);
           }
       }
    }
    catch (IOException e) {System.out.println("There was a problem: " + e);} 
}


What this gave me was 

    Michael
    25
    188


I think its probably an issue with my for loop but I'm not very advanced in programming and I'll appreciate help. Thanks.
    
Answer: 
You're part way there which is great.

When reading a file, the Reader will return null when it reaches the end of the stream, meaning nothing else is available to be read.  Your current approach means that you want to read at least 100 lines, but no more...this will become problematic in the future if you file size increases...it's also somewhat wasteful

Instead, we should use the fact a null value indicates the end of the file..

When you split a line, it will contain a number of elements.  You are using the linenum variable to print these.  The problem is, you've already read and split the line, so linenum will be the number of elements in the array, not the index of the element.

Here's a revised version of your code:

```java
BufferedReader in = null;
String read;
try {
    in = new BufferedReader(new FileReader("fileeditor.txt"));
} catch (FileNotFoundException e) {
    System.out.println("There was a problem: " + e);
}
try {
    while ((read = in.readLine()) != null) {
        String[] splited = read.split("\\s+");
        for (int i = 0; i < splited.length; i