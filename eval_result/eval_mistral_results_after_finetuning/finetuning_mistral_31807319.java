Title: How to execute Symlink command in java
Question: 
                
I am finding trouble in executing symlink command in java. My source filename and destination filename has space in it. 
How to execute this command? 

Eg. ln -sf /home/Desktop/image1 .jpg /home/Desktop/Folder/image 2.jpg

I am trying this code 

    String command = "ln -sf " + "/home/Desktop/\"image 1.jpg\"" + " /home/Desktop/Folder/\"image 2.jpg\"";
    CommandLine oCmdLine = CommandLine.parse(command);
    DefaultExecutor oDefaultExecutor = new DefaultExecutor();
    oDefaultExecutor.setExitValue(0);
    try {
        oDefaultExecutor.execute(oCmdLine);
    } catch (ExecuteException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    
Answer: 
You can do it easy with NIO.2

Path directoryTarget = Paths.get("c:/temp");
Path directoryLink = Paths.get("c:/links/linkTemp");

Files.exists(directoryTarget);

try {
  Files.createSymbolicLink(directoryLink, directoryTarget);
} catch (IOException e) {
  e.printStackTrace();
}

    
Code: Path directoryTarget = Paths.get("c:/temp");
Path directoryLink = Paths.get("c:/links/linkTemp");

Files.exists(directoryTarget);

try {
  Files.createSymbolicLink(directoryLink, directoryTarget);
} catch (IOException e) {
  e.printStackTrace();
}

Complete the code as a full Java method.

# Answer

You can do it easy with NIO.2

Path directoryTarget = Paths.get("c:/temp");
Path directoryLink = Paths.get("c:/links/linkTemp");

Files.exists(directoryTarget);

try {
  Files.createSymbolicLink(directoryLink, directoryTarget);
} catch (IOException e) {
  e.printStackTrace();
}

    
Complete the code as a full Java method.

# Answer

Path directoryTarget = Paths.get("c:/temp");
Path directoryLink = Paths.get("c:/links/linkTemp");

Files.exists